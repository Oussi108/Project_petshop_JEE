package db;

import java.sql.SQLException;

import petShopProject.User;


public class userCnx extends DBConnection{
	
	public static int id ;
	public void getuser() {
		read("Select * From users where idusers = "+id);
		
		
	}
	public boolean checkuser(String username,String password) {
		read("Select * From users where Username = '"+username+"' and Password='"+password+"'");
		try {
			return resultat.first();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
	public void getuserss() {
		read("Select * From users");
		
	}
	public void addusers(String Name,String email,String phone,String company,String message) {
		String Req = "INSERT INTO users (Name, Email, Phone, Company, Message)"
				+ "VALUES ('"+Name+"', '"+email+"', '"+phone+"', '"+company+"', "+message+")";
		
		Update(Req);
		
				
		
		
		
	}
	public void adduser(User c) {
		String Req = "";
		//"INSERT INTO users (Name, Email, Phone, Company, Message)"
			//	+ "VALUES ('"+c.getName()+"', '"+c.getEmail()+"', '"+c.getPhone()+"', '"+c.getCompany()+"', "+c.getMessage()+")";
		
		Update(Req);
		
		
	}
	public void Deleteusers(String id) {
		Update("Delete from users where idUsername = "+ id);
		
		
	} 
	public User setusers() {
		try {
		int id = Integer.valueOf(resultat.getString("idUsername"));
		String Name = resultat.getString("Username");
		String mail = resultat.getString("Email");
		String phone = resultat.getString("Phone");
		String company = resultat.getString("Company");
		String adress = resultat.getString("adrres");
		String Password = resultat.getString("Password");

		User p= new User(id,Name,Password,mail,phone,company,adress);
		return p;
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
}
