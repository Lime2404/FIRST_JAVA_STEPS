import jdk.nashorn.internal.ir.WhileNode;

import	java.util.Scanner;
public	class Schedule {
    public static void main(String[] args) {

        Scanner yourtime = new Scanner(System.in);

        do {
            System.out.println("\n	Please set the time: ");
            int time = yourtime.nextInt();
            if (time < 7 ) {
                System.out.println("Спи");
            } else if (time >= 7 && time <= 9) {
                System.out.println("Вставай");
            } else if (time > 9 && time <= 18) {
                System.out.println("Работай");
            } else if (time > 18 && time <= 24) {
                System.out.println("отдыхай");
            }
            else
                System.out.println("Чё за число вводишь...");

        }
        while (true);
    }
}