import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toUpperCase();
        Weekend weekend = Weekend.valueOf(day);

        switch (weekend){
            case MONDAY -> System.out.println("Понедельник жаваны окуйм");
            case TUESDAY -> System.out.println("Вторник typing кылам");
            case WEDNESDAY -> System.out.println("Среда английский окуйм");
            case THURSDAY -> System.out.println("Четверг практика кылам");
            case FRIDAY -> System.out.println("Пятница футбол ойнойм");
            case SATURDAY, SUNDAY -> System.out.println("Суббота жана Воскресенье эс алам");
        }
    }
}
