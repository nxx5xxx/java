package oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleEx2 {
	static Connection conn;
	static PreparedStatement pstmt;
	
	public static void main(String[] args) {
		Member mem=new Member();
//		mem.setSeq(rs.getInt("member_seq"));
		mem.setNo("20003");
		mem.setName("강아지");
		mem.setPhone("01011111111");
		mem.setAddress("경기도 고양시");
		mem.setReg("20230406");
		mem.setType("VIP");
		
		String sql = "insert into tbl_member_202201 values(member_seq.nextval,?,?,?,?,?,?)";
		int a=0;
		conn = OracleDbc.getConnection(); //연결된 객체
		
		
		try {
			pstmt = conn.prepareStatement(sql); 	//sql 명령을 추가
			pstmt.setString(1, mem.getNo());//첫번째 ?
			pstmt.setString(2, mem.getName() );
			pstmt.setString(3, mem.getPhone());
			pstmt.setString(4, mem.getAddress());
			pstmt.setString(5, mem.getReg());
			pstmt.setString(6, mem.getType());
			a = pstmt.executeUpdate();	//executeUpdate는 1row update처럼 1정수값 이 옴
				if(a>0){
					System.out.println("회원가입이 성공적으로 되었습니다");
				}else{
					System.out.println("축하드립니다! 회원가입 실패!!!!");
				}
			
			OracleDbc.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL실행이 정상적으로 처리되지 못했습니다.");
		}


	}

}

