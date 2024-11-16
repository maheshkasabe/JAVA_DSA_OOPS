package Oops.Classes;

public class Parent {
    static int age;
    static String name;

    public Parent(){

    }

    public Parent(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 100000; i++) {
//            Parent par = new Parent();
//        }

        Parent parent = new Parent(12,"Mahi");

        //        Parent.age = 12;

        System.out.print(parent.name+" "+parent.age);
    }

    // collects the garbage values
//    @Override
//    protected void finalize(){
//        System.out.print("Finalize Called ...");
//    }
}
