package lowlevel;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SummationTest {



        @Test
        public void test1() {
            assertEquals(1,
                    Summation.summation(1));
        }

        @Test
        public void test2() {
            assertEquals(36,
                    Summation.summation(8));
        }

    @Test
    public void test3() {
        assertEquals(55,
                Summation.summation(10));
    }
}