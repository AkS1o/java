package OOP;

public class Fraction {
    private int Numerator;
    private int Denominator;

    public Fraction(int Numerator, int Denominator) {
        this.Numerator = Numerator;
        this.Denominator = Denominator;
    }

    public void setNumerator(int numerator) {
        Numerator = numerator;
    }

    public int getNumerator(){
        return Numerator;
    }

    public void setDenominator(int denominator) {
        Denominator = denominator;
    }

    public int getDenominator(){
        return Denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "Numerator='" + Numerator + '\'' +
                ", Denominator='" + Denominator + '\'' +
                '}';
    }
}
