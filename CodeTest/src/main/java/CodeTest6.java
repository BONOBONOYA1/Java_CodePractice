public class CodeTest6 {
    public static void main(String[] args) {
        //변수를 a와 b에 정해 넣어줌.
        int a = 3;
        int b = 5;
        int answer = 0;
        if(a<b) {
            for(int i=a; i<=b; i++)
                answer +=i;
        } else {
            for(int i=b; i<=a; i++)
                answer +=i;
        }
        System.out.println(answer);
    }
}
