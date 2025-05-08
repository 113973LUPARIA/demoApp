package org.example.demoapp.junit.concepto1;

import org.example.demoapp.service.IVACalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IVACalculatorTest {

    IVACalculator calculator = new IVACalculator();

    /**
     * Escribe un test que verifique que el método `calculateIVA` de `IVACalculator`
     * calcula correctamente el IVA para una cantidad dada.
     * - Usa 100 como cantidad base y verifica que el resultado es 21.
     */
    @Test
    void calculateIVATest(){
    }

    /**
     * Escribe un test que verifique que el método `calculateIVA` de `IVACalculator`
     * maneja correctamente una cantidad base de 0.
     * - Usa 0 como cantidad base y verifica que el resultado es 0.
     */
    @Test
    void calculateIVAZeroTest(){
    }

    /**
     * Escribe un test que verifique que el método `calculateIVA` de `IVACalculator`
     * maneja correctamente una cantidad base negativa.
     * - Usa -100 como cantidad base y verifica que el resultado es -21.
     */
    @Test
    void calculateIVANegativeTest(){
    }
}
