public class Main {
    public Main() {
    }
    public static void printSeparator () {
        System.out.println("++++++++");
        System.out.println("--------");
    }
    public static void printIssues(int  issuesByMonths) {
        System.out.println( issuesByMonths);
    }

    public static int sum(int [] numbers) {
        int sum  = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] issuesByMonths = {4,6,7,9,2,5,12,3,7,10,6,7,1,8};
        printSeparator();
        for (int i = 0 ; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3  == 0) {
                printSeparator();
            }

        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);

        System.out.println();


        String phone = "+911-11 45 6-45";
        phone = phone.replace("-","");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
           phone  = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() <10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("среди нас посторанний");
        }
        System.out.println(" номер " + phone);
        String expectedPhone = "79111145645";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = firstName + " " + lastName + " " + middleName ;
        System.out.println(fullName + " Полное Имя");

        System.out.println();

        String anotherName = "Ivanov Ivan Ivanovich";
        anotherName = anotherName.toUpperCase();
        System.out.println(anotherName);

        System.out.println();

        String name = "Иванов Семён Семёнович";
        name = name.replace("ё", "e");
        System.out.println(name);

    }
}