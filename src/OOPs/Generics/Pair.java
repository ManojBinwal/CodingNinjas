package OOPs.Generics;
/*
*multiple generic can used by declaring the generic variable while creating class.
* The two generic can take separate data types
* Data types such as linkedList, tree etc. use this concept.
 */
public class Pair<T,S> {

    //first and second are reference and not the objects themselves and need to be initialized.
    //variables of non primitive data types are reference and not objects and their default value is null.
    private T first;
    private S second;

    public Pair(){}

    public Pair(T first, S second){
        this.first = first;
        this.second= second;
    }

    public T getFirst(){
        return this.first;
    }

    public void setFirst (T first){
        this.first = first;
    }
    public S getSecond(){
        return this.second;
    }
    public void setSecond(S second){
        this.second=second;
    }
    
}
