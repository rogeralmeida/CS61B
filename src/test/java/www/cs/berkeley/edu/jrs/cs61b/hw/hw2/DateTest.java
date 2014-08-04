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


    @Test
    public void testBeforeDate() throws Exception {
        Assert.assertTrue(new Date(04, 20, 1990).isBefore(new Date(04, 20, 1992)));
        Assert.assertFalse(new Date(04, 20, 1990).isBefore(new Date(05, 20, 1980)));
    }

    @Test
    public void testAfterDate() throws Exception {
        Assert.assertTrue(new Date(01, 31, 2012).isAfter(new Date(12, 31, 2011)));
        Assert.assertFalse(new Date(01, 31, 2012).isAfter(new Date(02, 01, 2012)));
    }

    @Test
    public void testDayInYear() throws Exception {
        Assert.assertThat(new Date(01, 01, 2010).dayInYear(), is(1));
        Assert.assertThat(new Date(06, 15, 2011).dayInYear(), is(166));
        Assert.assertThat(new Date(12, 31, 2016).dayInYear(), is(366));

    }

    @Test
    public void testDifferenceBetweenDates() throws Exception {
        Assert.assertThat(new Date(01, 01, 2013).difference(new Date(01, 31, 2013)), is(30));
        Assert.assertThat(new Date(01, 01, 2014).difference(new Date(01, 31, 2010)), is(-1431));
    }
}

