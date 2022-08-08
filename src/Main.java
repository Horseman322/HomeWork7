public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        String firstName = "Ivan";
        String midlName = "Ivannov";
        String lastName = "Ivannovich";
        String fullName = midlName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника " + fullName);
        System.out.println();
        System.out.println("данные ФИО сотрудника для заполнения отчета " + fullName.toUpperCase());
        System.out.println();

        fullName = "Иванов Семён Сенёнович";

        String roll = fullName.replace("ё", "e");

        System.out.println(roll);

    }
}