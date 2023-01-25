public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void printInfoAboutVersion(String os, int year) {
        int testYear = 2015;
        if (os.equalsIgnoreCase("ios") && year <= testYear) {
            System.out.println("установите облегченную версию для IOS");
        } else if (os.equalsIgnoreCase("ios") && year > testYear){
            System.out.println("Установите приложение для IOS");
        } else if (os.equalsIgnoreCase("android") && year <= testYear) {
            System.out.println("установите облегченную версию для Android");
        } else {
            System.out.println("Установите приложенеи для Android");
        }

    }


    public static void printLeapOrNotLeapYear(int years) {
        if (years % 2 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println(years + " - Год високосный");
        } else {
            System.out.println(years + " - год не високосный");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2022;
        printLeapOrNotLeapYear(year);

    }

    public static void task2() {
        System.out.println("задача 2");
        int clientDeviceYear = 2022;
        String osName = "ios";
        printInfoAboutVersion(osName, clientDeviceYear);

    }

    public static void task3() {

    }
}