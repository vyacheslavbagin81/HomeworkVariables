public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }public static void task1(){
        System.out.println("задача 1");
        int age = 13;
        if (age>=18){
            System.out.println("Если возраст человека равен " +age+", то он совершеннолетний");
        }else System.out.println("Если возраст человека равен " +age+", то он не достиг совершеннолетия, нужно немного подождать");
    }public static void task2(){
        System.out.println("задача 2");
        int airTemperature = 6;
        if (airTemperature<5){
            System.out.println("На улице " +airTemperature+", градусов, можно идти без шапки");
        }else System.out.println("На улице " +airTemperature+", градусов, нужно надеть шапку");
    }public static void task3() {
        System.out.println("задача 3");
        int speed = 67;
        int allowedSpeed = 60;
        boolean speeding = speed > allowedSpeed;
        if (speeding){
            System.out.println("Если скорость " +speed+"км/ч, то придется заплатить штраф");
        }else System.out.println("Если скорость " +speed+"км/ч, то можно ездить спокойно");
    }public static void task4() {
        System.out.println("задача 4");
        int age = 37;
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
        int age = 7;
        if (age<5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age>=5 && age<14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
    }public static void task6(){
        System.out.println("задача 6");
        int numberOfPassengers = 80;
        int capacityPassengers = 102;
        int seats = 60;
        if (numberOfPassengers > capacityPassengers){
            System.out.println("Вагон уже полностью забит");
        }else if (numberOfPassengers > seats){
            System.out.println("Остались только стоячие места в колличестве "+(int)((capacityPassengers-seats)-(numberOfPassengers-seats))+ " штук");
        }else System.out.println("В вагоне есть сидячие места в колличестве "+(int)(seats-numberOfPassengers)+ " штук");
    }public static void task7(){
        System.out.println("задача 7");
        int one = 2;
        int two = 3;
        int three = 1;
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