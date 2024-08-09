package cond;

public class If4 {

    public static void main(String[] args) {
        int age = 17;

        if (age <= 7) { // 만약 age가 7살보다 작거나 같다면 "미취학 아동입니다."
            System.out.println("미취학 아동입니다.");
        } else if (age <= 13) { // 만약 위의 조건이 아니고 age가 13살보다 작거나 같다면 "초등학생입니다"
            System.out.println("초등학생입니다.");
        } else if (age <= 16) { // 만약 위의 조건이 아니고 age가 16살보다 작거나 같다면 "중학생입니다"
            System.out.println("중학생입니다.");
        } else if (age <= 19) { // 만약 위의 조건이 아니고 age가 19살보다 작거나 같다면 "고등학생입니다"
            System.out.println("고등학생입니다.");
        } else { // 만약 위의 조건들이 모두 아니라면 "성인입니다"
            System.out.println("성인입니다.");
        }
    }
}
