import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void adicionarNumeroTest(){
        Calculadora calc = new Calculadora();
        calc.setNum1(1);
        calc.setNum2(2);
        assertEquals(1,calc.getNum1(),0.1);
        assertEquals(2,calc.getNum2(),0.1);
    }

    
}
