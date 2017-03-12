package com.songxu.hotspot;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;

/**
 * Created by songxu on 2017/1/21.
 */
public class MemoryPoolInfo {

    public static void main(String[] args) {
        List<MemoryPoolMXBean> pools = ManagementFactory.getMemoryPoolMXBeans();
        pools.forEach(pool -> {
            System.out.println("find pool: " + pool.getName());
            MemoryUsage usage = pool.getCollectionUsage();
            if (null != usage) {
                System.out.println(pool.getName() + " memory used : " + usage.getUsed());
            }

        });


    }

}
