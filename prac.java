import java.util.*;
class prac{
    public static void main(String args[]){
        List<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.print(list+"\n");
        list.forEach(lis->System.out.print(lis));
    }
}