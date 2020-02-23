import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BokZus {
    public static void main(String[] args) {

        String name;
        String lastName;
        String pesel;


        Scanner scanner = new Scanner(System.in);


        System.out.println("WITAMY W BOK ZUS! PROSIMY O PODANIE PONIŻSZYCH DANYCH:");
        System.out.println("Imię: ");
        name = scanner.nextLine();

        while (!NameValidator.validateName(name)){
            System.out.println("Niepoprawne imię, wpisz ponownie");
            name = scanner.nextLine();
        }

        System.out.println("Nazwisko: ");
        lastName = scanner.nextLine();

        while (!NameValidator.validateLastName(lastName)){
            System.out.println("Niepoprawne nazwisko, wpisz ponownie");
            lastName = scanner.nextLine();
        }
        System.out.println("PESEL: ");
        pesel = scanner.nextLine();

        while (!PeselUtils.validate(pesel)){
            System.out.println("Niepoprawny PESEL, wpisz ponownie");
            lastName = scanner.nextLine();
        }

        System.out.println("Imię: " + name + " Nazwisko: " + lastName + " PESEL: " + pesel);

        Client client = new Client(name, lastName, pesel);
        System.out.println(client.toString());

        Period lifetime = Period.between(client.getDateOfBirth(),LocalDate.now());
        if (lifetime.getYears() >= 65){
            System.out.println("Witamy szanownego Emeryta");
        } else {
            LocalDate retirementDate = client.getDateOfBirth().plusYears(65);
            long daysToRetire = ChronoUnit.DAYS.between(LocalDate.now(), retirementDate);
            System.out.println("Chyć się roboty, zostało Ci " + daysToRetire + " pracy!");
        }










    }
}
