package oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OracleEx1 {
	static Connection conn;
	static PreparedStatement pstmt;
	static ResultSet rs;
	
	public static void main(String[] args) {
		String sql = "select * from tbl_member_202201";
		conn = OracleDbc.getConnection(); //연결된 객체
		//executeQuery는 셀렉트문에서만 쓰인다 – 반환타입 ResultSet
		//셀렉트문이 아닌경우엔(insert delete update) executeUpdate(); , 반환타입이 int
		ArrayList<Member> ml = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql); 	//sql 명령을 추가
			rs = pstmt.executeQuery();					//추가된 sql 명령을 실행
			while(rs.next()){		//다음 레코드가 있을 때 까지
				Member mem=new Member();
//				System.out.print(rs.getInt("member_seq")+"\t");
//				System.out.print(rs.getString("c_no")+"\t");
//				System.out.println(rs.getString("c_name"));
				mem.setSeq(rs.getInt("member_seq"));
				mem.setNo(rs.getString("c_no"));
				mem.setName(rs.getString("c_name"));
				mem.setPhone(rs.getString("phone"));
				mem.setAddress(rs.getString("address"));
				mem.setReg(rs.getString("regist_date"));
				mem.setType(rs.getString("c_type"));
				ml.add(mem); //어레이리스트에 추가
				
				OracleDbc.close(conn, pstmt, rs);
			}
		} catch (SQLException e) {
			System.out.println("SQL실행이 정상적으로 처리되지 못했습니다.");
		}
		for(Member data : ml){
			System.out.println(data.toString());
		}

	}

}
