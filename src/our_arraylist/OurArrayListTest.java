package our_arraylist;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurArrayListTest {

    @Test
   public void testZeroSize (){
        OurList<Integer> list = new OurArrayList<>();
        assertEquals(0,list.size());
    }
    @Test
   public void testGivenSize (){
       OurList<Integer> list = new OurArrayList<>();
       list.append(64);
       list.append(3);
       list.append(17);
       assertEquals(3,list.size());
   }
   @Test
   public void testRemoveByID (){
       OurList<Integer> list = new OurArrayList<>();
       list.append(0);
       list.append(1);
       list.append(2);
       assertEquals(Integer.valueOf(1), list.removeByID(1));
   }
   @Test
    public void testRemoveByNonExistID (){
        OurList<Integer> list = new OurArrayList<>();
        list.append(0);
        list.append(1);
        list.append(2);
        assert list.removeByID(5) == null;
    }
    @Test
    public void testSet(){
        OurList<Integer> list = new OurArrayList<>();
        list.append(0);
        list.append(1);
        list.append(2);

        list.set(3,0);
        assertEquals(3,list.get(0));
    }
    @Test
    public void testSetOnNonExistID (){
        OurList<Integer> list = new OurArrayList<>();
        list.append(0);
        list.append(1);
        list.append(2);

        list.set(3,5);
        assertNull(list.get(5));
    }





}