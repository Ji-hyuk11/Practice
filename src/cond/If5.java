package cond;

public class If5 {

    public static void main(String[] args) {
        int price = 80000;
        int age = 15;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10,000원이상 구매, 1,000원 할인");
        }
        if (age >= 10) {
            discount = discount + 1000;
            System.out.println("10세이하 1,000원 할인");
        }

        System.out.println("총 할인 금액은 " + discount + "원입니다.");
    }
}
