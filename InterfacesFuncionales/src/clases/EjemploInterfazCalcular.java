package clases;

import interfaces.Calcular;

public class EjemploInterfazCalcular {
    public static void main(String[] args) {
        Calcular obj = (v1, v2) -> {
            int resultado = v1 + v2;
            System.out.println(resultado);
        };
        
        obj.calcular(10, 20);
    }
}
