
package OOP1.JavaOOP1.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Person {
    private String fullName;
    private LocalDate birthDate;
    private LocalDate deathDate;

    public Person(String fullName, String birthDateStr) {
        this.fullName = fullName;
        try {
            this.birthDate = LocalDate.parse(birthDateStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format provided for " + fullName);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        if (birthDate != null) {
            return Period.between(birthDate, LocalDate.now()).getYears();
        }
        return 0;
    }
    
    public String getBirthDate() {
        if (birthDate == null) {
            return "N/A";
        }
        return birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public void setBirthDate(String birthDateStr) {
        try {
            this.birthDate = LocalDate.parse(birthDateStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format provided: " + birthDateStr);
        }
    }

    public String getDeathDate() {
        if (deathDate == null) {
            return "N/A";
        }
        return deathDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public void setDeathDate(String deathDateStr) {
        try {
            this.deathDate = LocalDate.parse(deathDateStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format provided: " + deathDateStr);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + ''' +
                ", age=" + getAge() +
                ", birthDate=" + getBirthDate() +
                ", deathDate=" + getDeathDate() +
                '}';
    }
}
