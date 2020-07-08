import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @BeforeEach
    void setUp() {
    }


    @Test
    void getSmallestPositiveInteger(){

        Tes test = new Tes();
        test.solution("URRRUULD");
        test.navigate("uuuU");
        System.out.println(test.decryptSecretMessage("ABC"));





//        assertEquals(4,test.solution(new int[]{1, 2, 3}));
//        assertEquals(5,test.solution(new int[]{1, 3, 6, 4, 1, 2}));
//        assertEquals(8,test.solution(new int[]{1, 3, 6, 4, 1, 2,5,7,9}));

    }
}