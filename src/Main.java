public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    private static void task4() {
        System.out.println();
        System.out.println("Задание 4");
        int [] apples = new int [] {1, 2, 3};
        for (int i = 0; i <= 2; i++) {
            if (apples [i] %2 == 0) {
                System.out.print(apples[i] + " ");
            }else {
                    System.out.print(apples[i] + 1 + " ");
                }
            }
        }
    private static void task3() {
        System.out.println();
        System.out.println("Задание 3");
        int [] apples = new int [] {1, 2, 3};
        for (int i = 2; i >= 0; i --) {
            if (i == 0) {
                System.out.print(apples[i]);
            } else {
                System.out.print(apples[i] + ", ");
            }
        }
        System.out.println();
        double [] money = new double [] {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i --) {
            if (i == 0) {
                System.out.print(money[i]);
            } else {
                System.out.print(money[i] + ", ");
            }
        }
        System.out.println();
        short [] tomatoes = new short [] {2, 4, 8, 16, 32, 64, 128};
        for (int i = 6; i >= 0; i --) {
            if (i == 0) {
                System.out.print(tomatoes[i]);
            } else {
                System.out.print(tomatoes[i] + ", ");
            }
        }
        System.out.println();
    }
    private static void task2() {
        System.out.println("Задание 2");
        int [] apples = new int [] {1, 2, 3};
        for (int i = 0; i <= 2; i ++) {
            if (i == 2) {
                System.out.print(apples[i]);
            } else {
                System.out.print(apples[i] + ", ");
            }
        }
        System.out.println();
        double [] money = new double [] {1.57, 7.654, 9.986};
        for (int i = 0; i <= 2; i ++) {
            if (i == 2) {
                System.out.print(money[i]);
            } else {
                System.out.print(money[i] + ", ");
            }
        }
        System.out.println();
        short [] tomatoes = new short [] {2, 4, 8, 16, 32, 64, 128};
        for (int i = 0; i <= 6; i ++) {
            if (i == 6) {
                System.out.print(tomatoes[i]);
            } else {
                System.out.print(tomatoes[i] + ", ");
            }
        }
        System.out.println();
    }
    private static void task1() {
        System.out.println("Задание 1");
        int [] apples = new int [3];
        apples[0] = 1;
        apples[1] = 2;
        apples[2] = 3;
        double[] money = {1.57, 7.654, 9.986};
        short [] tomatoes = {2, 4, 8, 16, 32, 64, 128};
        System.out.println();
    }
}
