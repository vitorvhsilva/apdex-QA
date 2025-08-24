// Vitor Hugo da Silva - RM558961
package org.example;

public class Apdex {
    public Double calcularApdex(Integer satisfeitas, Integer tolerantes, Integer fracassadas) {
        int total = satisfeitas + tolerantes + fracassadas;

        if (total == 0) {
            return 0.0;
        }

        return (satisfeitas + (tolerantes / 2.0)) / total;
    }

    public ClassificacaoApdex classificarApdex(Double score) {
        if (score >= 0.94) { return ClassificacaoApdex.EXCELENTE; }
        else if (score >= 0.85) { return ClassificacaoApdex.BOM; }
        else if (score >= 0.70) { return ClassificacaoApdex.RAZOAVEL; }
        else if (score >= 0.50) { return ClassificacaoApdex.RUIM; }
        else { return ClassificacaoApdex.INACEITAVEL; }
    }
}
