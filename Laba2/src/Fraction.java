public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Ошибка, знаменатель 0");
            System.exit(0);
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int number) {
     this.numerator = number;
     this.denominator = 1;
    }

    //Геттеры
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sum(Fraction x) {
        int newNum = this.numerator * x.denominator + x.numerator * this.denominator;
        int newDen = this.denominator * x.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction sum(int num) {
        return sum(new Fraction(num));
    }

    public Fraction minus(Fraction x) {
        int newNum = this.numerator * x.denominator - x.numerator * this.denominator;
        int newDen = this.denominator * x.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction minus(int num) {
        return minus(new Fraction(num));
    }

    public Fraction multiply(Fraction x) {
        int newNum = this.numerator * x.numerator;
        int newDen = this.denominator * x.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction multiply(int num) {
        return multiply(new Fraction(num));
    }

    public Fraction divide(Fraction x) {
        if (x.denominator == 0) {
            System.out.println("Деление на 0");
            System.exit(0);
        }
        int newNum = this.numerator * x.denominator;
        int newDen = this.denominator * x.numerator;
        return new Fraction(newNum, newDen);
    }

    public Fraction divide(int num) {
        return divide(new Fraction(num));
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return String.valueOf(numerator);

        return numerator + "/" + denominator;
    }
}
