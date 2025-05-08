package org.example.demoapp.junit.concepto6;

import org.example.demoapp.domain.SmartPhone;
import org.example.demoapp.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Deshabilitar casos de test temporalmente debido a:
 * - nuevos desarrollos
 * - corrección de bugs / fallos
 * - ....
 *
 * Se utiliza @Disabled del test a deshabilitar
 */
public class DisabledTest {

    @Test
    void countTest(){
        System.out.println("countTest");

        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

        Integer num = service.count();

        assertNotNull(num);
        assertTrue(num > 0);
        assertEquals(3, num);

    }

    @DisplayName("Encontrar todos los smartphones")
    @Disabled("Deshabilitado por bug #1324")
    @Test
    void findAllTest(){
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        List<SmartPhone> smartphones =  service.findAll();

        assertNotNull(smartphones);
        assertEquals(3, smartphones.size());
    }
}
