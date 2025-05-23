package org.example.demoapp.junit.concepto5;

import org.example.demoapp.domain.SmartPhone;
import org.example.demoapp.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Ciclo de vida JUnit
 * @BeforeAll una vez por clase, antes de todos los tests.
 * @AfterAll una vez por clase, después de todos los tests.
 */
public class LifeCycleClassTest {

    SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

    /**
     * Se ejecuta antes de cada método de test
     */
    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll");
    }

    /**
     * Se ejecuta después de cada método de test
     */
    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }

    @Test
    void countTest(){
        System.out.println("countTest");

        Integer num = service.count();

        assertNotNull(num);
        assertTrue(num > 0);
        assertEquals(3, num);

    }

    @Test
    void findAllTest(){
        System.out.println("findAllTest");
        List<SmartPhone> smartphones =  service.findAll();

        assertNotNull(smartphones);
        assertEquals(3, smartphones.size());
    }
}
