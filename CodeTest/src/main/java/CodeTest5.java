public class CodeTest5 {
    public static void main(String[] args) {
        String str = new String("abcde"); //문자 사이에 콤마 넣지 말기
        String answer = "";
        if (str.length() % 2 == 0) {
            answer = str.substring(str.length() / 2 - 1, str.length() / 2 + 1); //짝수를 뽑아 낸다.
        }
        else{
            answer = str.substring(str.length() / 2, str.length() / 2 + 1); //홀수를 뽑아낸다.
        }
        System.out.println(answer);
    }
}
