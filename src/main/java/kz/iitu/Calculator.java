package kz.iitu;

import javax.jws.WebMethod;
import javax.jws.WebService;

import static java.lang.Math.sqrt;

@WebService
public class Calculator {

    @WebMethod
    public double additionOperator(double a, double b) {
        return a + b;
    }

    @WebMethod
    public double subtractionOperator(double a, double b) {
        return a - b;
    }

    @WebMethod
    public double multiplicationOperator(double a, double b) {
        return a * b;
    }

    @WebMethod
    public double divisionOperator(double a, double b) {
        return a / b;
    }

    @WebMethod
    public double squareRoot(double n) {
        return sqrt(n);
    }
}
