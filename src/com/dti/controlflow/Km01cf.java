package com.dti.controlflow;

public class Km01cf {

    public static void main(String[] args) {
        //แบบที่ 1 พิสุจน์ครั้งเดียว จริงทำเท็จไม่ทำ
        int a = 20;
        if (a > 5) {
            System.err.println("Hello...");
        }
        System.err.println("++++++++++++++++");
        //แบบที่ 2 พิสุจน์ครั้งเดียว จริงทำอย่างเท็จทำอีกอย่าง
        int b = 100;
        if (b < 80) {
            System.out.println("Hello...");
        } else {
            System.out.println("Woo....");
            System.out.println("Wow...");
        }
        //แบบพิสูจน์หลายครั้ง : if-else-if,switch-case(พิสูจน์ได้แค่เท่ากันหรือไม่เท่านั้นและใช้ไม่ได้กับข้อความ
        int c = 7;
        if (c > 80) {
            System.out.println("111");
        } else if (c >= 70) {
            System.out.println("222");
        } else if (c > 60) {
            System.out.println("333");
        } else {//ไม่จำเป็นต้องมี if ทั้งนี้ขึ้นอยู่กับโจทน์
            System.out.println("55555555");
        }
        System.out.println("+++++++++++++++");
        int busNumber = 84;
        switch (busNumber) {
            case 80:
                System.out.println("Snamlong");
                break;
            case 57:
                System.out.println("PATA");
                break;
            case 84:
                System.out.println("wutraiking");
                break;
            case 81:
                System.out.println("Siriraj");
                break;
            default:
                System.out.println("Don't have dataT_T");
        }
    }
}
