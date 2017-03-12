package com.songxu.supertest;

/**
 * Created by songxu on 2017/2/21.
 */
public class Son extends Father {

    @Override
    public void modifyValue() {
        super.modifyValue();
    }

    public static void main(String[] args) {
        Son son=new Son();
        son.modifyValue();
        System.out.println(son.getFatherValue());
    }
}
