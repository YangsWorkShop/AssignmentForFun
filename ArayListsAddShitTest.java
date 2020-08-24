import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class ArayListsAddShitTest
{
    private ArrayLists arrayList;

    @Before
    public void setUp()
    { arrayList = new ArrayLists();
    }

    @Test
    public void test1(){
    //given
    ArrayList<Integer> expected = new ArrayList(Arrays.asList(1,2,3,4,5,6));
    
    ArrayList<Integer> list1 = new ArrayList(Arrays.asList(1,2,3));
    ArrayList<Integer> list2 = new ArrayList(Arrays.asList(4,5,6));
      
    //when
    ArrayList<Integer> actual = arrayList.addShit(list1, list2);
   
    //then
    Assert.assertEquals(expected, actual);
    
}
}
