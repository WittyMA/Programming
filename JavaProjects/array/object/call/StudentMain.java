package array.object.call;


import java.util.*;



public class StudentMain {
                    public String[] printStudent(String[] arr){
                        return arr;
                    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Students[] arr = new Students[5];
        arr[0] = new Students("Wisdom", "Anyizah", 29, "PS/ITC/20/0057");
        arr[1] = new Students("Delight", "Mensah", 24, "PS/ITC/20/0002");
        arr[2] = new Students("Sumaila", "Ayamba", 34, "PS/ITC/20/0140");
        arr[3] = new Students("Mawukoenya", "Nenyo", 21, "PS/ITC/20/0095");
        arr[4] = new Students("John", "Okoro", 39, "PS/ITC/20/0107");

        String[] arr1 = new String[5];

        System.out.println("Enter your Program");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i].id + " -> ");
            arr1[i] = input.nextLine();
        }
        System.out.println("****************************************************************************************************");
        System.out.println("\t\t" + Arrays.toString(new StudentMain().printStudent(arr1)));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("FULL_NAME         AGE               ID                 PROGRAMME");
        System.out.println(".....................................................................................................");
        for(int i = 0; i < arr.length; i++){
            System.out.println("\t\t" + arr[i].firstName + " " + arr[i].secondName + " : " + arr[i].age + " years old : "
                    + arr[i].id + " : " + arr1[i]);
        }
        System.out.println("*******************************************************************************************************");
    }

}
