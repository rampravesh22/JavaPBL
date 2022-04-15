class Auther {
    String name, email;

    char gender;

    Auther(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;

    }

}

class Book {
    String name;
    Auther auth;
    double price;
    int qtyInStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Auther getAuth() {
        return auth;
    }

    public void setAuth(Auther auth) {
        this.auth = auth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    Book(String name, Auther auth, double price, int qtyInStock) {
        this.name = name;
        this.auth = auth;
        this.price = price;
        this.qtyInStock = qtyInStock;

    }

    void getDetails() {
        System.out.printf("Book Details %n Name : %s %n Price: %f %n Quantity In Stock: %d %n", this.name, this.price, this.qtyInStock);
        System.out.printf("Author Details %n Name : %s %n Age: %s %n Gender: %C %n", this.auth.name, this.auth.email, this.auth.gender);
    }


}


public class Main {
    public static void main(String[] args) {
        Auther auth = new Auther("ram", "rpc123@gmail.com", 'M');
        Book b1 = new Book("Dune", auth, 23.4, 23);
        b1.getDetails();

    }
}
