package member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = null;
        ConsoleUtil util = new ConsoleUtil();
        boolean run = true;
        while (run) {
            System.out.println("==================== Member ====================");
            System.out.println("1. member추가");
            System.out.println("2. member수정");
            System.out.println("3. member삭제");
            System.out.println("4. member조회");
            System.out.println("5. member전체조회");
            System.out.println("6. 프로그램종료");
            System.out.println("================================================");

            System.out.print("메뉴 선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    MemberDTO dto = util.memberInsertInto(sc);
                    int result = mDao.insert(dto);
                    util.printSuccessMessage(result);
                    break;
                case 2:
                    mDto = util.memberUpdateMenu(sc);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                        // 출력문 호출
                        util.printUpdateSuccessMessage(result, mDto.getID());
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    run = false;
                    System.out.println("프로그램을 종료합니다");
                    break;
                default:
                    break;
            }
        }
    }
}
