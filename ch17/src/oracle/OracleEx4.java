package oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleEx4 {
	static Connection conn = null;
	static PreparedStatement pstmt =null;
	
	public static void main(String[] args) {
		Member mem= new Member();
		mem.setNo("20003");
		
		String sql = "delete from tbl_member_202201 where c_no=?";
		int a=0;
		conn = OracleDbc.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mem.getNo());
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("탈퇴가 성공했습니다..");
			}else{
				System.out.println("회원탈퇴~ 실패!!");
			}
		} catch (SQLException e) {
			System.out.println("뭔가 틀렸습니다");
		}
	}

}
