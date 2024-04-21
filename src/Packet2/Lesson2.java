package Packet2;

import java.io.IOException;
import java.util.Properties;

public class Lesson2 {
    public static void main(String[] args){
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[5];

        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

        for (int num : destinationArray) {
            System.out.print(num + " ");
        }
    }
}
