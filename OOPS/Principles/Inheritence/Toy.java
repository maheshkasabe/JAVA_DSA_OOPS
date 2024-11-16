package Oops.Principles.Inheritence;

public class Toy extends Gift{
    String name;

    public Toy(String name){
        this.name = name;
    }

    public Toy(String name, int l, int h,int w , int weight){
        this.name = name;
        this.h = h;
        this.l = l;
        this.w = w;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Toy toy = new Toy("Mahesh",12,12,21,2);

        System.out.println(toy.h+" "+ toy.weight+" "+toy.w+" "+toy.l+" "+toy.name);
    }
}
