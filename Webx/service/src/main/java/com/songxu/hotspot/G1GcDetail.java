package com.songxu.hotspot;

/**
 * Created by songxu on 2017/2/26.
 */
public class G1GcDetail {

    public static final int KB=1024;
    public static final int MB=1024*KB;

    private static void allocateKB(int size) {
        Object object = new byte[size * KB];
    }
    private static void allocateMB(int size) {
        Object object = new byte[size * MB];
    }

    public static void main(String[] args) {


        while (true) {
            allocateKB(128);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
