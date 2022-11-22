public class CodeTest11 {
    public static void main(String[] args) {
        //새로운 변수 phe에 넣어줌
        String phe= new String("01033334444");
        String answer = "";

        //phe.length를 int len에 넣어 정수로 전환
        int len = phe.length();
        //-4는 끝에 4자리 수를 말함.
        int numberLen = len -4;

        //substring을 통해 숫자 시작부터 끝점을 찍어줌.
        answer = phe.substring(0,numberLen);
        //substring을 통해 문자열 시작부터 끝점을 찍어줌.
        String number = phe.substring(numberLen);
        //replaceAll을 통해 첫번째 매개변수는 변환하고자 하는 대상이 될 문자열, 두번째 매개 변수는 변화할 문자 값이다.
            answer = answer.replaceAll("[0-9]","*");

        System.out.println(answer+number);
    }
}
