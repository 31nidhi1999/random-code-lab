import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Double temp = 28.0;
        Function<Double, Double> convertCelsiusToFahrenheit = celsius -> (celsius * 9.0 / 5.0) + 32;
        System.out.println(convertCelsiusToFahrenheit.apply(temp));
    }
}

// op
// 82.4
