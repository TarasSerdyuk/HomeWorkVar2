public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
        public static void task1() {
        System.out.println("Задача 1");
        byte a = 1;
        System.out.println("Значение переменной а с типом byte равно " + a);
        short b = 30000;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 2000000000;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 3L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.2f;
        System.out.println("Значение переменной e с типом byte равно " + e);
        double g = 3.123;
        System.out.println("Значение переменной g с типом double равно " + g);
    }
        public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
            System.out.println(a);
        long b = 987678965549L;
            System.out.println(b);
        double c = 2.786;
            System.out.println(c);
        short d = 569;
            System.out.println(d);
        short e = -159;
            System.out.println(e);
        int f = 27897;
            System.out.println(f);
        byte g = 67;
            System.out.println(g);
    }
        public static void task3() {
        System.out.println("Задача 3");
        byte ludPav = 23;
        byte annSer = 27;
        byte ekAnd = 30;
        short allPaper = 480;
        int paperOne = allPaper/(ludPav+annSer+ekAnd);
            System.out.println("На каждого ученика рассчитано " + paperOne + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
    byte performance = 16/2;
    int perf20min = performance*20;
        System.out.println("За 20 минут машина произвела " + perf20min + " штук бутылок");

    }
}