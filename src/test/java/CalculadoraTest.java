import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSubtraiInteiros() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtraiInt(10, 5);
        assertEquals(5, resultado);

        resultado = calculadora.subtraiInt(5, -3);
        assertEquals(8, resultado);

        resultado = calculadora.subtraiInt(-8, -2);
        assertEquals(-6, resultado);
    }

    @Test
    public void testMultiplicaInteiros() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicaInt(3, 4);
        assertEquals(12, resultado);

        resultado = calculadora.multiplicaInt(7, 0);
        assertEquals(0, resultado);

        resultado = calculadora.multiplicaInt(-2, -5);
        assertEquals(10, resultado);
    }

    @Test
    public void testDivideInteiros() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideInt(8, 2);
        assertEquals(4.0, resultado);

        assertThrows(ArithmeticException.class, () -> {
            calculadora.divideInt(10, 0);
        });
    }
}
