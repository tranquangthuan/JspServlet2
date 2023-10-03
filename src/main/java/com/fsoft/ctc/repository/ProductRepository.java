package com.fsoft.ctc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fsoft.ctc.model.Product;
import com.fsoft.ctc.util.ConnectionUtils;

public class ProductRepository {

	public List<Product> getProducts() {
		List<Product> result = new ArrayList<Product>();

		String sql = "SELECT * FROM Product";
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = ConnectionUtils.getConnection();
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				result.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getString("color"),
						rs.getInt("quantity")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close connection
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public void addProduct(Product product) {

		String sql = "INSERT INTO Product(name, color ,quantity) VALUES (?, ?, ?)";
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = ConnectionUtils.getConnection();
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, product.getName());
			stmt.setString(2, product.getColor());
			stmt.setInt(3, product.getQuantity());

			int rowCount = stmt.executeUpdate();
			System.out.println("Row Count affected = " + rowCount);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close connection
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
