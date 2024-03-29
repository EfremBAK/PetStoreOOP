public class Animal {
    private String aboutMe;
    private String name;
    private String type;
    private String description;
    private double price;
    private boolean isInStock;

    public Animal() {
    }

    public Animal(String aboutMe, String name, String type, String description, double price, boolean isInStock) {
        this.aboutMe = aboutMe;
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getPet(){
        aboutMe = "Name of animal: " + getName()+". \nType: " + getType() + ". \nDescription:  "+getDescription();
        return aboutMe;
    }
}
