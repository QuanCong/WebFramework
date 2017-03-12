package com.songxu.hotspot;

/**
 * Created by songxu on 2017/2/4.
 */
public class ArgsTest {

    public static void main(String[] args) {


        for (int i = 0; i < args.length; i++) {
            System.out.println("args = [" + args + "]");
        }

        //byte[] data;
        for (; ; ) {
            byte[] data = new byte[1024 * 1024];
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }

}
