package lowlevel;

import junit.framework.TestCase;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class GrassHopperTest {

    @Test
    public void test1() {
        TestCase.assertEquals('A', GrassHopper.getGrade(95,90,93));
        TestCase.assertEquals('A', GrassHopper.getGrade(100,85,96));
        TestCase.assertEquals('A', GrassHopper.getGrade(92,93,94));
        TestCase.assertEquals('A', GrassHopper.getGrade(100,100,100));
    }
    @Test
    public void test2() {
        TestCase.assertEquals('B', GrassHopper.getGrade(70,70,100));
        TestCase.assertEquals('B', GrassHopper.getGrade(82,85,87));
        TestCase.assertEquals('B', GrassHopper.getGrade(84,79,85));
    }
    @Test
    public void test3() {
        TestCase.assertEquals('C', GrassHopper.getGrade(70,70,70));
        TestCase.assertEquals('C', GrassHopper.getGrade(75,70,79));
        TestCase.assertEquals('C', GrassHopper.getGrade(60,82,76));
    }
    @Test
    public void test4() {
        TestCase.assertEquals('D', GrassHopper.getGrade(65,70,59));
        TestCase.assertEquals('D', GrassHopper.getGrade(66,62,68));
        TestCase.assertEquals('D', GrassHopper.getGrade(58,62,70));
    }
    @Test
    public void test5() {
        TestCase.assertEquals('F', GrassHopper.getGrade(44,55,52));
        TestCase.assertEquals('F', GrassHopper.getGrade(48,55,52));
        TestCase.assertEquals('F', GrassHopper.getGrade(58,59,60));
        TestCase.assertEquals('F', GrassHopper.getGrade(0,0,0));
    }

}
