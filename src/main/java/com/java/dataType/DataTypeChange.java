package com.java.dataType;

/**
 * @auther jm
 * @dare 2023/3/3 12:10
 *
 */
public class DataTypeChange {
    /**
     * java 的数据类型转化
     */
    public static void conversion(){
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("Conversion of int to byte");
        b = (byte)i;
        System.out.println("i and b:"+ i +" "+ b); //i and b:257 1

        System.out.println("Conversion of double to int");
        i = (int)d;
        System.out.println("d and i:"+ d +" "+ i);//d and i:323.142 323

        System.out.println("Conversion of double to byte");
        b = (byte)d;
        System.out.println("d and b:"+d+ " "+b);//d and b:323.142 67

    }
    public static void main(String[] args) {
        conversion();
    }
}
