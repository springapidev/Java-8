package jan_23.evidences;

import java.util.Arrays;

public class TwoDArraySort {

    public static void main(String[] args) {
        System.out.println("Two Dimensional Array sorting: ");
        defaultSort();
    }
    
    public static void defaultSort(){
        int[][] num = {
            {5, 9, 7, 3, 11},
            {4, 2, 6, 8, 10},
            {3, 1, 5, 9, 7}
        };

        for (int[] oneD : num) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + ", ");
            }
            System.out.println();

        }
    }

}
