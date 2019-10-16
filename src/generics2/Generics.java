package generics2;

import java.util.*;

public class Generics {
        void func(){
            List<Integer> ls =new ArrayList<Integer>();                   //generics
            ls.add(12);
            ls.add(15);
            ls.add(18);
            ls.add(8);

            System.out.println(ls);
            Collections.sort(ls);
            System.out.println(ls);
        }

        public static void main(String[] args) {
            Generics obj=new Generics();
            obj.func();
        }
    }

