package petShopProject;

public class User {
    private int idUsername;
    private String Username;
    private String Password;
    private String Email;
    private String Phone;
    private String Company;
    private String Adrres;

    public User() {
    	this.idUsername = -1;
        this.Username = "";
        this.Password = "";
        this.Email = "";
        this.Phone = "";
        this.Company = "";
        this.Adrres = "";
    }
    	
    	
    
    // constructor
    public User(int idUsername, String Username, String Password, String Email, String Phone, String Company, String Adrres) {
        this.idUsername = idUsername;
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.Phone = Phone;
        this.Company = Company;
        this.Adrres = Adrres;
    }

    // getters and setters
    public int getIdUsername() {
        return idUsername;
    }

    public void setIdUsername(int idUsername) {
        this.idUsername = idUsername;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getAdrres() {
        return Adrres;
    }

    public void setAdrres(String adrres) {
        Adrres = adrres;
    }
}
