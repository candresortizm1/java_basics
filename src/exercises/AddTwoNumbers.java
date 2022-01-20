package exercises;
import java.util.Scanner;

public class AddTwoNumbers {
    public AddTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entró al ejercicio 1 <<Suma de dos números>>");
        System.out.println("Escriba el primer número:");
        int sumando_1 = scanner.nextInt();
        System.out.println("Escriba el segundo número:");
        int sumando_2 = scanner.nextInt();
        int resultado = sumando_1 + sumando_2;
        System.out.println("Resultado de la suma: " +resultado);
    }
}
