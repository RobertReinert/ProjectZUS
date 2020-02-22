import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {

    private NameValidator() {
    }

    static boolean validateName(String name){
        return name != null && name.matches("([A-Z][a-z]+)");
    }

    static boolean validateLastName(String lastName){
        return lastName != null & lastName.matches("([A-Z][a-z]+)(-[A-Z][a-z]+)?");
    }




}



