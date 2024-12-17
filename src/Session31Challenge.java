/*Dado un día del año, ¿sabrías decir cuantos días faltan para Nochevieja? Asumiremos que nos encontramos en un año
 no bisiesto.
       Entrada

        La entrada comenzará con un entero para especificar el número de casos de prueba que vendrá a continuación.
         Para cada caso de prueba se mostrará una línea en la que aparecerán dos enteros, el primero de ellos será
         correspondiente al día y el segundo correspondiente al mes de una fecha válida.
        Salida

        Para cada fecha de la entrada, se mostrarán el número de días completos que faltan hasta el día de Nochevieja.
        Entrada de ejemplo

        3
        28 12
        30 12
        1 1

        Salida de ejemplo

        3
        1
        364*/

import java.util.Scanner;

public class Session31Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasFaltantes = 0;
        System.out.print("Introduce número de casos: ");
        int casos = sc.nextInt();


        for (int i = 0; i < casos; i++) {
            String[] entrada = sc.nextLine();
        }
    }

}
