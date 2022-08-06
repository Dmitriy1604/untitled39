public class Homework {
    public static void main(String[] args) {
        int year = 1991;
        Homework homework = new Homework();
        homework.isLeapYearAndPrint(year);


        int clientOs = 0;
        homework.checkAndPrintSuitableOS(clientOs, year);

        int deliveryDistance = 95;
        System.out.println(homework.culculateDeliveryDays(deliveryDistance)+ " дня");
    }

    public void isLeapYearAndPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%s год високосный\n", year);
        } else {
            System.out.printf("%s год не високосный\n", year);
        }
    }


    public void checkAndPrintSuitableOS(int clientOs, int year) {

        if (clientOs == 0 && year == 2022) {
            System.out.println("актуальная версия  для IOS");
        } else if (clientOs == 0 && year < 2022) {
            System.out.println("облегченная версия  для IOS");
        } else if (clientOs == 1 && year == 2022) {
            System.out.println("актуальная версия Android");
        } else if (clientOs == 1 && year < 2022) {
            System.out.println("облегченная версия Android");
        } else {
            System.out.println("Oc не обслуживается");
        }
    }


    public int culculateDeliveryDays(int distance) {

        if (distance<20 && distance > 0) {
            return 1;
        } else if(distance < 60 && distance >=20) {
            return 2;
        } else if(distance<100 && distance >=60) {
            return 3;
        } else {
            System.out.println("доставка невозможна");
            throw new  RuntimeException("доставка невозможна");
        }
    }

}
