import java.util.Stack;

public class ParenthesesChecker {

    // created stack of text to test vs the checker
//checking to see if it prints out the stack as intended
// pop removes the item that is the furthest away from stack.
    public boolean checkParentheses(String testString) {

        Stack<String> parentheses = new Stack<>();
//        parentheses.push("(");
//        parentheses.push(")");
//        parentheses.push("()");
//        parentheses.push("())");
//        parentheses.push("(()");
//        parentheses.push("(())");


        for (int i = 0; i <= testString.length(); i++) {
            switch (testString.charAt(i)) {
                case 1:

                    if (testString.contains("(")) {
                        parentheses.push("(");
                    }

                case 2:
                    if (testString.contains("(") || testString.contains(")")) parentheses.push("(");
                    parentheses.push(")");


                case 3:

                    parentheses.push("");


            }


        }
        return;
    }
}
//Create a stack containing the character
//Define object of the stack
//Create conditions considering the unique character
//Check character contains the identifer (i.e. ( or )) and add it to stack
//when there is a ) in the sentance, check to see if there is a ( to close off the parentheses and return true
//otherwise if there is no bracket to either open or close return false.