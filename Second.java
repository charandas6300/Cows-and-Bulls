//import java.util.Scanner;
//
//class Human{
//    private int age;
//    private String name;
//
//    public Human(){ //Default constructor
//        age = 21;
//        name = "charandas";
//    }
//
//    public Human(int a, String name){  //parametirized constructor
//
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//}
//
//
//
//public class Second{
//
//    public static void main(String[] args) {
//        Human h1 = new Human();
////        Scanner sn = new Scanner(System.in);
////        System.out.println("namee");
////        String nm = sn.nextLine();
////        System.out.println("agee");
////        int ag = sn.nextInt();
////        h1.setAge(45);
////        h1.setName("nm");
//        System.out.println(h1.getName()+":"+h1.getAge());
//    }
//}
//import java.util.ArrayList;
//
//public class Second {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        String l = cars.get(3);
//        System.out.println(l);
//        //for (int i = 0; i < cars.size(); i++) {
//        //System.out.println(cars.get(i));
//        //}
//    }
//}
//

import java.util.Scanner;

class Second{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter");
        int z = myObj.nextInt();
//        int result = 0;
//
////        if (z%2 == 0)
////            result = 10;
////        else
////            result = 20;
//        int x = 0;
//        result = z%2==0 ? z==10?1:x:20;
//
//        System.out.println(result);

        Switch (z){
            case 1:
                System.out.println(1);


        }



    }
}