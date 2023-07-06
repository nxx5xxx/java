package oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleEx3 {

	
		static Connection conn = null;
		static PreparedStatement pstmt =null;
		public static void main(String[] args) {
			Member mem=new Member();
			mem.setNo("20003");
			mem.setPhone("01045671234");
			mem.setAddress("경기도 김포시");
			String sql = "update tbl_member_202201 set phone=? ,"
					+ " address=? where c_no=?";
			int a=0;
			conn = OracleDbc.getConnection(); //연결된 객체
			
			try {
				pstmt =conn.prepareStatement(sql);
				pstmt.setString(1, mem.getPhone());
				pstmt.setString(2, mem.getAddress());
				pstmt.setString(3, mem.getNo());
				a=pstmt.executeUpdate();
				if(a>0){
					System.out.println("회원정보 수정이 성공적으로 수행되었습니다");
				}else{
					System.out.println("회원정보 수정이 실패하였습니다.");
				}
				
			} catch (SQLException e) {
				System.out.println("업데이트에 실패하였습니다");
			}
			

	}

}
