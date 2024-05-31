//import java.util.Scanner;
//
//class First{
//    int year;
//    String carName;
//
//    public First(int yr,String cName){
//        year = yr;
//        carName = cName;
//    }
//
//    public static void main(String[] args){
//        Scanner myObj1 = new Scanner(System.in);
//        System.out.println("enter Year");
//        int x = myObj1.nextInt();
//        myObj1.nextLine();
//        System.out.println("Enter Name");
//        String y = myObj1.nextLine();
//
//        First myObj = new First(x,y);
//        System.out.println(myObj.carName+","+myObj.year);
//
//    }
//}

//public class First{
//    static void Check(){
//    System.out.println("Static");
//
//    }
//
//    public void Check1(){
//        System.out.println("Public");
//    }
//
//    public static void main(String[] args){
//        Check();
//
//        First myObj = new First();
//        myObj.Check1();
//    }
//}

//class First{
//    protected String cName = "FORD";
//    public void honk(){
//        System.out.println("horn");
//    }
//}
//
//class Secon extends First{
//    private String carName = "mustang";
//
//    public static void main(String[] args){
//        Secon myObj = new Secon();
//
//        myObj.honk();
//        System.out.println(myObj.cName+" "+myObj.carName);
//    }
//}

//class Car {
//    public void Csound() {
//        System.out.println("Animal");
//    }
//}
//
//    class Ford extends Car {
//        public void sound() {
//            System.out.println("zuiii");
//        }
//    }
//
//    class Bmw extends Car {
//        public void sound() {
//            System.out.println("zurrr");
//        }
//    }
//
//
//class First {
//    public static void main(String[] args) {
//        Car newCar = new Car();
//        Ford Fordd = new Ford();
//        Bmw Bmww = new Bmw();
//
//        newCar.Csound();
//        Fordd.sound();
//        Bmww.sound();
//    }
//
//
//}

import java.util.Scanner;

class Company{
    String lap;
    String bag;

    public Company(){
        lap = "Lenovo";
        bag = "Ame Tou";
    }

    public String goods(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter lap");
        String l = myObj.nextLine();
        System.out.println("enter bag");
        String b = myObj.nextLine();
        //System.out.println("You have given "+l+" lap and "+b+" bag");
        String ans = "You have given "+l+" lap and "+b+" bag";
        return ans;
    }
}

//class Rand {
//    Company C2 = new Company();
//
//    public void Randret() {
//        System.out.println(C2.goods());
//    }
//}
class First{
    public static void main(String[] args){
//        Rand r1 = new Rand();
//        r1.Randret();
        Company C1 = new Company();
//        C1.lap = "Dell";
//        C1.bag = "Wildcraft";

        System.out.println(C1.goods());

        //System.out.println(Company.goods());
    }
}
