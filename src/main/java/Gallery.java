import java.util.ArrayList;

public class Gallery {
    private String name;

    private int till;

    private ArrayList<Artwork> artworks;

    public Gallery(String name) {
        this.name = name;
        this.artworks = new ArrayList<>();
        this.till = 0;
    }

    public void sellArtwork(Customer customer, Artwork artwork){
        if(customer.canBuy(artwork) == true){
            customer.buyArtwork(artwork);
            this.artworks.remove(artwork);
            setTill(this.till + artwork.getPrice());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }


}
