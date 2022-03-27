package javaBuilder;

import java.util.Calendar;
import java.util.stream.Stream;

public class JavaBuilderExample {

    public static void main(String[] args) {

        //Calendar API
        //JDK에서 실제 활용된 빌더 패턴의 한 예일 뿐 사용하지 말 것.
        //Since 1.8
        Calendar calendar = new Calendar.Builder()
                .setCalendarType("iso8601") //GregorianCalendar
                .setWeekDate(2013, 1, java.util.Calendar.MONDAY)
                .build();

        //Stream
        //Since 1.8
        Stream.builder()
                .add("이것은")
                .add(123)
                .add("스트림 빌더를 활용한")
                .add(456)
                .add("스트림 생성 방식입니다.")
                .add(calendar.getTime())
                .build()
                .forEach(System.out::println);
    }

}
