package www.cs.berkeley.edu.jrs.cs61b.hw.hw2;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by ralmeid on 8/1/14.
 */
public class DateTest {
    @Test
    public void creatingDateWithNumbers() throws Exception {
        Date date = new Date(6, 21, 1982);
        Assert.assertThat(date.toString(), is("06/21/1982"));
    }

    @Test
    public void creatingDateFromString() throws Exception {
        Date date = new Date("12/09/1986");
        Assert.assertThat(date.toString(), is("12/09/1986"));
    }
}
