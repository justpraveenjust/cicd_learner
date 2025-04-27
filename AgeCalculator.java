import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        while (true) {
            try {
                System.out.print("Enter your date of birth (DD/MM/YYYY): ");
                String dobString = scanner.nextLine();
                
                // Parse the input string to LocalDate
                LocalDate dob = LocalDate.parse(dobString, formatter);
                
                // Get current date
                LocalDate currentDate = LocalDate.now();
                
                // Calculate period between dates
                Period period = Period.between(dob, currentDate);
                
                // Display the result
                System.out.println("\nYour age is: " + period.getYears() + " years, " 
                    + period.getMonths() + " months, and " 
                    + period.getDays() + " days");
                
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter date in DD/MM/YYYY format.");
            }
        }
        
        scanner.close();
    }
} 