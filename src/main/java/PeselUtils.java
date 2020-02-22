public class PeselUtils {


    private PeselUtils() {
    }

    static boolean validate(String pesel) {
        return pesel.matches("\\d{11}");
    }



}
