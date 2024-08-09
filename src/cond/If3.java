package cond;

public class If3 {

    public static void main(String[] args) {
        int age = 17;

        if (age <= 7) { // 만약 age가 7살보다 작거나 같다면 "미취학 아동입니다."
            System.out.println("미취학 아동입니다.");
        }
        if (8 <= age && age <= 13) { // 만약 age가 8살보다 크거나 같고 13살보다 작거나 같다면 "초등학생입니다."
            System.out.println("초등학생입니다.");
        }
        if (14 <= age && age <= 16) { // 만약 age가 14살보다 크거나 같고 16살보다 작거나 같다면 "중학생입니다."
            System.out.println("중학생입니다.");
        }
        if (17 <= age && age <= 19) { // 만약 age가 17살보다 크거나 같고 19살보다 작거나 같다면 "고등학생입니다."
            System.out.println("고등학생입니다.");
        }
        if (age >= 20) { // 만약 age가 20살보다 크거나 같다면 "성인입니다."
            System.out.println("성인입니다.");
        }
    }
}
