package piratePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Testingclass {
	public String fName;
	public String lName;
	PreparedStatement insert;
	
	public Testingclass(String first, String last){
		this.fName = first;
		this.lName = last;
	}
	
	void insert() {
		try {
			Class.forName("com.mysql.jdbc.Driver");			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "password");			
			
			//create insert statement
			insert = con.prepareStatement("insert into user (firstName, lastName) values (?, ?)");
			insert.setString(1, fName);
			insert.setString(2, lName);
			insert.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
try {
Class.forName("com.mysql.jdbc.Driver");			
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/moviestoredb", "root", "password");			

//create insert statement
//insert = con.prepareStatement();
//insert.setInt(1, 666666666);
//insert.setString(2, firstName);
//insert.executeUpdate();
}
catch (Exception e) {
e.printStackTrace();
}
*/