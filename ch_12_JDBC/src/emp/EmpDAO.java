package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // static : 인스턴스변수,인스턴스메소드 앞에 붙으면 공유
    // 로드 시점이 가장 처음에 로드됨
    //

    static {
        // 드라이버 로드
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String passward = "tiger";

        try {
            con = DriverManager.getConnection(url, user, passward);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {

        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {

        }
    }

    // select,insert,update,delete 처리 메소드
    public List<EmpDTO> selectALL() {

        con = getConnection();
        String sql = "SELECT * FROM emp_temp";
        List<EmpDTO> list = new ArrayList<>();
        try {
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // rs객체에 감긴결과를 옮기기
            while (rs.next()) {
                EmpDTO eDto = new EmpDTO();
                eDto.setEmpNo(rs.getInt("empno"));
                eDto.setDName(rs.getString("dname"));
                eDto.setLob(rs.getString("lob"));
                eDto.setMgr(rs.getInt("mgr"));
                eDto.setHireDate(rs.getString("hiredate"));
                eDto.setComm(rs.getInt("comm"));
                eDto.setDeptNo(rs.getInt("deptno"));
                eDto.setSal(rs.getInt("sal"));
                list.add(eDto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    public EmpDTO select(int empNo) {
        con = getConnection();
        String sql = "SELECT * FROM emp_temp WHERE empno=?";
        EmpDTO eDto = null;
        try {
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setInt(1, empNo);
            rs = pstmt.executeQuery();

            // rs객체에 감긴결과 옮기기
            if (rs.next()) {
                eDto = new EmpDTO();
                eDto.setEmpNo(rs.getInt("empno"));
                eDto.setDName(rs.getString("dname"));
                eDto.setLob(rs.getString("lob"));
                eDto.setMgr(rs.getInt("mgr"));
                eDto.setHireDate(rs.getString("hiredate"));
                eDto.setComm(rs.getInt("comm"));
                eDto.setDeptNo(rs.getInt("deptno"));
                eDto.setSal(rs.getInt("sal"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return eDto;
    }

    public int insert(EmpDTO eDto) {
        con = getConnection();
        int result = 0;
        try {
            String sql = "insert into emp_temp(empno, DNAME, lob, mgr,HIREDATE, sal, COMM, deptno)";
            sql += "values(?,?,?,?,?,?,?,?)";

            pstmt = con.prepareStatement(sql);
            // ?해결
            pstmt.setInt(1, eDto.getEmpNo());
            pstmt.setString(2, eDto.getDName());
            pstmt.setString(3, eDto.getLob());
            pstmt.setInt(4, eDto.getMgr());
            pstmt.setString(5, eDto.getHireDate());
            pstmt.setInt(6, eDto.getSal());
            pstmt.setInt(7, eDto.getComm());
            pstmt.setInt(8, eDto.getDeptNo());

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int update(EmpDTO eDto) {
        con = getConnection();
        int result = 0;
        try {
            String sql = "UPDATE emp_temp SET sal = ? where empno=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eDto.getSal());
            pstmt.setInt(2, eDto.getEmpNo());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;

    }

    public int delete(int empNo) {
        con = getConnection();
        String sql = "delete from emp_temp where empno=?";
        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            // 물음표 해결
            pstmt.setInt(1, empNo);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }
}
