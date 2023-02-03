public class Main {
    public static void main(String[] args) {
        //третья домашка
        //задачи первая и вторая
        byte clientOS = 1;
        short clientDeviceYear = 2013;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Android по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //третья
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        //четвёртая
        byte deliveryTime = 0;
        int deliveryDistance = 95;
        //доставка в пределах 1-й зоны всегда будет равна 1-му дню
        if ((deliveryDistance <= 0) || (deliveryDistance >= 100)) {
            System.out.println("Куда доставляем-то?");
        }
        else {
            deliveryTime++;
            if (deliveryDistance > 20) {
                deliveryTime++;
                if (deliveryDistance > 60) {
                    deliveryTime++;
                }
            }
            System.out.println("Потребуется дней: " + deliveryTime);
        }

        //пятая
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("На дворе зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("На дворе весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("На дворе лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("На дворе осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        //шестая
        byte age = 19;
        int salary = 58000;
        int creditCardLimit;
        if (age < 23) {
            creditCardLimit = salary * 2;
        }
        else {
            creditCardLimit = salary * 3;
        }
        if ((salary >= 50000) && (salary < 80000)) {
            creditCardLimit = (int) ((int) creditCardLimit * 1.2);
        }
        else if (salary >= 80000) {
            creditCardLimit = (int) ((int) creditCardLimit * 1.5);
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditCardLimit + " рублей");

        //седьмая
        age = 25;
        salary = 60000;
        int wantedSum = 330000;
        float lendingRate = 10;
        if (age < 23) {
            lendingRate = lendingRate + 1;
        }
        else if (age < 30) {
            lendingRate = (float) ((float) lendingRate + 0.5);
        }
        if (salary > 80000) {
            lendingRate = (float) ((float) lendingRate - 0.7);
        }
        lendingRate = (float) lendingRate / 100;
        float maxPayment = (wantedSum + (wantedSum * lendingRate)) / 12;
        if ((salary / 2) >= maxPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary+ " равен " + maxPayment + " рублей. Платеж по кредиту " + wantedSum + " рублей. Одобрено");
        }
       else {
            System.out.println("Максимальный платеж при ЗП " + salary+ " равен " + maxPayment + " рублей. Платеж по кредиту " + wantedSum + " рублей. Отказано");
        }
    }
}