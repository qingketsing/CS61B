package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddConstantTest {

    @Test
    public void testAddConstantOne() {
        IntList lst = IntList.of( 2, 3, 4, 5, 6);
        IntListExercises.addConstant(lst, 0);
        assertEquals("2 -> 3 -> 4 -> 5 -> 6", lst.toString());
    }

    @Test
    public void testAddConstantTwo() {
        IntList lst = IntList.of( 3, 4, 5, 6, 7);
        IntListExercises.addConstant(lst, 0);
        assertEquals("3 -> 4 -> 5 -> 6 -> 7", lst.toString());
    }

    @Test
    public void testAddToLargeList() {
        IntList lst = IntList.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        IntListExercises.addConstant(lst, 10);
        assertEquals("11 -> 12 -> 13 -> 14 -> 15 -> 16 -> 17 -> 18 -> 19", lst.toString());
    }
}
