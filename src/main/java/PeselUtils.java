import java.time.LocalDate;

public class PeselUtils {


    private PeselUtils() {
    }

    static boolean validate(String pesel) {
        return pesel.matches("\\d{11}");
    }

    public static char readSex(String pesel) {
        int sex = Integer.parseInt(pesel.substring(9, 10));

        if (!pesel.matches("\\d{11}")) {
            return '0';
        }

        if (sex % 2 == 0) {
            return 'F';
        } else {
            return 'M';
        }

    }

    public static LocalDate readDateOfBirth(String pesel){

        String year = pesel.substring(0,2);
        String month = pesel.substring(2,4);
        String day = pesel.substring(4,6);

        int year1 = Integer.parseInt(year);
        int month1 = Integer.parseInt(month);
        int day1 = Integer.parseInt(day);

        int month3;


        if (month1 <20){
            year1 = 1900+year1;
            month3=month1;
        } else {
            year1 = 2000+year1;
            month3=month1 - 20;

        }

        if (!pesel.matches("\\d{11}")) {
            return LocalDate.MIN;
        } else {
            return LocalDate.of(year1,month3,day1);
        }




    }


}
