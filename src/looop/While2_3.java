package looop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 10;

        while (i <= endNum) {
            sum = sum + i; // 0 + 1 = 1, 1 + 2 = 3, 3 + 3 = 6, 6 + 4 = 10, 10 + 5 = 15
            System.out.println("i=" + i + " sum=" + sum); // sum=1, sum = 3, sum = 6, sum = 10
            i++; // 1(i)+1(i++)=2, 2(i) + 1(i++)=3, 3(i) + 1(i++)=4, 4(i) + 1(i++) = 5,
        }
    }
}
