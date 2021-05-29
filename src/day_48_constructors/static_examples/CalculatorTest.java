package day_48_constructors.static_examples;

public class CalculatorTest {
    //static method
    public static void main(String[] args) {
        Calculator.add(5,3);  //add is static method, can be called using clasname.staticMethodName
//1

        //calculator.multiply (2,4) error multiply is not a static, need object to call it

        //multiply is instance method, and we are creating object then calling it
        Calculator calculator=new Calculator();
        calculator.multiply(5,5);
        //static method can also be called using an object
       // calculator.add(5,2);

    }


}
