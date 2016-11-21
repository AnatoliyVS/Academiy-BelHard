package practicaltasks.task006;

import java.util.Scanner;

/**
 *
 * @author Стесик Анатолий
 */
public class Main {

    private static int matrix[][];
    private static final int MAX_SIZE = 10;

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите размер N:");
//        int inputSizeMatix = scan.nextInt();

        matrix = new int[MAX_SIZE][MAX_SIZE];

        for (int i = 0; i < matrix.length; i++) {
            for (int[] matrix1 : matrix) {
                System.out.print(matrix1[i]);
            }
            System.out.println();
        }
        
        
    }

}
