package OCA.oca_answers;

//https://vceguide.com/what-is-the-result-494/

import java.time.LocalDate;

public class LDTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 30);
        date.plusDays(10);
        System.out.println(date);
    }

}
