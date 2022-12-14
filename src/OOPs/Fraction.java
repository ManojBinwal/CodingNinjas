package OOPs;
/*
*This class contains two properties numerator and denominator.
*
* These properties along with methods are the blueprints
*
* using these blueprints objects are created. When new object of class is created what we are provided is the reference to
* object and not the actual object. The actual object is created in the heap memory.
*
* Reference is created for objects which are beyond the scope of program in this case object is created in heap memory
* and heap memory is not the part of the program. A program only contains stack memory and the method area.
*
* Fraction frac = new Fraction(); "frac" here is the new object created in heap. Every object has separate set of properties
* which only belongs to them.
*
* for example, you have a blueprint of a house (class) and using the blueprint you create house (object in heap) but you can
* only access the house using keys which are unique for every house (frac / reference ).
*
* java is pass by value, and you will always have reference only. Also, when you copy this object into another lets say
*   frac1 = frac;    // here only the reference of frac will be copied into frac1 and there will not be two separate copies of object.
*
* and when you make change to oject using either of the references the change will be reflected through both references as there is only one
* object.
*
 */
public class Fraction {

    /*
    *                                                   PROPERTIES
    * below two are properties of class fraction.
    * These properties generally should not be left on default modifier but kept on private.
    * getters and setter methods are created to make them accessible outside the class.
    * the benefit of using getter and setter methods is that you have the freedom to choose what you want to make accessible and what not.
    * These variables must not be made static otherwise even if new reference is created it will point to these properties only and will not create
    * a separate copies of them.
    *           Fraction frac = new Fraction(12,20);
    *           fraction frac1 = mew Fraction(16,19);
    * if properties are static then new reference frac1 will modify the object. But since static entities are shared by whole class the change will be
    * reflected in frac also. And while printing both will print (16/19).
    *
     */
   int numerator;
   int denominator;

   /*
   * ----------------------------------------MAIN METHOD----------------------------------------------------------------/
   *
    */
    public static void main(String[] args) {
        Fraction frac = new Fraction(12, 16);
        Fraction frac1 = new Fraction(20, 40);
//        System.out.println(frac.numerator);
//        System.out.println(frac1.numerator);
        simplify(frac);
        simplify(frac1);
//        System.out.println(getNumerator(frac)+"/"+getDenominator(frac));
//        System.out.println(getNumerator(frac1)+"/"+getDenominator(frac1));
//        frac.add(frac1);
//        System.out.println(getNumerator(frac)+"/"+getDenominator(frac));
        Fraction sum = add(frac, frac1);
        System.out.println(getNumerator(sum) + "/" + getDenominator(sum));





/*
 * ----------------------------------------MAIN METHOD----------------------------------------------------------------/
 *
 */

    }
    /*
     *if the methods are created static they will also be shared by the whole class, and you cannot use the frac.add(frac1);
     * to pass both the objects as argument you can either pass both objects as parameter or do not make the add method static.
     * This keyword does not work in a static function. since it does not belong to any single object.
     */
    private void add(Fraction frac1) {
        this.numerator = this.numerator*frac1.denominator + frac1.numerator*this.denominator;
        this.denominator=this.denominator*frac1.denominator;
        simplify(this);

    }
    private static Fraction add(Fraction frac, Fraction frac1) {
        Fraction sum = new Fraction(1,1);
        sum.numerator = frac.numerator*frac1.denominator + frac1.numerator*frac.denominator;
        sum.denominator=frac.denominator*frac1.denominator;
        simplify(sum);
        return sum;
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator =  denominator;
    }

    public static int getNumerator(Fraction n){   //get numerator
        return n.numerator;
    }
    public static int getDenominator(Fraction d){   //get denominator
        return d.denominator;
    }

    public static void setNumerator(Fraction n,int numerator){  // set new numerator
        n.numerator=numerator;
    }
    public static void setDenominator(Fraction n, int denominator){  //set new denominator
        n.denominator = denominator;
    }

    public static Fraction simplify(Fraction frac){ //function to simplify fractions
        int n = frac.numerator;
        int d = frac.denominator;
        int min = Math.min(n,d);
        int max = Math.max(n,d);
        int gcd = 1;
        for(int i=2; i<=min;i++){
            if(max%i==0 && min%i==0){
                gcd=i;
            }
        }
        frac.numerator=n/gcd;
        frac.denominator=d/gcd;

        return frac;
    }


}
