package petShopProject;

public class Product {
    private int idproduct;
    private String name;
    private String image;
    private String information;
    private String categorie;
    private double price;

    // constructor
    public Product(int idproduct, String name, String image, String information, String categorie, double price) {
        this.idproduct = idproduct;
        this.name = name;
        this.image = image;
        this.information = information;
        this.categorie = categorie;
        this.price = price;
    }

    // getters and setters
    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
