import java.time.LocalDate;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try{
        System.out.print("Year:");
        int year = scanner.nextInt();
        System.out.print("Month:");
        int monthIdx = scanner.nextInt();
        System.out.print("Day:");
        int day = scanner.nextInt();

        LocalDate date = LocalDate.of(year, monthIdx, day);
        System.out.println(date.getDayOfWeek());
        }catch (Exception e) {
            System.out.println("wrong data");
        }
        scanner.close();


    }
}