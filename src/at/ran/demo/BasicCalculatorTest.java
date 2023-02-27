package at.ran.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private BasicCalculator basicCalculator;

    @BeforeEach
    void setUp() {
        basicCalculator = new BasicCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {

        double result = basicCalculator.add(4,7);
        Assertions.assertEquals(11,result);
    }

    @Test
    void divide() {
        double result  = basicCalculator.divide(4,2);
        Assertions.assertEquals(2,result);
    }
    @Test
    void divide1(){
        try{
            double result  = basicCalculator.divide(4,0);
            Assertions.assertTrue(false);
        }catch(Exception exception){
            Assertions.assertTrue(true);
        }


    }
}