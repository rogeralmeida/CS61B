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


    @Test
    public void testAValidLeapYear() throws Exception {
        Assert.assertTrue(Date.isLeapYear(2016));
    }

    @Test
    public void testNotValidLeapYear() throws Exception {
        Assert.assertFalse(Date.isLeapYear(2015));
    }

    @Test
    public void testDaysInMonth() throws Exception {
        Assert.assertThat(Date.daysInMonth(02, 2016), is(29));
        Assert.assertThat(Date.daysInMonth(01, 2014), is(31));
    }

    @Test
    public void testInvalidDates() throws Exception {
        Assert.assertFalse(Date.isValidDate(02, 29, 2014));
        Assert.assertFalse(Date.isValidDate(02, -1, 2014));
        Assert.assertFalse(Date.isValidDate(13, 29, 2014));
        Assert.assertFalse(Date.isValidDate(02, 5, -1));
    }


    @Test
    public void testValidDates() throws Exception {
        Assert.assertTrue(Date.isValidDate(02, 29, 2016));
        Assert.assertTrue(Date.isValidDate(01, 29, 2016));
        Assert.assertTrue(Date.isValidDate(8, 31, 2016));

    }
}

