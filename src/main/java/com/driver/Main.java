package com.driver;

public class Main {
    public static class Product{

        public int product(int x, int y) {
            System.out.println(x*y);

            return x*y;
        }
        public double product(double x, double y) {
            System.out.println(x*y);
            return x*y;
        }
        public int product(int x, int y, int z) {
            System.out.println(x*y*z);
            return x*y*z;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(1,2);
        p.product(2,3,4);
        p.product(3.5,4.5);
    }

}