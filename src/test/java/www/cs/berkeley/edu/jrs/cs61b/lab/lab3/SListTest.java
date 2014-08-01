package www.cs.berkeley.edu.jrs.cs61b.lab.lab3;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by ralmeid on 8/1/14.
 */
public class SListTest {

    private SList sList;

    @Before
    public void setUp() throws Exception {
        sList = new SList();
    }

    @Test
    public void shouldInsertInFront() throws Exception {
        sList.insertFront(1);
        Assert.assertNotNull("Head should not be null", sList.getHead());
        Assert.assertNotNull("Tail should not be null", sList.getTail());
        Assert.assertThat("The List should have the one and only inserted object", sList.toString(), is("[  1  ]"));
    }

    @Test
    public void shouldInsertInEnd() throws Exception {
        sList.insertEnd(1);
        Assert.assertNotNull("Head should not be null", sList.getHead());
        Assert.assertNotNull("Tail should not be null", sList.getTail());
        Assert.assertThat("The List should have the one and only inserted object", sList.toString(), is("[  1  ]"));
    }


    @Test
    public void shouldUnderstandInsertionsInaNonEmptyList() throws Exception {
        sList.insertFront(5);
        sList.insertEnd(6);
        sList.insertFront(4);
        Assert.assertThat(sList.getHead().item, CoreMatchers.<Object>is(4));
        Assert.assertThat(sList.getTail().item, CoreMatchers.<Object>is(6));
        Assert.assertThat("The List should have the inserted objects", sList.toString(), is("[  4  5  6  ]"));
    }
}
