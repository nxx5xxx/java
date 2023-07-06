package mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariadbDelete {
	static Connection conn;
	static PreparedStatement pstmt;
	public static void main(String[] args) {
		Course cs = new Course();
		cs.setId("40002");
		String sql = "delete from course_tbl where id=?";
		int sw=0;
		conn=MariaDB.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, cs.getId());
			sw=pstmt.executeUpdate();
			if(sw>0){
				System.out.println("삭제성공");
			}else{
				System.out.println("삭제실패");
			}
			MariaDB.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL접근실패");
		}
	}

}
