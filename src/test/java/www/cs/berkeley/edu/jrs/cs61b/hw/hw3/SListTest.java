package www.cs.berkeley.edu.jrs.cs61b.hw.hw3;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by ralmeid on 8/7/14.
 */
public class SListTest {
    @Test
    public void testSquish() throws Exception {
        //For example, if the input list is [ 0 0 0 0 1 1 0 0 0 3 3 3 1 1 0 ], the
        //        *  output list is [ 0 1 0 3 1 0 ].
        SList sList = new SList();
        sList.insertEnd(0);
        sList.insertEnd(0);
        sList.insertEnd(0);
        sList.insertEnd(0);
        sList.insertEnd(1);
        sList.insertEnd(1);
        sList.insertEnd(0);
        sList.insertEnd(0);
        sList.insertEnd(0);
        sList.insertEnd(3);
        sList.insertEnd(3);
        sList.insertEnd(3);
        sList.insertEnd(1);
        sList.insertEnd(1);
        sList.insertEnd(0);
        sList.squish();
        Assert.assertThat(sList.toString(), is("[  0  1  0  3  1  0  ]"));

    }

    @Test
    public void testTwins() throws Exception {
        SList sList = new SList();
        sList.insertEnd(3);
        sList.insertEnd(7);
        sList.insertEnd(4);
        sList.insertEnd(2);
        sList.insertEnd(2);
        sList.twin();
        Assert.assertThat(sList.toString(), is("[  3  3  7  7  4  4  2  2  2  2  ]"));
    }
}
