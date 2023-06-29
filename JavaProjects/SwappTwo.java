public class SwappTwo {
    
        public static void swap_without_temp(String[] args) {
            int x = 5;
            int y = 7;
            System.out.println("Before:\nx: " + x + "\ny: " + y + "\nDifference: " + Math.abs( x - y));
            x += y; // 5 + 7 = 12
            y = x - y; //12 - 7 = 5
            x -= y; // 12 - 5 = 7
            System.out.println("Before:\nx: " + (float) ++x + "\ny: " + (float) ++y + "\nDifference: " + Math.abs( x - y));
        }
        public static void swap_with_temp() {
            String firstname = "Mawukoenya";
            String lastname = "Anyizah";
            System.out.println("Before\n First name: " + firstname + "\n Last name: " + lastname);
            String temp = firstname;
            firstname = lastname;
            lastname = temp;
            System.out.println("After\n First name: " + firstname + "\n Last name: " + lastname);
            int[] arr = new int[4];
            arr[0] = 34;
            arr[2] = 45;
           for(int i : arr) {
            System.out.print(i);
            System.out.print(" ");
            }
        }
        public static void check(){
            int x = 45;
            int y = 4; 
            int z = 45;
            if(x == y || x == z || y == z ) {
                if (x == y && x != z) {
                    System.out.println("x and y are equal  -> " + x +" " + y);
                } else if( x == z && x != y ) {
                    System.out.println("x and z are equal  -> " + x +" " + z);
                } else if(y == z && y != x){
                    System.out.println("y and z are equal  -> " + y +" " + z);

                } else
                System.out.println("All are equal");

            } 
            if (x > y && x > z){
                System.out.println("x is greatest -> " + x);
            } else if (y > z){
                System.out.println("y is greatest -> " + y);

            } else {
                System.out.println("z is greatest -> " + z);

            }
        }
        public static void main(String[] args) {
            check();
        }
    
}
