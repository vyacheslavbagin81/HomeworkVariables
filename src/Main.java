import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
    }public static void task1(){
        System.out.println("задача 1");
        Scanner scn = new Scanner(System.in);
        System.out.println("Укажите возраст человека, что бы узнать совершенолетний он или нет");
        int age = scn.nextInt();
        if (age>=18){
            System.out.println("Если возраст человека равен " +age+", то он совершеннолетний");
        }else System.out.println("Если возраст человека равен " +age+", то он не достиг совершеннолетия, нужно немного подождать");
    }public static void task2(){
        System.out.println("задача 2");
        Scanner scn = new Scanner(System.in);
        System.out.println("Укажите температуру воздуха, что бы получить совет, одевать шапку или нет");
        int airTemperature = scn.nextInt();
        if (airTemperature>5){
            System.out.println("На улице " +airTemperature+", градусов, можно идти без шапки");
        }else System.out.println("На улице " +airTemperature+", градусов, нужно надеть шапку");
    }public static void task3() {
        System.out.println("задача 3");
        System.out.println("Укажите скорость автомобиля");
        Scanner scn1 = new Scanner(System.in);
        int speed = scn1.nextInt();
        System.out.println("Укажите максимально разрешенную скорость");
        Scanner scn2 = new Scanner(System.in);
        int allowedSpeed = scn2.nextInt();
        boolean speeding = speed > allowedSpeed;
        if (speeding){
            System.out.println("Если скорость " +speed+"км/ч, то придется заплатить штраф");
        }else System.out.println("Если скорость " +speed+"км/ч, то можно ездить спокойно");
    }public static void task4() {
        System.out.println("задача 4");
        Scanner scn = new Scanner(System.in);
        System.out.println("Укажите возраст человека старше одного года, что бы определить социальный статус");
        int age = scn.nextInt();
        boolean kid = age >= 2 && age <= 6;
        boolean schoolboy = age >= 7 && age <= 18;
        boolean student = age > 18 && age < 24;
        boolean worker = age >= 24;
        if (kid) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (schoolboy) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (student) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }else if (worker) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }public static void task5() {
        System.out.println("задача 5");
        Scanner scn = new Scanner(System.in);
        System.out.println("Укажите возраст ребенка который хочет попасть на атракционы");
        int age = scn.nextInt();
        if (age<5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age>=5 && age<14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
    }public static void task6(){
        System.out.println("задача 6");
        System.out.println("Хотите узнать есть ли места в вагоне?");
        System.out.println("Укажите количество пасажиров вошедших в вагон");
        Scanner scn1 = new Scanner(System.in);
        int numberOfPassengers = scn1.nextInt();
        System.out.println("Укажите вместимость вагона");
        Scanner scn2 = new Scanner(System.in);
        int capacityPassengers = scn2.nextInt();
        System.out.println("Укажите количество сидячих мест");
        Scanner scn3 = new Scanner(System.in);
        int seats = scn3.nextInt();
        if (numberOfPassengers > capacityPassengers){
            System.out.println("Вагон уже полностью забит");
        }else if (numberOfPassengers > seats){
            System.out.println("Остались только стоячие места в колличестве "+(int)((capacityPassengers-seats)-(numberOfPassengers-seats))+ " штук");
        }else System.out.println("В вагоне есть стоячие места в колличестве "+(int)(capacityPassengers-seats)+" штук, и сидячие места в колличестве "+(int)(seats-numberOfPassengers)+ " штук");
    }public static void task7(){
        System.out.println("задача 7");
        System.out.println("Хотите отсортировать чила?");
        System.out.println("Напишите первое число");
        Scanner scn1 = new Scanner(System.in);
        int one = scn1.nextInt();
        System.out.println("Напишите второе число");
        Scanner scn2 = new Scanner(System.in);
        int two = scn2.nextInt();
        System.out.println("Напишите третье число");
        Scanner scn3 = new Scanner(System.in);
        int three = scn3.nextInt();
        if (one > two && one > three){
            if (two > three){
                System.out.println(one+">"+two+">"+three);
            }else System.out.println(one+">"+three+">"+two);
        } else if (two > one && two > three) {
            if (one > three){
                System.out.println(two+">"+one+">"+three);
            }else System.out.println(two+">"+three+">"+one);
        }else if (three > one && three > two) {
            if (one > two) {
                System.out.println(three + ">" + one + ">" + two);
            } else System.out.println(three + ">" + two + ">" + one);
        }
    }
}