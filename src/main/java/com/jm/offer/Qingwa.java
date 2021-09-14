package com.jm.offer;

public class Qingwa {
    public static void main(String[] args) {

    }
    public int numWays(int n) {
        int a = 1, b = 1, sum = 0;
        for (int i = 1; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return b;
    }
}