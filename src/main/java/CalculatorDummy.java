public class CalculatorDummy implements Calculatable {
    int first, second, third;
    @Override
    public void setOperands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public int sum() {
        return this.third + this.second + this.third;
    }

    @Override
    public int avg() {
        return (this.first + this.second + this.third)/ 3;
    }
}


