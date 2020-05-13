package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseUtil {

	public static List<Food> getDbItems() throws SQLException, ClassNotFoundException{
		
		ArrayList<Food> list = new ArrayList<>();
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/food_cart?useSSL=false&serverTimezone=UTC", "root", "root"
				);
		
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery("select * from food_menu");
		
		while(result.next()) {
			int id = result.getInt(1);
			String item = result.getString(2);
			int price = result.getInt(3);
			Food menu_item = new Food(id, item, price);
			list.add(menu_item);
		}
		
		return list;
	}
}
