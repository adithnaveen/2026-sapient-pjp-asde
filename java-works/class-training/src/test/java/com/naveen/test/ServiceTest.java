package com.naveen.test;

import com.naveen.service.BusinessLogic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServiceTest {
    BusinessLogic businessLogic;
    @BeforeEach
    void setUp() {
         businessLogic = new BusinessLogic();

    }

    @Test
    void testAddPositiveNumbers() {
        int result = businessLogic.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    void testAddZeroNumbers() {
        int result = businessLogic.add(0,0 );
        assertEquals(0, result);

    }

}
