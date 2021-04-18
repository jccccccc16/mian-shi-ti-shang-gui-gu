package com.cjc;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2021/4/18
 * Time: 16:28
 * To change this template use File | Settings | File Templates.
 **/
public class MethodParamDemo {

    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 17200;
        int [] arr = {1,2,3,4,5};
        MyData mydata = new MyData();
        change(i,str,num,arr,mydata);
        System.out.println("i= "+i);
        System.out.println("str= "+str);
        System.out.println("num= "+num);
        System.out.println("arr= "+ Arrays.toString(arr));
        System.out.println("my.a= "+ mydata.a);
    }

    public static void change(int j,String s,Integer num,int [] a,MyData myData){
        j+=1;
        s+="world";
        num+=1;
        a[0]+=1;
        myData.a+=1;
    }



}
class MyData{
    int a = 10;
}
