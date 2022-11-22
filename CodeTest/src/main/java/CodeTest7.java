public class CodeTest7 {
    public static void main(String[] args) {
        String str1 = new String("1234"); //콤마 찍지 말기
        int answer1 = 0;

        // Integer.parseInt(); 은 String타입의 숫자를 int 타입으로 변환해준다.
        answer1 = Integer.parseInt(str1);
        System.out.println(answer1);
    }
}
