public class CodeTest8 {

    public static void main(String[] args) {
        int answer1 = 0;
        int answer2 = 0;
        int[] sum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numbers = {0,4,5,6,7,8,9};
        for (int i = 0; i < sum.length; i++) {
            answer1 +=sum[i];
        }
         for(int j = 0;  j<numbers.length;  j++) {
            answer2 += numbers[j];
       }
            System.out.println(answer1-answer2);
    }
}

