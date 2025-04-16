package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // 1
    static {
        try {
            // jdbc 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 2
    public Connection getConnection() throws SQLException {
        // Connection 생성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "c##java";
        String password = "12345";

        return DriverManager.getConnection(url, user, password);
    }

    // 3
    public int insult(BoardDTO boardDTO) {
        int result = 0;
        try {

            // 4
            con = getConnection();
            String sql = "INSERT INTO board(bno,title,content,writer)";
            sql += " values(board_seq.nextval,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, boardDTO.getTitle());
            pstmt.setString(2, boardDTO.getContent());
            pstmt.setString(3, boardDTO.getWriter());

            result = pstmt.executeUpdate();

            // 7
        } catch (Exception e) {
            e.printStackTrace();
            // 8
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
