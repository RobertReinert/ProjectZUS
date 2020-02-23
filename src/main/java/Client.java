import java.time.LocalDate;
import java.time.Period;

public class Client {

    private String name;
    private String lastName;
    private String pesel;
    private char sex;
    private LocalDate dateOfBirth;

    public Client(String name, String lastName, String pesel) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.sex = PeselUtils.readSex(pesel);
        this.dateOfBirth = PeselUtils.readDateOfBirth(pesel);
    }




    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
