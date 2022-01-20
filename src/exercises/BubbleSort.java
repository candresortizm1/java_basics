package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public BubbleSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entró al ejercicio 3 <<Bubble Sort>>:");
        System.out.println("Ingrese los números que quiere ordenar, separados por comas: (ej: 5,7,8,7 )");
        String input_string = scanner.nextLine();
        String[] array = input_string.split(",");
        int[] numbers_array1 = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
        int[] numbers_array = new int[array.length];
        for(int i=0; i < array.length; i++){
            numbers_array[i]=Integer.parseInt(array[i]);
        }
        System.out.println(bubble(numbers_array));;
    }

    private String bubble(int[] numbers_array){
        boolean swapped=false;
        do{
            swapped=false;
            for(int i=1;i< numbers_array.length;i++){
                if(numbers_array[i-1]>numbers_array[i]){
                    int temp=numbers_array[i-1];
                    numbers_array[i-1]=numbers_array[i];
                    numbers_array[i]=temp;
                    swapped=true;
                }
            }
        }while (swapped);
        return Arrays.toString(numbers_array);
    }
}
