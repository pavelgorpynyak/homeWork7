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


        String fullName2 =  "Иванов Семён Семёнович";
        String fullNameWithReplace = fullName2.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullNameWithReplace);

        // Задание 3v2

        String newString = "";
        for (int i = 0; i < fullName2.length(); i++) {

            if (fullName2.charAt(i) == 'ё') {
                newString += "e";
            } else {
                newString += fullName2.charAt(i);
            }
        }
        System.out.println(newString);
    }
}