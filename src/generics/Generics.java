package generics;
import java.util.*;
public class Generics {
    void func(){
        List<String> ls =new ArrayList<String>();                   //generics
        ls.add("abhishek");
        ls.add("abhinav");
        ls.add("anvit");
        ls.add("vivek");

        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);
    }

    public static void main(String[] args) {
        Generics obj=new Generics();
        obj.func();
    }
}
