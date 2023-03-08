package com.java.dataType;

/**
 * @auther jm
 * @dare 2023/3/3 11:32
 */
public class CharTest {
    /**
     * char 的使用
     */
    public static void chartest(){
        char ch1,ch2;
        ch1 = 88;
        ch2 = 'Y';
        System.out.print("ch1 and ch2:");
        System.out.println(ch1 + " " + ch2);
    }
    public static void charAdd(){
        char ch1;
        ch1 = 'X';
        System.out.println("ch1 is:" + ch1);
        ch1++;
        System.out.println("ch1 is now:"+ch1);

    }
    public static void main(String[] args) {
        chartest();
        charAdd();
    }
}
