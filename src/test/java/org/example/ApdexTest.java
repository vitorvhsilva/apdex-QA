// Vitor Hugo da Silva - RM558961
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {
    private Apdex apdex;

    @BeforeEach
    public void setUp() {
        apdex = new Apdex();
    }

    @Test
    public void calcularApdexExcelente() {
        Double score = apdex.calcularApdex(535000, 20000, 3961);
        assertEquals(0.97, score, 0.01);
        assertEquals(ClassificacaoApdex.EXCELENTE, apdex.classificarApdex(score));
    }

    @Test
    public void calcularApdexBom() {
        Double score = apdex.calcularApdex(450000, 60000, 48961);
        assertEquals(0.85, score, 0.01);
        assertEquals(ClassificacaoApdex.BOM, apdex.classificarApdex(score));
    }

    @Test
    public void calcularApdexRazoavel() {
        Double score = apdex.calcularApdex(360000, 80000, 118961);
        assertEquals(0.72, score, 0.01);
        assertEquals(ClassificacaoApdex.RAZOAVEL, apdex.classificarApdex(score));
    }

    @Test
    public void calcularApdexRuim() {
        Double score = apdex.calcularApdex(300000, 70000, 188961);
        assertEquals(0.59, score, 0.01);
        assertEquals(ClassificacaoApdex.RUIM, apdex.classificarApdex(score));
    }

    @Test
    public void calcularApdexInaceitavel() {
        Double score = apdex.calcularApdex(200000, 60000, 298961);
        assertEquals(0.41, score, 0.01);
        assertEquals(ClassificacaoApdex.INACEITAVEL, apdex.classificarApdex(score));
    }
}
