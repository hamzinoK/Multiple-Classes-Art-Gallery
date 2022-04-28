import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Artwork {

    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Mona Lisa")
        artwork = new Artwork("Leonardo Da Vinci", "850000000", "69");
    }

    @Test
    public void hasTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }

    @Test
    public void hasArtist(){
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }

    @Test
    public void hasPrice() {
        assertThat(artwork.getPrice()).isEqualto(850000000);
    }

    @Test
    public void hasNft(){
        assertThat(artwork.getNft()).isEqualto(69)
    }
}
