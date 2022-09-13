
import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

    // ARRAYS (50 points)

     // 1. Create an array of characters of your SURNAME.
        char[] pineda = { 'P', 'I', 'N', 'E', 'D', 'A'};

    // 2. Display each character of your SURNAME on each line.
        for (int i = 0; i < pineda.length; i++) {
            System.out.println(pineda[i]);
        }
        System.out.println("======================================================");
    
        // 3. Display the first character of your SURNAME.
        System.out.println(pineda[0]);

        // 4. Display the last character of your SURNAME.
        System.out.println(pineda[5]);
    
        System.out.println("======================================================");
      // 5. Display the character of your SURNAME in reverse order.
        for (int i = pineda.length - 1; i >= 0; i--) {
            System.out.println(pineda[i]);
        }


    // LINKED LIST (25 points)
    System.out.println("======================================================");
    
    LinkedList<String> IDnumber = new LinkedList<>();

 // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
    IDnumber.add("1");
    IDnumber.add("0");
    IDnumber.add("5");
    IDnumber.add("0");
    IDnumber.add("3");
    IDnumber.add("2");

// 2. Add an asterisk (*) to the head/front of the Linked list.
    IDnumber.addFirst("*");

// 3. Add an asterisk (*) to the tail/end of the Linked list.
    IDnumber.addLast("*");

 // 4. Display the Linked list.
    System.out.println(IDnumber);

    

// 5. Display the last character of the Linked list.
    System.out.println(IDnumber.get(7));

 // 6. Replace the last character of the Linked list with the exclamation symbol (!).
    IDnumber.set(7, "!");

 // 7. Remove the first character of the Linked list.
    IDnumber.remove(0);

    

// 8. Display the LinkedList.
    System.out.println(IDnumber);


    // STACK (25 points)
    System.out.println("======================================================");
   
    Stack<String> Surname = new Stack<>();

    // 1. Create a Stack of characters of your SURNAME.
    Surname.push("P");
    Surname.push("I");
    Surname.push("N");
    Surname.push("E");
    Surname.push("D");
    Surname.push("A");

 // 2. Print the Stack.
    System.out.println(Surname);

    // 3. Add a "INF214" to the stack.
    Surname.push("I");
    Surname.push("N");
    Surname.push("F");
    Surname.push("2");
    Surname.push("1");
    Surname.push("4");

    // 4. Print the Stack.
    System.out.println(Surname);

    // 5. Remove "INF214".
    Surname.pop();
    Surname.pop();
    Surname.pop();
    Surname.pop();
    Surname.pop();
    Surname.pop();

    // 6. Add "CCDATRCL-INF214".
    Surname.push("C");
    Surname.push("C");
    Surname.push("D");
    Surname.push("A");
    Surname.push("T");
    Surname.push("A");
    Surname.push("R");
    Surname.push("C");
    Surname.push("L");
    Surname.push("-");

    Surname.push("I");
    Surname.push("N");
    Surname.push("F");
    Surname.push("2");
    Surname.push("1");
    Surname.push("4");

     // 7. Print the Stack.
    System.out.println(Surname);
    }
}
