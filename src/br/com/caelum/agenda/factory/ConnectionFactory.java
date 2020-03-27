package br.com.caelum.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "888dygytos987");
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

}
