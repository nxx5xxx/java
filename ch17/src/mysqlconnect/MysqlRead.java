package mysqlconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MysqlRead {
	static Connection conn;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public static void main(String[] args) {
		String sql = "select * from test2";
		conn = MySQL.getConnection(); //MySQL에 연결

		ArrayList<Test2> tl = new ArrayList<>(); //담아올공간
		try {
			pstmt = conn.prepareStatement(sql); 
			rs = pstmt.executeQuery();					//실행된결과를 받아오는것이 result set
			while(rs.next()){		
				Test2 test=new Test2();

				test.setId(rs.getString("id")); //test.setId(rs.getString("여기가 컬럼명이다"));
				test.setPw(rs.getString("pw"));
				test.setName(rs.getString("name"));
				tl.add(test);  //리스트로 주입
				
				
			}
			MySQL.close(conn, pstmt, rs);
		} catch (SQLException e) {
			System.out.println("SQL실행이 정상적으로 처리되지 못했습니다.");
		}
		for(Test2 data : tl){
			System.out.println(data.toString());
		}

	}

}
