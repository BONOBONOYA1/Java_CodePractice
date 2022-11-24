public class Test1 {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){             //9층짜리 별을 만들어준다.
            for(int j=0; j<10-i; j++){    //삼각형 공백을 만들기 위한 for문
                System.out.print(" ");    //공백 출력 " "시 한칸 띄어줘야 한다.
            }
            for(int j=0; j<2*i+1; j++) { //층마다 별 홀수 개수를 맞추기 위한 for문
                System.out.print("*");     //별모양 출력
            }
            System.out.println();
        }
    }
}
