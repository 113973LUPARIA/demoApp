package org.example.demoapp.mockito.concepto2;

import org.example.demoapp.pruebamock1.Calculadora;
import org.example.demoapp.pruebamock1.Factura;
import org.example.demoapp.pruebamock1.FacturaServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

/**
 * FacturaServicio --> mock Calculadora
 */
public class Inyeccion2Test {

    @Mock
    Calculadora calculadoraMock;

    @InjectMocks // se pone solo sobre la clase en la cual se inyectan los mocks
    FacturaServicio facturaServicio;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void calcularPrecioMockito() {
        // MOCKITO
        // FacturaServicio --> Mock Calculadora

        // configurar entorno
        when(
                calculadoraMock.calcularIVA(anyDouble())
        ).thenReturn(21.0);


        // ejecutar comportamiento a testear
        Factura factura = new Factura(1L, 20d, 5, 5d, 0.20);
        double result = facturaServicio.calcularPrecio(factura);
        assertEquals(121, result);

        // verificaciones mockito:
        verify(calculadoraMock, times(2)).calcularIVA(100.0);
        verify(calculadoraMock, never()).calcularIVAPlus(anyDouble());
    }
}
