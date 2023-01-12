package db;

import java.sql.*;

/**
 * @author acer
 *
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/DataBasePetShop";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private Connection connexion;
    private Statement instruction; 
    protected ResultSet resultat;

    public DBConnection(){
    	
    	 try 
    	 {
    	         Class.forName("com.mysql.jdbc.Driver");
    	         connexion = getConnection();
    	         instruction = connexion.createStatement();
    	     } catch (ClassNotFoundException e) {
    	         // TODO Auto-generated catch block
    	        e.printStackTrace();
    	     }catch(SQLException ex) {
    	        ex.printStackTrace();
    	        
    	    }

    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    public void read(String requete) {
        try {
             resultat = instruction.executeQuery(requete);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    public void Update(String requete) {
        try {
            instruction.executeUpdate(requete);
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        
         }
        }
    public boolean next() {
    try {
         return resultat.next();
     } catch (SQLException e) {
         // TODO Auto-generated catch block
    	 
        e.printStackTrace();
        return false;
     }
    }
    public void close() {
    	
    	try {
			connexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    
    
    
}
