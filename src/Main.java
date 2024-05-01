public class Main {
    public static void main(String[] args) {

        System.out.println("\nTack 1");


    int age = 19;
    if (age >= 18) {
        System.out.println("Если возраст человека больше " + age
                + " то он совершеннолетний");
    } else {
        System.out.println(" нужно немного подождать");
    }

        System.out.println("\nTack2");
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature
                    + "градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице тепло, можно идти без шапки");
        }

            System.out.println("\nTack3");
            int speed = 60;
            if (speed > 60) {
                System.out.println("Если скорость " + speed
                        + " придется заплатить штраф");
            } else {
                System.out.println("Можно ездить спокойно");
            }

                System.out.println("\nTack4");

                int years = 5;
                if (years >= 2 && years <= 6) {
                    System.out.println("Если возраст человека равен " + years
                            + " то ему нужно ходить в детский сад");
                }
                if (years >= 7 && years <= 17) {
                    System.out.println("Если возраст человека равен " + years
                            + "то ему нужно ходить в школу");
                }
                if (years >= 18 && years <= 24) {
                    System.out.println("Если возраст человека равен " + years
                            + "то ему нужно ходить в университет");
                }
                if (years > 24) {
                    System.out.println("Если возраст человека равен " + years
                            + "то ему нужно ходить на работу");
                }


                    System.out.println("\nTack5");

                    int child = 14;
                    if (child < 5) {
                        System.out.println("Если возраст ребенка " + child
                                + "он не может кататься на аттракционе");
                    }
                    if (child >= 5 && child <= 14) {
                        System.out.println("Если возраст ребенка " + child
                                + " он может кататься в сопровождении взрослых");
                    }
                    if (child > 14) {
                        System.out.println("Если возраст ребенка равен " + child
                                + " он может кататься без сопровождения взрослого");
                    }


                        System.out.println("\nTack6");

                        int total = 120;
                        int places = 60;
                        int place = 79;
                        if (place > total) {
                            System.out.println("Места нет");
                        } else {
                            if (place > places) {
                                System.out.println("Стоим");
                            } else {
                                System.out.println("Сидим");
                            }
                            {
                                System.out.println("\nTack7");

                                int one = 1;
                                int two = 2;
                                int three = 3;
                                if (one > two && one > three) {
                                    System.out.println(one);
                                } else {
                                    if (two > three) {
                                        System.out.println(two);
                                    } else {
                                        System.out.println(three);

                                    }
                                }
                            }
                        }
                    }
                }












