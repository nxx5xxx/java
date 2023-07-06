package oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DB를 연결하고 , 종료하기위한 클래스
public class OracleDbc {
//상수기때문에 private final static을 걸어준다//상수는 대문자
	//시험볼땐 인쇄물에 드라이버 url 유저 패스워드등이 주어진다
	
	//연결에 필요한 상수를 선언
	private final static String DRIVER ="oracle.jdbc.driver.OracleDriver";
	private final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final static String USER ="system";
	private final static String PASS ="1234";
	
	//연결해서 던져줄 메소드 생성
	public static Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			try {
				conn = DriverManager.getConnection(URL,USER,PASS);
			} catch (SQLException e) {
				System.out.println("데이터 베이스에 연결되지 못했습니다.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 로딩하지 못했습니다");
		}
		return conn; 
	}
	//닫을 메소드
	public static void close(Connection conn, PreparedStatement pstmt){
	try {
		pstmt.close();
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("데이터 베이스를 닫지 못했습니다.");
		}
	} catch (SQLException e) {
		System.out.println("DB의 상태 연결을 끊지 못했습니다.");
	}
	
	}
	
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs ){
		try {
			rs.close();
			try {
				pstmt.close();
				try {
					conn.close();
				} catch (SQLException e) {//강사님은 SQLExecption이 아닌 Exception으로 되어있음//추후에러시 확인할것
					System.out.println("데이터 베이스를 닫지 못했습니다.");
				}
			} catch (SQLException e) {
				System.out.println("DB의 상태 연결을 끊지 못했습니다.");
			}
		} catch (SQLException e) {
			System.out.println("쿼리를 종료하지 못했습니다.");
		}

	}
	
}
