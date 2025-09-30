import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;
public class ConsumerExample{
    public static void main(String args[]){
        List<String> emails = new ArrayList<>();
        emails.add("nidhinayak31@gmail.com");
        emails.add("sunita@gmail.com");
        Consumer<List<String>> action = lists ->{
            for(String email : lists){
                System.out.println("Sended a welcome email to " + email);
            }
        };

        action.accept(emails);
    }
}

//op
// Sended a welcome email to nidhinayak31@gmail.com
// Sended a welcome email to sunita@gmail.com