package me.day02.datatype;

public class DataTypeExample {
    public static void main(String[] args) {
        // 원시 타입: int (4 == 32 bit), float (4), double (8), char (2), boolean (1)
        // 참조 타입: String, Scanner

//        short s = 100000;

        float f = 3.141592123f;
        double d = 3.141892123;

        System.out.println("f = " + f);
        System.out.println("d = " + d);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);


        byte var1 = 125; // -128 ~ 127
        int var2 = 125;

        for (int i = 0; i < 5; i ++) {
            var1++; // var1 = var1 + 1
            var2++; // var2 = var2 + 1
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
        }


    }
}
