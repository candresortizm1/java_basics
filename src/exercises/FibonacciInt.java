package exercises;

import java.util.Scanner;

public class FibonacciInt {
    public FibonacciInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entró al ejercicio 2 <<Imprimir Fibonacci>>:");
        System.out.println("Escriba el número de términos que quiere de la serie:");
        int n_elements = scanner.nextInt();
        final int INIT_NUMBERS = 2;
        int prev1_number = 1;
        int prev2_number = 0;
        int temp = 0;
        if(n_elements<=0){
            System.out.println("por favor ingrese un número natural");
        }else{
            System.out.println("F(0)="+prev2_number);
            if(n_elements>1){
                System.out.println("F(1)="+prev1_number);
                for (int i=0;i<n_elements-INIT_NUMBERS;i++){
                    temp = prev1_number + prev2_number;
                    prev2_number = prev1_number;
                    prev1_number = temp;
                    if(temp < 0){
                        System.out.println("Número fuera de rango");
                        break;
                    }else{
                        System.out.println("F("+(i+INIT_NUMBERS)+")="+temp);
                    }

                }
            }
        }

    }
}
