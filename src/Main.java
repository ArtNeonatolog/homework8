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
            if (i == 1) {
                System.out.print(", " + apples[i] + ", ");
            }else {
                System.out.print(apples[i] + 1);
            }
        }


    }
    private static void task3() {
        System.out.println();
        System.out.println("Задание 3");
        int [] apples = new int [] {1, 2, 3};
        double [] money = new double [] {1.57, 7.654, 9.986};
        short [] tomatoes = new short [] {2, 4, 8, 16, 32, 64, 128};
        System.out.print(apples[2] + ", ");
        System.out.print(apples[1] + ", ");
        System.out.print(apples[0]);
        System.out.println();
        System.out.print(money[2] + ", ");
        System.out.print(money[1] + ", ");
        System.out.print(money[0]);
        System.out.println();
        System.out.print(tomatoes[6] + ", ");
        System.out.print(tomatoes[5] + ", ");
        System.out.print(tomatoes[4] + ", ");
        System.out.print(tomatoes[3] + ", ");
        System.out.print(tomatoes[2] + ", ");
        System.out.print(tomatoes[1] + ", ");
        System.out.print(tomatoes[0]);
    }
    private static void task2() {
        System.out.println("Задание 2");
        int [] apples = new int [] {1, 2, 3};
        double [] money = new double [] {1.57, 7.654, 9.986};
        short [] tomatoes = new short [] {2, 4, 8, 16, 32, 64, 128};
        System.out.print(apples[0] + ", ");
        System.out.print(apples[1] + ", ");
        System.out.print(apples[2]);
        System.out.println();
        System.out.print(money[0] + ", ");
        System.out.print(money[1] + ", ");
        System.out.print(money[2]);
        System.out.println();
        System.out.print(tomatoes[0] + ", ");
        System.out.print(tomatoes[1] + ", ");
        System.out.print(tomatoes[2] + ", ");
        System.out.print(tomatoes[3] + ", ");
        System.out.print(tomatoes[4] + ", ");
        System.out.print(tomatoes[5] + ", ");
        System.out.print(tomatoes[6]);
    }
    private static void task1() {
        System.out.println("Задание 1");
        int [] apples = new int [] {1, 2, 3};
        double [] money = new double [] {1.57, 7.654, 9.986};
        short [] tomatoes = new short [] {2, 4, 8, 16, 32, 64, 128};
        System.out.println();
    }
}
