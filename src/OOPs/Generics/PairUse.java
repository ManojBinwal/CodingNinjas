package OOPs.Generics;

import java.util.Arrays;

public class PairUse {

    /*
    *by extending print interface T will accept only those classes which implements printInterface.
    *Interface are classes which are meant to be overridden.
    *It is mandatory for any class which implements interface to override the methods declared in interface.
    * In the printArray method by extending the printInterface class. printArray method is bound and it can only accept values which
    * are reference of class which implements printInterface.     */
    public  static<T extends PrintInterface> void printArray(T arr[]){
        for(int i =0 ; i<arr.length; i++){
//            System.out.println(arr[i]);  // prints address
            arr[i].print();
        }
    }
    public static void main(String[] args) {

        Vehicle v[] = new Vehicle[5];
        for(int i=0; i<v.length; i++) {
            v[i] = new Vehicle(10*i,"ab");
        }
        printArray(v);


        /*
        *The method of creating generics inside generic is called chaining generics.
         */
//          Pair<String,Integer> pInner = new Pair<>("ab",100);
//          Pair<String,Integer> pInner2= new Pair<>("cd",200);
//          Pair<Pair<String,Integer>,Pair<String,Integer>> p = new Pair<>();
//          p.setFirst(pInner);
//          p.setSecond(pInner2);
//        System.out.println(p.getFirst());
//        System.out.println(p.getFirst().getFirst());
//        System.out.println(p.getFirst().getSecond());
//        System.out.println(p.getSecond().getFirst());
//        System.out.println(p.getSecond().getSecond());



//        Pair<Integer,String> p  = new Pair<Integer,String>(10,"Raj");
//        System.out.println(p.getFirst() +" "+ p.getSecond());
//
//        Pair<Integer,String> str = new Pair<>(10,"ka");
//        System.out.println(str.getFirst() +" "+ str.getSecond());

//        Pair<Character> ch = new Pair<>('a','b');
//        System.out.println(ch.getFirst()+" "+ch.getSecond());
//
//        Pair<Double> d = new Pair<>(9.5,4.9);
//        System.out.println(d.getFirst()+" "+ d.getSecond());

        /*
        *you can create the object of the pair class without specifying the data type and it will be completely
        * fine, however this is not recommended as the default data is of object type which is the parent class of
        * all the classes in java.
        * you can enter any type of value in this case without restraint as to int or string or double and so on.
        * since you don't know what type of value is stored inside the object you cannot use it freely and has to use
        * type cast to use it. However, type casting is not compatible with all the data types and therefore you may get
        * class cast exception.
         */
//
//        Pair obj = new Pair<>(10,20);
//        obj.setFirst('c');
//        obj.setSecond(4.32);
//        System.out.println(obj.getFirst()+ " "+ obj.getSecond());

    }
}
