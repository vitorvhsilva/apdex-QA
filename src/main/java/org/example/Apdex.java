package org.example;

public class Apdex {
    public Double calcularApdex(Integer satisfeitas, Integer tolerantes, Integer fracassadas) {
        int total = satisfeitas + tolerantes + fracassadas;

        if (total == 0) {
            return 0.0;
        }

        return (satisfeitas + (tolerantes / 2.0)) / total;
    }
}
