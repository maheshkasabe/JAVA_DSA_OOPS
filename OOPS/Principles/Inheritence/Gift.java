package Oops.Principles.Inheritence;

public class Gift extends Box{
    int weight;

    public Gift(){
    }

    public Gift(int weight){
        this.weight = weight;
    }
//    public Gift(int l,int w, int h,int weight){
//        this.weight = weight;
//        this.h = h;
//        this.l = l;
//        this.w = w;
//    }

    public static void main(String[] args) {
        // Gift g = new Gift(4,12,21,2);

       // System.out.print(g.weight+" "+g.w+" "+g.l+" "+g.h);
    }
}
