package com.songxu.luck;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by songxu on 2017/1/25.
 */
public class LuckMoney {

    private static HashMap<String, Integer> result = new HashMap<>(10);
    private static List<Double> resultD;
    private static final DecimalFormat df = new DecimalFormat("#.00");

    static {
        for (int i = 0; i <= 9; i++) {
            result.put(i + "", 0);
        }
    }

    private static void stastics(String valueStr) {
        String suffix = valueStr.substring(valueStr.length() - 1, valueStr.length());
        Integer count = result.get(suffix);
        result.put(suffix, ++count);
    }

    /**
     * 随机红包分配
     *
     * @param total  总金额
     * @param person 总人数
     */
    private static void luckMoney(Double total, int person) {
        for (int i = 1; i <= person; i++) {
            if (i != person) {
                Double temp = Math.random() * total;
                temp = Double.parseDouble(String.format("%.2f", temp));
                stastics(temp.toString());
                total -= temp;
            } else {
                stastics(total.toString());
            }
        }

    }

    private static void getTop3() {
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(result.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            //升序排序
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }

        });
        for (Map.Entry<String, Integer> mapping : list) {
            System.out.println(mapping.getKey() + ":" + mapping.getValue());
        }
    }


    public static void main(String[] args) {
        if (Objects.isNull(args) || args.length == 0) {
            System.exit(0);
        }
        if (args.length < 2 || args[0].equals("-h") || args.equals("-help")) {
            System.out.println("输入两个参数，第一个参数表示总金额，第二个参数表示参与游戏的人数");
            System.exit(0);
        }

        Double total = Double.parseDouble(args[0]);
        Integer persons = Integer.parseInt(args[1]);
        int times = 10000 * 100;
        for (int i = 0; i < times; i++) {
            luckMoney(total, persons);
        }
        getTop3();
    }


}
