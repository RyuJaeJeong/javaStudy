package chap04;

import java.lang.reflect.Array;
import java.util.Arrays;

//셔플
public class ArrayEx7 {
    public static void main(String[] args) {
        int [] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.println(numArr[i]);
        }

        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));


    }  // end main method
}  //end Class
