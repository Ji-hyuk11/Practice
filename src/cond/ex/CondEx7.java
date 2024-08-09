package cond.ex;

public class CondEx7 {

    public static void main(String[] args) {
        int x = 20;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("정수 x는 " + result + "입니다.");
        System.out.println("---------");

        if (x % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
