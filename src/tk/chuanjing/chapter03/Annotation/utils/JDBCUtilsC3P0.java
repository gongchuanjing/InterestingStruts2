package tk.chuanjing.chapter03.Annotation.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 使用C3P0的 JDBC的工具类
 * 
 * @author ChuanJing
 * @date 2017年5月29日 下午9:01:22
 * @version 1.0
 */
public class JDBCUtilsC3P0 {
	
//	private static DataSource DATA_SOURCE = new ComboPooledDataSource();
	private static final ComboPooledDataSource DATA_SOURCE = new ComboPooledDataSource();
	
	public static DataSource getDataSource() {
		return DATA_SOURCE;
	}
	
	/**
	 * 获得连接的方法
	 * @return
	 */
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DATA_SOURCE.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void close(Connection connection, Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			statement = null;
		}
		
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			connection = null;
		}
	}
	
	public static void close(Connection connection, Statement statement, ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			resultSet = null;
		}
		
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			statement = null;
		}
		
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			connection = null;
		}
	}
}
