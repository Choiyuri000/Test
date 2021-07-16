package co.comp.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uesr = "demo";
	private String password = "1234";

	public Connection conn; // 연결 객체

	public DAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uesr, password);
			System.out.println("DB 연결 성공");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("DB 연결 실패");
		}
	}

}
