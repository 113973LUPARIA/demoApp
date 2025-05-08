package org.example.demoapp.junit.concepto1;

import org.example.demoapp.domain.SmartPhone;
import org.example.demoapp.domain.pieces.Battery;
import org.example.demoapp.domain.pieces.CPU;
import org.example.demoapp.domain.pieces.Camera;
import org.example.demoapp.domain.pieces.RAM;
import org.example.demoapp.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartPhoneServiceTest {

    /**
     * Escribe un test que verifique que el método `save` de `SmartPhoneServiceImpl`
     * lanza una excepción cuando se intenta guardar un smartphone nulo.
     * - Usa `assertThrows` para verificar que se lanza una `IllegalArgumentException`.
     */
    @DisplayName("Comprobar excepción cuando el smartphone a guardar es nulo")
    @Test
    void saveNullTest(){
    }

    /**
     * Escribe un test que verifique que el método `save` de `SmartPhoneServiceImpl`
     * asigna un ID cuando el ID del smartphone es nulo.
     * - Crea un smartphone con ID nulo y verifica que se le asigna un ID al guardarlo.
     * - Comprueba que el número total de smartphones aumenta en 1.
     */
    @DisplayName("Comprobar que se asigna un id cuando el id que pasamos es null")
    @Test
    void saveIdNullTest(){
    }

    /**
     * Escribe un test que verifique que el método `save` de `SmartPhoneServiceImpl`
     * asigna un ID cuando el ID del smartphone es 0.
     * - Crea un smartphone con ID 0 y verifica que se le asigna un ID al guardarlo.
     * - Comprueba que el número total de smartphones aumenta en 1.
     */
    @DisplayName("Comprobar que se asigna un id cuando el id que pasamos es 0")
    @Test
    void saveIdZeroTest(){
    }

    /**
     * Escribe un test que verifique que el método `save` de `SmartPhoneServiceImpl`
     * actualiza un smartphone existente.
     * - Crea un smartphone con un ID existente y modifica algunos de sus atributos.
     * - Verifica que el smartphone se actualiza correctamente y que el número total de smartphones no cambia.
     */
    @DisplayName("Comprobar que se actualiza un smartphone existente")
    @Test
    void saveUpdateTest(){
    }

    /**
     * Escribe un test que verifique que el método `save` de `SmartPhoneServiceImpl`
     * lanza una excepción cuando se intenta guardar un smartphone con un ID negativo.
     * - Crea un smartphone con un ID negativo y verifica que se lanza una `IllegalArgumentException`.
     * - Comprueba que el número total de smartphones no cambia.
     */
    @DisplayName("Comprobar id negativo, no se debería añadir un smartphone")
    @Test
    void saveNegativeIdTest(){
    }

    private void holaMundo(){
        System.out.println("Hola mundo");
    }

    /**
     * Escribe un test que verifique que el método `delete` de `SmartPhoneServiceImpl`
     * maneja correctamente un ID nulo.
     * - Verifica que el método devuelve `false` cuando se intenta eliminar un smartphone con ID nulo.
     */
    @Test
    void deleteNullTest(){
    }

    /**
     * Escribe un test que verifique que el método `delete` de `SmartPhoneServiceImpl`
     * maneja correctamente un ID que no existe.
     * - Verifica que el método devuelve `false` cuando se intenta eliminar un smartphone con un ID que no existe.
     */
    @Test
    void deleteNotContainsTest(){
    }

    /**
     * Escribe un test que verifique que el método `delete` de `SmartPhoneServiceImpl`
     * elimina correctamente un smartphone existente.
     * - Verifica que el método devuelve `true` cuando se elimina un smartphone con un ID existente.
     */
    @Test
    void deleteOkTest(){
    }

    /**
     * Escribe un test que verifique que el método `deleteAll` de `SmartPhoneServiceImpl`
     * elimina todos los smartphones.
     * - Verifica que el número total de smartphones es 0 después de llamar a `deleteAll`.
     */
    @Test
    void deleteAllTest(){
    }

}
