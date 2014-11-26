package www.cs.berkeley.edu.jrs.cs61b.hw.pj1;

/**
 * Created by ralmeid on 11/25/14.
 */
class Pixel {
    private final Short red;
    private  final Short green;
    private final Short blue;

    public Pixel(Short red, Short green, Short blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Short getRed() {
        return red;
    }

    public Short getGreen() {
        return green;
    }

    public Short getBlue() {
        return blue;
    }
}
