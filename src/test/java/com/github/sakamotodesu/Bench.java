package com.github.sakamotodesu;


import com.sun.jna.Memory;
import org.junit.Test;

public class Bench {

    @Test
    public void testMemory() throws Exception {
        long then = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            Memory buff = new Memory(1024);
        }
        long now = System.currentTimeMillis();
        System.out.println(now - then);
    }

    @Test
    public void testHeap() throws Exception {
        long then = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            byte[] buff = new byte[1024];
        }
        long now = System.currentTimeMillis();
        System.out.println(now - then);
    }


}
