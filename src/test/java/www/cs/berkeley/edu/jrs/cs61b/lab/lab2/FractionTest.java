package www.cs.berkeley.edu.jrs.cs61b.lab.lab2;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by ralmeid on 7/28/14.
 */
public class FractionTest {
    @org.junit.Test
    public void testChangeNumerator() throws Exception {
        Fraction fraction = new Fraction(1, 2);
        fraction.changeNumerator(3);
        Assert.assertThat(fraction.toString(), is("3/2"));
    }

    @Test
    public void shouldReduceTheFraction() throws Exception {
        Assert.assertThat(new Fraction(4, 2).toString(), is("2/1"));
        Assert.assertThat(new Fraction(16, 8).toString(), is("2/1"));
    }

    @Test
    public void shouldCopyFraction() throws Exception {
        Fraction fraction = new Fraction(new Fraction(9, 5));
        Assert.assertThat(fraction.toString(), is("9/5"));
    }

    @Test
    public void shouldSumFractions() throws Exception {
        Assert.assertThat(new Fraction(1, 2).add(new Fraction(3, 4)).toString(), is("5/4"));
    }
}
