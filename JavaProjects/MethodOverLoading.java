import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodOverLoading {
    MethodOverLoading() { //Default constructor
        System.out.println("I'm anonymous");
    }

    //Parameterized     constructor
    MethodOverLoading(String firstName){
        System.out.println("My first name is " + firstName);
    }
    MethodOverLoading(String firstName, String surname){
        System.out.println("My full name is " + firstName + " " + surname);
    }
    MethodOverLoading(String firstName, String surname, int age){
        System.out.println("My name is " + firstName + " " + surname + " and I'm " + age + " years old");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your first name");
        String name1 = br.readLine();
        System.out.println("Enter your surname");
        String name2 = br.readLine();
        System.out.println("Enter your age");
        int age = Integer.parseInt(br.readLine());
        new MethodOverLoading();
        new MethodOverLoading(name1);
        new MethodOverLoading(name1, name2);
        new MethodOverLoading(name1, name2, age);
    }
}
