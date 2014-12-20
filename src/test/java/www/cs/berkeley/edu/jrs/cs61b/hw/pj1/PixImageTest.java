package www.cs.berkeley.edu.jrs.cs61b.hw.pj1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PixImageTest {

    //TODO Maybe I could be using GroovyTesting here: http://groovy.codehaus.org/Using+JUnit+4+with+Groovy


    @Test
    public void shouldCreateANewPixImage() throws Exception {
        PixImage pixImage = new PixImage(50, 50);
        assertThat(pixImage.getHeight(), equalTo(50));
        assertThat(pixImage.getWidth(), equalTo(50));
    }

    @Test
    public void shouldInitializeWithAAllBlackImage() throws Exception {
        PixImage pixImage = new PixImage(20, 20);
        assertThat(pixImage.getBlue(1, 2), equalTo((short) 0));
        assertThat(pixImage.getGreen(10, 16), equalTo((short) 0));
        assertThat(pixImage.getRed(19, 19), equalTo((short) 0));
    }

    @Test
    public void shouldStoreAndRetrieveRGBColors() throws Exception {
        PixImage pixImage = new PixImage(1, 1);
        pixImage.setPixel(0, 0, (short) 50, (short) 100, (short) 150);
        assertThat(pixImage.getRed(0, 0), equalTo((short) 50));
        assertThat(pixImage.getGreen(0, 0), equalTo((short) 100));
        assertThat(pixImage.getBlue(0, 0), equalTo((short) 150));
    }

    @Test
    public void boxBlur_shouldReturnThisIfNumberOfIterationsIsZeroOrLess() {
        PixImage pixImage = new PixImage(5, 5);
        assertThat(pixImage, is(pixImage.boxBlur(0)));
        assertThat(pixImage, is(pixImage.boxBlur(-8)));
    }

    @Test
    public void boxBlur_ShouldReturnBrandNewPixImage_whenBlurWithOneIterationIt() throws Exception {
        PixImage pixImage = new PixImage(3, 3);
        short color = 10;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pixImage.setPixel(i, j, color, color, color);
                color += (short) 10;
            }
        }
        PixImage newPixImage = pixImage.boxBlur(1);
        assertThat(newPixImage.getRed(0, 0), equalTo((short) 30));
        assertThat(newPixImage.getRed(0, 1), equalTo((short) 35));
        assertThat(newPixImage.getRed(0, 2), equalTo((short) 40));
        assertThat(newPixImage.getGreen(1, 0), equalTo((short) 45));
        assertThat(newPixImage.getGreen(1, 1), equalTo((short) 50));
        assertThat(newPixImage.getGreen(1, 2), equalTo((short) 55));
        assertThat(newPixImage.getBlue(2, 0), equalTo((short) 60));
        assertThat(newPixImage.getBlue(2, 1), equalTo((short) 65));
        assertThat(newPixImage.getBlue(2, 2), equalTo((short) 70));
    }
}