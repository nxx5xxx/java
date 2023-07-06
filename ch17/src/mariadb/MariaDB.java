package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//mariadb -java - client - 3.0.3 jar로
public class MariaDB {
	private final static String DRIVER = "org.mariadb.jdbc.Driver";
	private final static String URL = "jdbc:mariadb://127.0.0.1:3308/company";
	//127.0.0.1에 localhost가 안될경우 127.0.0.1로 바꿀것
	//아이피:포트번호/db명
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public static Connection getConnection(){
		//커넥션 널 주고 드라이버 , 드라이버메니져 겟 url user pass
		Connection conn = null;
			try {
				Class.forName(DRIVER);
				try {
					conn = DriverManager.getConnection(URL,USER,PASS);
				} catch (SQLException e) {
					System.out.println("데이터 베이스에 연결되지 못했습니다.");
				}
			} catch (Exception e) {
				System.out.println("드라이버를 찾지 못했습니다.");
			}

		return conn;
	}
	public static void close(Connection conn,PreparedStatement pstmt){
		//역순 클로즈 - 트라이캐치처리
		try {
			pstmt.close();
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println("DB를 닫지 못했습니다");
				}
		} catch (Exception e) {
			System.out.println("DB상태 연결을 끊지 못했습니다");
		  }
	}
	public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs){
		try {
			rs.close();
			try {
				pstmt.close();
				try {
					conn.close();
				} catch (Exception e) {
					System.out.println("데이터베이스를 못닫음");
				}
			} catch (Exception e) {
				System.out.println("DB상태 연결 못끊음");
			}
		} catch (Exception e) {
			System.out.println("쿼리종료 못함");
		}
	}
}
