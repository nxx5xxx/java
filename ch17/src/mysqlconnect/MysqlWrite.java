package mysqlconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class MysqlWrite {
	static Connection conn;
	static PreparedStatement pstmt;
	public static void main(String[] args) {
		Test2 test = new Test2();
		Scanner sc = new Scanner(System.in);
//		String id,pw,name;
		System.out.println("회원등록입니다.");
		System.out.println("아이디를 입력하세요");
		test.setId(sc.nextLine());
		System.out.println("비밀번호를 입력하세요");
		test.setPw(sc.nextLine());
		System.out.println("이름을 입력하세요");
		test.setName(sc.nextLine());
		
		String sql = "insert into test2 values(?,?,?)";
		int sw=0;
		conn = MySQL.getConnection();
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,  test.getId());
			pstmt.setString(2, test.getPw());
			pstmt.setString(3, test.getName());
			sw =pstmt.executeUpdate(); //executeUpdate는 crud중 cud에 대한 내용
				if(sw>0){
					System.out.println("회원등록이 정상적으로 처리되었습니다.");
				}else {
					System.out.println("축하드립니다! 회원가입 실패!");
				}
			
			MySQL.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("축하드립니다! SQL실행이 정상적으로 처리되지 못했습니다!");
		}
		
		
		sc.close();
	}

}
