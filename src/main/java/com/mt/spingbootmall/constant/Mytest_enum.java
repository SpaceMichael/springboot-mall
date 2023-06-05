package com.mt.spingbootmall.constant;

public class Mytest_enum {

    // psvm
    public static void main(String[] args) {
        ProductCategory productCategory = ProductCategory.FOOD;
        String s = productCategory.name();
        System.out.println(s);

        String s2 = "CAR";
        ProductCategory productCategory2 = ProductCategory.valueOf(s2);
        System.out.println(productCategory2);
    }
}
