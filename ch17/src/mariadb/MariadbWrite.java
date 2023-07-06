package mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariadbWrite {
	static Connection conn;
	static PreparedStatement pstmt;
	public static void main(String[] args) {
		Course cs = new Course();
		String sql = "insert into course_tbl values(?,?,?,?,?,?,?)";
		int sw=0;
		cs.setId("40002");
		cs.setName("점심");
		cs.setCre(5);
		cs.setLec("9");
		cs.setWeek(6);
		cs.setS_h(1250);
		cs.setE_h(1330);
		
		conn=MariaDB.getConnection();
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, cs.getId());
			pstmt.setString(2, cs.getName());
			pstmt.setInt(3, cs.getCre());
			pstmt.setString(4, cs.getLec());
			pstmt.setInt(5, cs.getWeek());
			pstmt.setInt(6, cs.getS_h());
			pstmt.setInt(7, cs.getE_h());
			sw=pstmt.executeUpdate();
				if(sw>0){
					System.out.println("등록완료");
				}else{
					System.out.println("등록실패 ");
				}
			
			MariaDB.close(conn, pstmt);
		} catch (SQLException e) {
			
			System.out.println("SQL연결을 실패했당");
		}
		
		
	}

}
