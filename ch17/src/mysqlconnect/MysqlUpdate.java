package mysqlconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlUpdate {
	static Connection conn;
	static PreparedStatement pstmt;
	public static void main(String[] args) {
		Test2 test = new Test2();
		String sql = "update test2 set id=? where=?";
		test.setId("update");
		test.setName("yzz");
		int sw=0;
		conn =MySQL.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, test.getId());
			pstmt.setString(2, test.getName());
			sw=pstmt.executeUpdate();
					if(sw>0){
						System.out.println("수정 성공");
					}else{
						System.out.println("수정 실패");
					}
			MySQL.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL연결 실패");
		}
		

	}

}
