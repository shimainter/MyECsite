package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserListDeleteDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public int getUserDeleteInfo() throws SQLException {

		String sql = "DELETE FROM login_user_transaction";
		PreparedStatement preparedStatement;
		int result = 0;

		try {
			preparedStatement = con.prepareStatement(sql);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return result;
	}
}