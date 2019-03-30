package org.dimigo.basic;

public class PrimitiveDataType {
    static boolean flag; //전역변수는 자동으로 초기회 해준다!

    public static void main(String[] args) {


        if (flag) {
            System.out.println("참입니다");
        } else {
            System.out.println("올");
        }
        System.out.println(flag ? "ckadlqslek!" : "거짓");
//answkgud
        char c1 = 'a';
        char c2 = 65;
        char c3 = '\u0041';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        String name = "이우신";
        System.out.println("이름 : " + name);

        //정수형
        int i1 = 10;
        int i2 = 0b00001010;
        int i3 = 012;
        int i4 = 0x0A;

        System.out.printf("%d, %d, %d, %d\n", i1, i2, i3, i4);

        //byte타입(-128~ 127)
        byte b1 = -128;
        byte b2 = 127;
        System.out.println(b2);

        //정수의 범위
        System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);

        long n = 10000000000L;
        System.out.println(n);

        //실수형
        float f1 = 3.14f;
        double d1 = 3.14;

        float f2 = 0.12345678901234567890f;
        double d2 = 0.12345678901234567890;
        System.out.println(f2);
        System.out.println(d2);

        System.out.printf("%c, %d, %.2f, %s%n", 'A', 100, 12.34, "I love JAVA");


    }
}
