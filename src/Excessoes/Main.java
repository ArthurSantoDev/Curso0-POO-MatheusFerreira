package Excessoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Integer[] colInt = new Integer[11];
        colInt[0] = 1;
        colInt[1] = 5;
        colInt[2] = 10;
        colInt[3] = 15;
        colInt[4] = 20;
        colInt[5] = null;
        colInt[6] = 45;
        colInt[7] = null;
        colInt[8] = 60;
        colInt[9] = null;
        colInt[10] = 66;

        for (int i = 0; i <= 11; i++) {
            try {
                System.out.println(colInt[i]);
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Não existe este index: "+ i);
            }
        }



    }
}