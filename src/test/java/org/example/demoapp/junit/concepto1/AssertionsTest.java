package org.example.demoapp.junit.concepto1;


import org.example.demoapp.domain.SmartPhone;
import org.example.demoapp.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Las aserciones permiten realizar comprobaciones sobre el código a testear.
 *
 * Si se cumplen las aserciones entonces el test es correcto y se ejecuta con éxito resultando en color verde.
 * Si no se cumplen las aserciones entonces el test es fallido y aparecerá en rojo
 */
public class AssertionsTest {

    /**
     * Escribe un test que verifique que el método `count` de `SmartPhoneServiceImpl`
     * devuelve el número correcto de smartphones.
     * - Asegúrate de que el resultado no es nulo.
     * - Verifica que el número de smartphones es mayor que 0.
     * - Comprueba que el número de smartphones es igual a 3.
     */
    @Test
    void countTest(){
    }

    /**
     * Escribe un test que verifique que el método `findAll` de `SmartPhoneServiceImpl`
     * devuelve una lista de smartphones.
     * - Asegúrate de que la lista no es nula.
     * - Verifica que el tamaño de la lista es igual a 3.
     */
    @Test
    void findAllTest(){
    }
}