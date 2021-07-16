package co.comp.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uesr = "demo";
	private String password = "1234";

	public Connection conn; // ���� ��ü

	public DAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uesr, password);
			System.out.println("DB ���� ����");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("DB ���� ����");
		}
	}

}
