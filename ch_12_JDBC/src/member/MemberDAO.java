package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
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

    // DML + Select
    // insert,delete,update : int 리턴
    // select : ~~ DTO(where pk 지정) or List<~~DTO>

    // insert, update : 전달인자 ~~~ DTO 설정

    public int update(MemberDTO memberDTO) {
        // memberDTO
        // 1. id, addr
        // 2.

        int result = 0;

        try {
            con = getConnection();

            String sql = "update MEMBER_TABLE ";

            if (memberDTO.getADDR() != null) {
                sql += "set ADDR = ? ";
                sql += "where ID = ? ";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getADDR());
                pstmt.setString(2, memberDTO.getID());

            } else {
                sql += "set email = ? ";
                sql += "where id = ? ";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getEMAIL());
                pstmt.setString(2, memberDTO.getID());
            }

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int insert(MemberDTO memberDTO) {
        int result = 0;

        try {
            con = getConnection();

            String sql = "insert into MEMBER_TABLE ";
            sql += "values(?,?,?,?,?)";

            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, memberDTO.getID());
            pstmt.setString(2, memberDTO.getNAME());
            pstmt.setString(2, memberDTO.getADDR());
            pstmt.setString(3, memberDTO.getEMAIL());
            pstmt.setInt(5, memberDTO.getAGE());

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }
}
