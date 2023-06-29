package array.object.employees;


import java.util.Scanner;

public class Employee {
    public final int bonus = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("****************************************************************************************");
        Emplyees[] arr = new Emplyees[16]; //Declare arr ay object
        /*arr[0] = new Emplyees("Wisdom Anyizah", 24, 563_900.00f);
        arr[1] = new Emplyees("John Amatey", 35, 83_980.00f);
        arr[2] = new Emplyees("James Ayamba", 27, 254_940.00f);
        arr[3] = new Emplyees("Mary Do", 30, 163_950.00f);
        arr[4] = new Emplyees("Sumaila Imoro", 21, 233_370.00f);
        arr[5] = new Emplyees("Benedicta Avorga", 19, 33_600.00f);
        arr[6] = new Emplyees("Benedicta Fiagbedor", 29, 99_700.00f);
        arr[7] = new Emplyees("Enyo Avaki", 20, 23_300.00f);
        arr[8] = new Emplyees("Mawukoenya Nenyo", 32, 203_850.00f);
        arr[9] = new Emplyees("Peace Kpordzakor", 56, 73_390.00f);*/
        for(int a = 0; a < arr.length; a++) {
            System.out.println("Enter your full name, age and salary respectively");
            System.out.print("Full Name -> ");
            String name = input.nextLine();
            name = input.nextLine();
            System.out.print("Age -> ");
            int age = input.nextInt();
            System.out.print("Salary -> ");
            float salary = input.nextFloat();
            arr[a] = new Emplyees(name, age, salary);
        }

        System.out.println("****************************************************************************************");

        for (int i = 1; i < arr.length; i++) {

            System.out.println("Employee " + i + " -> " + arr[i].name + ": " + arr[i].age +
                    " " + "years old: $" + arr[i].salary + ": bonus of $" + arr[i].salary* new Employee().bonus/100 +
                    " (" + new Employee().bonus + "% of salary)");
        }
        System.out.println("******************************************************************************************");
    }
}
