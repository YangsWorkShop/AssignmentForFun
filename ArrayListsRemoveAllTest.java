import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class ArrayListsRemoveAllTest{
    private ArrayLists arrayList;

    @Before
    public void setUp()
    { arrayList = new ArrayLists();
    }

    @Test
    public void test1(){
    //given 
    ArrayList<Integer> expected = new ArrayList(Arrays.asList(1,2,3,4));
    
    ArrayList<Integer> original = new ArrayList(Arrays.asList(1,2,3,5,5,4,5,5));
    int toRemove = 5;
    
    //when
    ArrayList<Integer> actual = arrayList.removeAll(original, toRemove);
    
    //then
    Assert.assertEquals(expected, actual);
    }
    
}
