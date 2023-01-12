package db;

import java.sql.SQLException;

import petShopProject.Product;
import java.util.ArrayList; // import the ArrayList class

public class productCnx extends DBConnection {
	
	public void getProduct(String id) {
		read("Select * From product where idproduct = "+id);
		
		
	}
	public void getProducts() {
		read("Select * From product");
		
	}
	public void addProduct(int id,String Name,String image,String info,String Cate,double price) {
		String Req = "INSERT INTO product (idproduct, name, image, information, categorie, price)"
				+ "VALUES ("+id+", '"+Name+"', '"+image+"', '"+info+"', '"+Cate+"', "+price+")";
		
		Update(Req);
		
				
		
		
		
	}
	public void addProduct(Product p) {
		String Req = "INSERT INTO product (idproduct, name, image, information, categorie, price)"
				+ "VALUES ("+p.getIdproduct()+", '"+p.getName()+"', '"+p.getImage()+"', '"+p.getInformation()+"', '"+p.getCategorie()+"', "+p.getPrice()+")";
		
		Update(Req);
		
		
	}
	public void DeleteProducts(String id) {
		Update("Delete from Product where idproduct = "+ id);
		
		
	} 
	public Product setproduct() {
		try {
		int id = Integer.valueOf(resultat.getString("idproduct"));
		String Name = resultat.getString("idproduct");
		String image = resultat.getString("idproduct");
		String info = resultat.getString("idproduct");
		String Cate = resultat.getString("idproduct");
		double price = Double.valueOf(resultat.getString("idproduct"));
		Product p= new Product(id,Name,image,info,Cate,price);
		return p;
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	public ArrayList<Product>  setproducts() {
		ArrayList<Product> prods= new ArrayList<>();
		try{
			
			while(next()) {
		int id = Integer.valueOf(resultat.getString("idproduct"));
		String Name = resultat.getString("idproduct");
		String image = resultat.getString("idproduct");
		String info = resultat.getString("idproduct");
		String Cate = resultat.getString("idproduct");
		double price = Double.valueOf(resultat.getString("idproduct"));
		
			//prods.add(new Product(id,Name,image,info,Cate,price));
			}
		
		return prods;
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	

}
