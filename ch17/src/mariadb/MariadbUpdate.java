package mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariadbUpdate {
	static Connection conn;
	static PreparedStatement pstmt;
	public static void main(String[] args) {
		String sql = "update course_tbl set name=? where id=?";
		Course cs = new Course();
		int sw=0;
		cs.setName("버거킹");
		cs.setId("40002");
		
		conn=MariaDB.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, cs.getName());
			pstmt.setString(2, cs.getId());
			sw=pstmt.executeUpdate();
			if(sw>0){
				System.out.println("업데이트 완료");
			}else{
				System.out.println("업데이트 실패");
			}
			MariaDB.close(conn, pstmt);
		} catch (SQLException e) {
				System.out.println("SQL연결 실패했당");
		}

	}

}
