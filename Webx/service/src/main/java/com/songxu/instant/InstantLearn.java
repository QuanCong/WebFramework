package com.songxu.instant;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 * Created by songxu on 2017/2/20.
 */
public class InstantLearn {

    public static int align_size_up_(int size, int alignment) {
        return (((size) + ((alignment) - 1)) & ~((alignment) - 1));
    }
    public static final int G=1024*1024*1024+1;
    public static final int K=1024;
    public static void main(String[] args) {
       /* Instant instant= Instant.now();

        LocalDateTime localDateTime=LocalDateTime.now();
        localDateTime.toLocalTime();

        System.out.println(localDateTime.toLocalTime());
*/

//       int result=align_size_up_(1*G,4*K);
//       System.out.println(result-1*G);
        int mask = ~((1 << 8) - 1);
        int mask2=1<<8;

        int high=1<<8;

        System.out.println(mask&high);
        System.out.println(mask2&high);



    }
}
