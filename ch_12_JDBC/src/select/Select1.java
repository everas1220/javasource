package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select1 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // Connection 객체 생성
            // jdbc:oracle:thin: => Orecle 연결문자열
            // @
            // localhost => 내 컴퓨터 (== 127.0.0.1)
            // 1521 => 오라클 서버 포트번호
            // xe => 오라클 DB명
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String passward = "tiger";

            con = DriverManager.getConnection(url, user, passward);

            if (con != null) {
                System.out.println("연결되었습니다.");

                // emp 테이블 조회
                String sql = "select * from emp";
                // Statement 객체 생성
                pstmt = con.prepareStatement(sql);

                // Query 수행
                rs = pstmt.executeQuery();

                // ResultSet 객체로부터 데이터 추출
                while (rs.next()) {
                    // number => int
                    int empno = rs.getInt(1);
                    // varchar => String
                    String dname = rs.getString("dname");
                    String lob = rs.getString("lob");
                    int mgr = rs.getInt("mgr");
                    String hireDate = rs.getString("hiredate");
                    int sal = rs.getInt("sal");
                    int comm = rs.getInt("comm");
                    int deptno = rs.getInt("deptno");

                    System.out.printf("%d %s %s %d %s %d %d\n", empno,
                            dname, lob, mgr, hireDate, sal, comm, deptno);

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {

            }
        }
    }
}