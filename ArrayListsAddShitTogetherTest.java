import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class ArrayListsAddShitTogetherTest
{
    private ArrayLists arrayList;

    @Before
    public void setUp()
    { arrayList = new ArrayLists();
    }

    @Test
    public void test1() {
    //given
    int expected = 10;
    
    ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3));
    ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(0,4));
    
    //when 
    int actual = arrayList.addShitTogether(list1, list2);
    
    //then
    Assert.assertEquals(expected, actual);
}
}
