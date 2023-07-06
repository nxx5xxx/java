package mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MariadbRead {
	static Connection conn;
	static PreparedStatement pstmt;
	static ResultSet rs; //결과물이 레코드일때 씀
	public static void main(String[] args) {
		String sql = "select * from course_tbl"; //sql에 셀렉트명령문을 일단 넣어둠
		ArrayList<Course> cslist = new ArrayList<>();//course_tbl을 담아둘 공간을 선언해둠
		conn=MariaDB.getConnection();//마리아db에 연결
		
		try {
			pstmt=conn.prepareStatement(sql); //마리아db에 연결해서 sql에 받아넣은 명령문을 집어넣기
			rs = pstmt.executeQuery();//실행된 결과를 받아오기
			while(rs.next()){//다음값이 없을때까지 반복
				Course cs = new Course();
				
				cs.setId(rs.getString("id"));
				cs.setName(rs.getString("name"));
				cs.setCre(rs.getInt("credit"));
				cs.setLec(rs.getString("lecturer"));
				cs.setWeek(rs.getInt("week"));
				cs.setS_h(rs.getInt("start_hour"));
				cs.setE_h(rs.getInt("end_end"));
				cslist.add(cs);
			}
			MariaDB.close(conn, pstmt, rs);
			
		} catch (SQLException e) {
	
			System.out.println("SQL실행이 정상적으로 처리되지 못했습니다");
		}
		
		for(Course data : cslist){
			System.out.println(data.toString());
		}
		
	}

}
