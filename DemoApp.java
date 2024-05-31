//import java.util.Scanner;
//
//class DemoApp{
//    public static void main(String[] args){
//    Scanner myObj = new Scanner(System.in);
//    String username;
//    int age;
//    String Gender;
//
//
//    System.out.println("Enter name");
//    username = myObj.nextLine();
//    System.out.println("Age");
//    age = myObj.nextInt();
//    myObj.nextLine();
//    System.out.println("Gender");
//    Gender = myObj.nextLine();
//    System.out.println("username is " + username);
//    System.out.println("Age is " + age);
//    System.out.println("Gender "+Gender);
//    }
//}
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//class DemoApp{
//    public void company(String x){
////        Scanner myObj1 = new Scanner(System.in);
////        String comp = myObj1.nextLine();
//        System.out.println(x);
//    }
//    public static String[] details(){
//        Scanner myObj = new Scanner(System.in);
//        String name = myObj.nextLine();
//        String age  = myObj.nextLine();
//        String gender = myObj.nextLine();
//        String[] A= {name,age,gender};
//        return A;
//
//    }
//    public static void main(String[] args){
//        System.out.println();
//        System.out.println();
//
//        String[] x=details();
//        DemoApp dem = new DemoApp();
//        Scanner myObj1 = new Scanner(System.in);
//        System.out.println("Enter Comp");
//        String z = myObj1.nextLine();
//        dem.company(z);
//
//        String[] A = Arrays.copyOf(x, x.length+1);
//        A[x.length] = z;
//        System.out.println(Arrays.toString(A));
//    }
//}

import java.util.Scanner;

class DemoApp{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Start");
        int z = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Enter End");
        int x = myObj.nextInt();
        int result = sum(z, x);
        System.out.println(result);
    }
    public static int sum(int k, int i) {
        if (i>k) {
            return i + sum(k,i - 1);
        } else {
            return i;
        }
    }
}
