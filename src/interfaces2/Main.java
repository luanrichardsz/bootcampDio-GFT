package interfaces2;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String [] args){
        List<User> users = List.of(new User("Maria", 24),
                                   new User("João", 30),
                                   new User("Suzana", 30));

        users.forEach(System.out::println);

        /*
        var consumer = new Consumer<User>(){
            @Override
            public void accept(final User user){
                System.out.println(user);
            }
        };
         */


    }
}
