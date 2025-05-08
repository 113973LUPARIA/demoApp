package org.example.demoapp.junit.concepto2;

import org.example.demoapp.domain.SmartPhone;
import org.example.demoapp.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests operaciones CRUD de smartphones")
public class DisplayNameTest {

    /**
     * Escribe un test que verifique que el método `count` de `SmartPhoneServiceImpl`
     * devuelve el número correcto de smartphones.
     * - Asegúrate de que el resultado no es nulo.
     * - Verifica que el número de smartphones es mayor que 0.
     * - Comprueba que el número de smartphones es igual a 3.
     */
    @Test
    @DisplayName("Contar número de smartphones")
    void countTest(){
    }

    /**
     * Escribe un test que verifique que el método `findAll` de `SmartPhoneServiceImpl`
     * devuelve una lista de smartphones.
     * - Asegúrate de que la lista no es nula.
     * - Verifica que el tamaño de la lista es igual a 3.
     */
    @Test
    @DisplayName("Buscar todos los smartphones")
    void findAllTest(){
    }
}
