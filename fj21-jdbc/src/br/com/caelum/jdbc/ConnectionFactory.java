package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try{
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/fj21?autoReconnect=true&useSSL=false", "root", "Bruna2013");
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
