public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        {
            int[] pays = {1000, 1500, 2000, 2500, 1500};
            int sum = 0;
            for (int pay : pays) {
                sum += pay;
            }

            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            System.out.println();
        }
        {
            System.out.println("Задача 2");
        }
        int[] arr = {500, 1500, 2000, 2500, 1500, 1700, 1600};
        int min = 10000;
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей " + "Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();
        System.out.println("Задача 3");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");
        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}