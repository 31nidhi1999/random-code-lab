import java.util.function.Predicate;

public class PredicateExample{
    public static void main(String args[]){
        Predicate<Integer> result = num -> num%2==0;
        System.out.println(result.test(10));
    }
}
//op
//true