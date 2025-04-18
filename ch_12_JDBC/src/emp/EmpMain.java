package emp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int empNo = 0, result = 0;
        EmpDAO eDao = new EmpDAO();
        EmpDTO eDto = null;

        while (run) {
            System.out.println("=================================");
            System.out.println("1.입력");
            System.out.println("2.수정");
            System.out.println("3.삭제");
            System.out.println("4.전체조회");
            System.out.println("5.특정사원조회");
            System.out.println("6.종료");
            System.out.println("=================================");

            System.out.println("메뉴 >> ");

            int menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1:
                    eDto = insertInfo(scanner);
                    result = eDao.insert(eDto);
                    System.out.println(result > 0 ? "입력성공" : "입력실패");
                    break;
                case 2:
                    eDto = updateInfo(scanner);
                    eDao.update(eDto);
                    System.out.println(result > 0 ? "수정성공" : "수정실패");
                    break;
                case 3:
                    empNo = deleteInfo(scanner);
                    result = eDao.delete(empNo);
                    System.out.println(result > 0 ? "삭제성공" : "삭제실패");
                    break;
                case 4:
                    List<EmpDTO> list = eDao.selectALL();
                    empPrint(list);
                    break;
                case 5:
                    empNo = getRow(scanner);
                    eDto = eDao.select(empNo);
                    System.out.println(result > 0 ? "조회실패" : "조회성공");
                    System.out.println(eDto);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void empPrint(List<EmpDTO> list) {
        System.out.println("=======================================================");
        System.out.println("사번 이름 직무 매니저 번호 입사일 급여 수당 부서번호");
        System.out.println("=======================================================");

        for (EmpDTO empDTO : list) {
            System.out.println(empDTO.getEmpNo() + "\t");
            System.out.println(empDTO.getDName() + "\t");
            System.out.println(empDTO.getLob() + "\t");
            System.out.println(empDTO.getMgr() + "\t");
            System.out.println(empDTO.getHireDate() + "\t");
            System.out.println(empDTO.getSal() + "\t");
            System.out.println(empDTO.getDeptNo() + "\t\n");

        }
    }

    public static int getRow(Scanner scanner) {
        // 조회할 empno 입력받은후 리턴
        System.out.println("조회대상번호 empNo >>");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;

    }

    public static int deleteInfo(Scanner scanner) {
        // 삭제할 empno 입력받은후 리턴
        System.out.println("삭제대상번호 empNo >>");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;

    }

    public static EmpDTO updateInfo(Scanner scanner) {
        // 수정할 empno 입력받은후 리턴
        System.out.println("수정할 대상번호 empNo >>");
        int empNo = Integer.parseInt(scanner.nextLine());
        System.out.println("변경할 급여 sal >>");
        int sal = Integer.parseInt(scanner.nextLine());

        EmpDTO eDto = EmpDTO.builder().empNo(empNo).sal(sal).build();

        return eDto;

    }

    public static EmpDTO insertInfo(Scanner scanner) {

        // 새로운 사원입력
        System.out.println("사번 >>");
        int empNo = Integer.parseInt(scanner.nextLine());

        System.out.println("이름>>");
        String dName = scanner.nextLine();

        System.out.println("직무>>");
        String lob = scanner.nextLine();

        System.out.println("매니저번호 >>");
        int mgr = Integer.parseInt(scanner.nextLine());

        System.out.println("입사일 >>");
        String hiredate = scanner.nextLine();

        System.out.println("급여 >>");
        int sal = Integer.parseInt(scanner.nextLine());

        System.out.println("수당 >>");
        int comm = Integer.parseInt(scanner.nextLine());

        System.out.println("부서번호 >>");
        int deptNo = Integer.parseInt(scanner.nextLine());

        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(hiredate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        EmpDTO eDto = EmpDTO.builder()
                .empNo(empNo)
                .dName(dName)
                .lob(lob)
                .mgr(mgr)
                .hireDate(hiredate)
                .sal(sal)
                .comm(comm)
                .deptNo(deptNo)
                .build();

        return eDto;

    }
}