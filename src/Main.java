import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("ФИО Сотрудника - " + fullName);

        // Задание 2

        String fullNameUpperCase = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета  - " + fullNameUpperCase);

        // Задание 3

        String fullName3 = "Иванов Семён Семёнович";
        String fullNameWithReplace = fullName3.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullNameWithReplace);
    }
}