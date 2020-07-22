package com.github.fascalsj.stringmanipulator;

import org.junit.jupiter.api.Test;

public class ClosestNumber {

    @Test
    public void test() {
        int[] array = {5};
        int x = 3;
        int jarakSebelum = Math.abs(x - array[0]);
        int indexPosition = 0;
        for (int i = 0; i < array.length; i++) {
            int jarak = Math.abs(array[i] - x);
            if (jarak < jarakSebelum) {
                indexPosition = i;
                jarakSebelum = jarak;
            } else if (array.length == 1) {
                indexPosition = i;
            }

        }

        System.out.println("Posisi Index" + indexPosition);


    }
}
