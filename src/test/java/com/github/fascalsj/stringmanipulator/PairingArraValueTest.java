package com.github.fascalsj.stringmanipulator;

import org.junit.jupiter.api.Test;

public class PairingArraValueTest {
    @Test
    public void findUnpair() {
        Integer[] integers = {9, 3, 9, 3, 9, 7, 9};
        int unpair = 0;
        for (int i = 0; i < integers.length; i++) {
            Boolean found = false;
            for (int j = 0; j < integers.length; j++) {
                if (integers[i] == integers[j] && i!=j) {
                    found = true;
                    break;
                }
            }

            if (false==found) {
                unpair = integers[i];
            }
        }


    }
}
