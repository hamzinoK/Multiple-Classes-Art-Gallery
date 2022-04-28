import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> customerCollection

    public Customer(String name, double wallet, ArrayList<Artwork> customerCollection) {
        this.name = name;
        this.wallet = wallet;
        this.customerCollection = new ArrayList<>()
    }

    public boolean canBuy(Artwork artwork){
        if( artwork.getPrice() <= this.wallet){
            return true;
        }
        return false;
    }

    public void buyArtwork(Artwork artwork){
        this.wallet -= artwork.getPrice();
        this.customerArtwork.add(artwork);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getCustomerCollection() {
        return customerCollection;
    }

    public void setCustomerCollection(ArrayList<Artwork> customerCollection) {
        this.customerCollection = customerCollection;
    }
}
