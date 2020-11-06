package cd.amateurMobileDev.poo;

public class Open {

    public static void main(String[] args) {

        Rational r1 = new Rational();
        System.out.println(r1);

        r1.setNumerator(1);
        r1.setDenominerator(2);

        System.out.println( r1 );

        Rational r2 = new Rational(5, 5);
        System.out.println( r2 );
    }
}
