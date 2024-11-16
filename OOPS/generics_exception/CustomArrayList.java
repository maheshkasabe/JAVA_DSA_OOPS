package Oops.generics_exception;

public class CustomArrayList {
    int d_size = 10;
    int[] data;
    int size = 0;

    public CustomArrayList(){
        data = new int[d_size];
    }

    void add(int val){
        if(isfull()){
            resize();
            data[size++] = val;
        }else{
            data[size++] = val;
        }
    }

    int get(int val){
        for (int i = 0; i < data.length; i++) {
            if(data[i] == val){
                return i;
            }
        }
        return -1;
    }

    void remove(int key){
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                key = data[size--];
            }
        }
        System.out.println("No Key found");
    }

    boolean isfull(){
        return false;
    }

    void resize(){

    }


    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add(5);
        list.add(4);
        list.add(1);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list.get(9));

        list.remove(5);


        // System.out.println(list.get(9));

    }

}
