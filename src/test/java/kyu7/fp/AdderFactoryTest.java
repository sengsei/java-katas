package kyu7.fp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderFactoryTest {

    @Test
    public void shouldAddOneToFour(){
       assertEquals(5,AdderFactory.create(1).applyAsInt(4));
        System.out.println(AdderFactory.create(1).applyAsInt(-5));
    }

}