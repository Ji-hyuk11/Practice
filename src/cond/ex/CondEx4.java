package cond.ex;

public class CondEx4 {

    public static void main(String[] args) {

        double rating = 7.1;
        String movie1 = "'어바웃타임'";
        String movie2 = "'토이 스토리'";
        String movie3 = "'고질라'";

        if (rating <= 9) {
            System.out.println(movie1 + "을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println(movie2 + "를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println(movie3 + "를 추천합니다.");
        }
    }
}
