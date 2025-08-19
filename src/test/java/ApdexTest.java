import org.example.Apdex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {

    @Test
    public void calcularApdexExcelente() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        Double score = apdex.calcularApdex(770, 60, 10);
        
        // assert
        assertEquals(0.96, score, 0.01);
    }

    @Test
    public void calcularApdexBom() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        Double score = apdex.calcularApdex(550, 200, 10);

        // assert
        assertEquals(0.85, score, 0.01);
    }

    @Test
    public void calcularApdexRazoavel() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        Double score = apdex.calcularApdex(400, 450, 10);

        // assert
        assertEquals(0.72, score, 0.01);
    }

    @Test
    public void calcularApdexRuim() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        Double score = apdex.calcularApdex(200, 450, 10);
        System.out.println(score);

        // assert
        assertEquals(0.64, score, 0.01);
    }

    @Test
    public void calcularApdexInaceitavel() {
        // arrange
        Apdex apdex = new Apdex();

        // act
        Double score = apdex.calcularApdex(100, 450, 200);

        System.out.println(score);
        // assert
        assertEquals(0.43, score, 0.01);
    }
}
