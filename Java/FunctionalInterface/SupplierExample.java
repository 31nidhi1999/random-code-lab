import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;

public class SupplierExample{
    public static void main(String args[]){
        Supplier<List<Integer>> result = () -> {
            List<Integer> table = new ArrayList<>();
            for(int i = 1; i<=10; i++){
                table.add(i*10);
            }

            return table;
        };
        System.out.println(result.get());
    }
}

//op
//[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]