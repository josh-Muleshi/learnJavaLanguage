package cd.amateurMobileDev.poo;

public class Rational {
    private int numerator;
    private int denominerator;

    public Rational() {
        this(0, 1);
    }

    public Rational(int numerator, int denominerator) {
        this.setNumerator(numerator);
        this.setDenominerator(denominerator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominerator() {
        return denominerator;
    }

    public void setDenominerator(int denominerator) {
        if (denominerator == 0 ){
            throw new RuntimeException("le deno ne peut pas etre null ");
        }
        this.denominerator = denominerator;
    }

    @Override
    public String toString() {
        return String.format("[%d/%d]", this.numerator, this.denominerator);
    }
}
