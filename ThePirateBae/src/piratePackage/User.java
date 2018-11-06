package piratePackage;

import java.sql.*;
import java.awt.List;

//
public class User {
	boolean kidMode;
	//get last 10 genres and calculate	
	String recommend[] = new String[10];
	List favourites;
	
	/*
	//assigned at creation; needs implementation
	int memberID;

	//membership status; might implement int values instead
	String levelName;

	//user data to enter into database
	String userName; 
	String firstName; 
	String lastName;  
	String phoneNumber;
	String emailAddress;
	String memberPassword;
	String memberSince; 
	String activeStatus;
	String genrePreference;
	
	//billing info
	String creditCardCCV;
	String creditCardNumber;
	String cardHolderFirstName; 
	String cardHolderLastName; 
	String expYear;
	String expMonth;
	String ccType;
	String billAddressLine1;
	String billAddressLine2; 
	String billCity;  
	String billState; 
	String billZipCode; 
	String shipAddressLine1;
	String shipAddressLine2; 
	String shipCity; 
	String shipState;
	String shipZipCode;
	*/
	
	PreparedStatement insert;	
	
	
	//creates a user in the database
	User(	//maybe send array instead?
			/*
			int memberID,
			String levelName,
			String userName, 
			String firstName, 
			String lastName,  
			String phoneNumber,
			String emailAddress,
			String memberPassword,
			String memberSince, 
			String activeStatus,
			String genrePreference,
			String creditCardCCV,
			String creditCardNumber,
			String cardHolderFirstName, 
			String cardHolderLastName, 
			String expYear,
			String expMonth,
			String ccType,
			String billAddressLine1,
			String billAddressLine2, 
			String billCity,  
			String billState, 
			String billZipCode, 
			String shipAddressLine1,
			String shipAddressLine2, 
			String shipCity, 
			String shipState,
			String shipZipCode
			*/
			){
				
	}
	
	public void insertInto() {
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
	}
	
	
	//pull a list of favourites from the database
	public List getFavourites() {
		List favs = new List();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/moviestoredb", "root", "password");			
			
			Statement st = con.createStatement();
			
			//favourites not in database yet
			//ResultSet favourites = st.executeQuery("select favourites from member;");
			
			while(favourites.next()) {
				favs.add(favourites.getString(1));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return favs;
	}
	
	public boolean kidMode() {
		try {
			Class.forName("com.mysql.jdbc.Driver");			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/moviestoredb", "root", "password");			
			
			Statement st = con.createStatement();
			
			//kidMode not in database yet
			ResultSet kidMode = st.executeQuery("select kidMode from member;");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return kidMode;
	}
}
