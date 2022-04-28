import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class GalleryTest {

    Gallery gallery;

    Artist LeonardoDaVinci;
    Artist vincentVanGogh;
    Artwork MonaLisa;
    Artwork irises;
    Customer customer;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Hamza's Artwork");
        leonardodavinci = new Artist("leonardo Da Vinci");
        flowersInAVase = new Artwork("Flowers In a Glass Vase with a Cricket in a Niche", rachelRuysch, 10_000_000, 786);
        vincentVanGogh = new Artist("Vincent van Gogh");
        irises = new Artwork("Irises", vincentVanGogh, 12_000_000, 885 );
        gallery.addArtwork(flowersInAVase);
        gallery.addArtwork(irises);
        customer = new Customer("Peggy Guggenheim", 30_000_000);
    }

    @Test
    public void galleryCanSellArt(){
        gallery.sellArtwork(customer, flowersInAVase);
        assertThat(gallery.artworkCount()).isEqualTo(1);
        assertThat(gallery.getTill()).isEqualTo(20_000_000);
        assertThat(customer.getWallet()).isEqualTo(10_000_000);
        assertThat(customer.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void canCalculateArtValue(){
        double result = gallery.calculateArtworkValue();
        assertThat(result).isEqualTo(22_000_000);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("Bright Artwork");
    }

    @Test
    public void tillStartsAtZero(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }
}
