package com.cjc;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2021/4/18
 * Time: 11:38
 * To change this template use File | Settings | File Templates.
 **/
public class Son extends Father{
    private int i = test();
    private static int j = method();
    static{
        System.out.println("(6)");
    }

    Son(){
        System.out.println("(7)");
    }
    {
        System.out.println("(8)");
    }
    public static int method(){
        System.out.println("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
    }
}
