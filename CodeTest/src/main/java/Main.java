import java.time.LocalDate;
public class Main {
    public static void main(String[] args) throws Exception {
        //변수 적용
        int month = 1;
        int day = 18;
        //LocalDate를 사용해서 날짜를 표현함
        LocalDate date = LocalDate.of(2022, month, day);
        //plusDays를 통해 해당 날짜를 더 해줌
        LocalDate ninetyEightAfterDate = date.plusDays( 98);

        //해당 날짜 객체의 "월"필드를 반환함.
        int dateMonth = ninetyEightAfterDate.getMonthValue();
        //해당 날짜 객체의 "일" 필드의 값을 반환함.
        int dateDays = ninetyEightAfterDate.getDayOfMonth();
        System.out.println(dateMonth + " 월 " + dateDays + " 일 ");
    }
    }

