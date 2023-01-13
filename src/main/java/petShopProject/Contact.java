package petShopProject;

public class Contact {
    private int idcontact;
    private String Name;
    private String Email;
    private String Phone;
    private String Company;
    private String Message;

    // constructor
    public Contact() {
        this.idcontact = -1;
        this.Name = "";
        this.Email = "";
        this.Phone = "";
        this.Company = "";
        this.Message = "";
    }
    public Contact(int idcontact, String Name, String Email, String Phone, String Company, String Message) {
        this.idcontact = idcontact;
        this.Name = Name;
        this.Email = Email;
        this.Phone = Phone;
        this.Company = Company;
        this.Message = Message;
    }

    // getters and setters
    public int getIdcontact() {
        return idcontact;
    }

    public void setIdcontact(int idcontact) {
        this.idcontact = idcontact;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
