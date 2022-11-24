public class Test2 {
    public String solution(int[] arr1) {
        int sum = 0; //sum 초기화
        String answer = "";
        for (int i : arr1){
            sum += i;
        }
        switch (sum) { //switch 조건문에 들어갈 수 있는 입력 변수의 타입은 byte, short, char, int만 가능하다.
            case 0 : answer = "윷"; break;
            case 1 : answer = "걸"; break;
            case 2 : answer = "개"; break;
            case 3 : answer = "모"; break;
            case 4 : answer = "도"; break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Test2 method = new Test2(); //위 메소드를 호출
        int[] arr1 = {0,1,0,0};  //값 지정
        System.out.println(method.solution(arr1));
    }
}



