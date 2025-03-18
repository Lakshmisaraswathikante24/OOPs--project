package com.oops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAuth {
	 public static boolean login(String username, String password) {
	        try (Connection conn = DBHelper.getConnection()) {
	            String query = "SELECT * FROM Users WHERE username = ? AND password = ?";
	            PreparedStatement stmt = conn.prepareStatement(query);
	            stmt.setString(1, username);
	            stmt.setString(2, password);
	            ResultSet rs = stmt.executeQuery();
	            return rs.next(); // Returns true if user exists
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;
	    }

	    public static void register(String username, String password) {
	        try (Connection conn = DBHelper.getConnection()) {
	            String query = "INSERT INTO Users (username, password) VALUES (?, ?)";
	            PreparedStatement stmt = conn.prepareStatement(query);
	            stmt.setString(1, username);
	            stmt.setString(2, password);
	            stmt.executeUpdate();
	            System.out.println("User registered successfully!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

}
