package www.cs.berkeley.edu.jrs.cs61b.hw.hw3;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static www.cs.berkeley.edu.jrs.cs61b.hw.hw3.Homework3.*;

/**
 * Created by ralmeid on 8/4/14.
 */
public class Homework3Test {

    @Test
    public void testSmoosh() throws Exception {
        int[] originalArray = {0, 0, 0, 0, 1, 1, 0, 0, 0, 3, 3, 3, 1, 1, 0 };
        smoosh(originalArray);
        int[] expectedArray = {0, 1, 0, 3, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        Assert.assertThat(originalArray, is(expectedArray));
    }
}
