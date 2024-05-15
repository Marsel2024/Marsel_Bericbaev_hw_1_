public class SecondLevl extends FirstLevel{
    public double value;


    public SecondLevl(String name, ComplexType complexType, Status status, double v) {
        super(name, complexType, status);
        this.value = value;
    }
    public final void overloadedMethod(int number) {
        System.out.println("This is an overloaded method with integer parameter in SecondLevel class: " +
                number);
    }
    public void overloadedMethod(String text) {
        System.out.println("This is an overloaded method with String parameter in SecondLevel class: " +
                text);
    }

    public double getValue() {
        return value;
    }
}
