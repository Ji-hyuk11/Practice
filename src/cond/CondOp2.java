package cond;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 20;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);

        int num = 10;
        String big = (num > 10) ? "크다" : "작다";
        System.out.println("num = " + num + " 그래서 num은 10보다 크니? " + big);

        num = 10;
        if (num <= 10) {
            System.out.println("num이 10보다 작습니다.");
        } if (num == 10) {
            System.out.println("num이 10과 같습니다.");
        } else {
            System.out.println("num이 10보다 큽니다.");
        }
    }
}