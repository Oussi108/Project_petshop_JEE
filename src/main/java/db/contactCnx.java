package db;

import java.sql.SQLException;

import petShopProject.Contact;

public class contactCnx extends DBConnection {
	public void getContact(String id) {
		read("Select * From contact where idcontact = "+id);
		
		
	}
	public void getContacts() {
		read("Select * From contact");
		
	}
	public void addContact(String Name,String email,String phone,String company,String message) {
		String Req = "INSERT INTO contact (Name, Email, Phone, Company, Message)"
				+ "VALUES ('"+Name+"', '"+email+"', '"+phone+"', '"+company+"', "+message+")";
		
		Update(Req);
		
				
		
		
		
	}
	public void addContact(Contact c) {
		String Req = "INSERT INTO contact (Name, Email, Phone, Company, Message)"
				+ "VALUES ('"+c.getName()+"', '"+c.getEmail()+"', '"+c.getPhone()+"', '"+c.getCompany()+"', "+c.getMessage()+")";
		
		Update(Req);
		
		
	}
	public void DeleteContacts(String id) {
		Update("Delete from contact where idcontact = "+ id);
		
		
	} 
	public Contact setContact() {
		try {
		int id = Integer.valueOf(resultat.getString("idContact"));
		String Name = resultat.getString("Name");
		String mail = resultat.getString("Email");
		String phone = resultat.getString("Phone");
		String company = resultat.getString("Company");
		String message = resultat.getString("Message");
		Contact p= new Contact(id,Name,mail,phone,company,message);
		return p;
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
}
