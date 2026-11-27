import java.util.ArrayList;
import java.util.List;

class Breaker {

    /*static void callMySelf() {
        callMySelf();
    }*/

    public static void main(String[] args) {
        //callMySelf();
        // Experiment 2: heap (first comment out the line above)
        List<Person> people = new ArrayList<>();
        while (true) {
            people.add(new Person("Ana")); // ← a new object on the heap every time
         }
    }

}