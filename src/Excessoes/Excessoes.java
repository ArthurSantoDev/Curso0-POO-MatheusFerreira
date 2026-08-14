package Excessoes;

public class Excessoes {
    public static void main(String[] args) {


        try{
        int[] arr = new int[10];
        System.out.println(arr[11]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora dos limites do array");
        }

        int[] arr1 = new int[10];
        int index = 11;
        if (index >= 0 && index < arr1.length) {
            System.out.println(arr1[index]);
        } else {
            System.out.println("Índice fora dos limites do array");
        }


        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Objeto nulo acessado");
        }

        String text1 = null;
        if (text1 != null) {
            System.out.println(text1.length());
        } else {
            System.out.println("Objeto nulo acessado");
        }

        try {
            int number = Integer.parseInt("abc");

        }catch (NumberFormatException e) {
            System.out.println("Formato de número inválido");
        }


        int number1 = Integer.parseInt("abc");
        if (number1 >= Integer.MIN_VALUE && number1 <= Integer.MAX_VALUE) {
            System.out.println(number1);
        } else {
            System.out.println("Formato de número inválido");
        }

    }
}
