package member;

import java.util.List;
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
                    MemberDTO dto = util.memberInsertInfo(sc);
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
                    String id = util.memberDeleteInfo(sc);
                    result = mDao.delete(id);
                    util.printDeleteSuccessMessage(result);
                    break;
                case 4:
                    id = util.memberGetInfo(sc);
                    MemberDTO row = mDao.getRow(id);
                    if (row != null) {
                        util.memberPrint(row);
                    }
                    // 출력메소드
                    util.memberPrint(row);
                    break;
                case 5:
                    // mDao.getList() => 받은 결과 화면 출력
                    List<MemberDTO> list = mDao.getList();
                    util.memberAllPrint(list);
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
