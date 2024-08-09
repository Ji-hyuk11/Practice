package cond.ex;

public class CondEx3 {

    public static void main(String[] args) {

        int usd = 1000;
        int krw;

        if(usd < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (usd == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            krw = usd * 1300;
            System.out.println("USD: " + usd + "$");
            System.out.println("환전 금액은 " + krw + "원입니다.");
        }
    }
}
