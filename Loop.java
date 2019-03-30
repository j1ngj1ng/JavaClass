package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {


    for(int i = 2; i<10; i++){
        for(int j = 1; j<10; j++){
            System.out.printf("%d*%d=%d\t", i, j,i*j);
        }
        System.out.println();
    }

    //for each
        int[] arr={1,2,3,4,5};
    for (int i = 0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
    for(int value :arr){
        System.out.println(value);
    }

    //BTS멤머 출력
        String[] BTS = {"JK", "RM", "J-hope", "Jin", "SUGA", "지민", "V"};
        for (String value :BTS) {
            System.out.println(value);
        }

        //while, do~while문 연습하기이ㅣ엄ㅇ리ㅏㅓㄴ인이니ㅏ라ㅣ너ㅏㅣ
        //메뉴처리
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do{
            System.out.println("아이돌 선택");
            System.out.println("1. BTS");
            System.out.println("2. Red");
            System.out.println("3. 엄지");
            System.out.println("9. 종료");
            System.out.print("메뉴입력 => ");

            scanner.nextInt();
            menu =scanner.nextInt();

            switch (menu){
                case 1:
                    System.out.println("BTS를 선택하셨군요");
                    break;
                case 2:
                    System.out.println("Red를 선택하셨군요");
                case 3:
                    System.out.println("엄지를 선택하셨군요");
                    break;
                case 9:
                    System.out.println("Bye");
                    scanner.close();
                    break;

                    default:
                        System.out.println("없는메뉴네요오옹도오오ㅗㅇ도오ㅜ옹뎌ㅑ1");
            }
        }while ( menu !=9);
}
}
