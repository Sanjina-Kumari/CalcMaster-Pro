import java.util.Stack;

public class ExpressionEvaluator {

    public static int evaluate( String expression )  {

        // Implement your solution here, but don't try to do everything in this
        // method.  Make private static helper methods and delegate the work.



        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();


        // Splt the expressions into tokens with spaces
        String[] tokens = expression.split(" ");



        // loop over all tokens
        for (String token : tokens) {

            if (token.equals("")) continue; // skip empty

            if (isOperand(token)) {

                // convert string to int (searcged method online)

                int val = Integer.parseInt(token);

                operands.push(val);
            }
            // Check if token is an operator
            else if (token.length() == 1 && isOperator(token.charAt(0))) {

                char currentOp = token.charAt(0);

                // check preecedence with helper method and removing  old operator

                while (!operators.isEmpty() && operators.peek() != '(' && precedence(operators.peek()) >= precedence(currentOp)) {

                    processOperator(operators, operands);
                }


                operators.push(currentOp);
            }

                else if (token.equals("(")) {

                operators.push('('); // add to stak
            }

                else if (token.equals(")")) {   // remove till matching


                while (!operators.isEmpty() && operators.peek() != '(') {
                    processOperator(operators, operands);

                }

                if (!operators.isEmpty() && operators.peek() == '(') {

                    char temp = operators.pop(); //
                }
            }

        }

          // remaining operators

        while (!operators.isEmpty()) {

            processOperator(operators, operands);
        }

        // there should only be one left if valid so throw exceptin
        if (operands.size() != 1) {

            throw new RuntimeException("Invalid expression.");
        }


        int finalAns = operands.pop();

        return finalAns;
     }

    //  if a token is an operand

         private static boolean isOperand(String token) {

        try {
            Integer test = Integer.parseInt(token); //check if token is a  number

            return true;

        } catch (NumberFormatException e) {

            return false;
        }
    }

    // if a character is an operator

    private static boolean isOperator(char c) {

        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Helper method

       private static int precedence(char operator) {

        switch (operator) {
            case '^': return 3;

            case '*': case '/': return 2;

            case '+': case '-': return 1;

            default: return -1;
        }
    }

    //  apply an operation and push the result to the opernd stack

    private static void processOperator(Stack<Character> operators, Stack<Integer> operands) {

        char operator = operators.pop();

        int right = operands.pop();
        int left = operands.pop();

        int result = 0; // to store result

        // applying the math

        switch (operator) {
            case '+': result = left + right; break;

            case '-': result = left - right; break;

            case '*': result = left * right; break;

            case '/': result = left / right; break;

            case '^': result = (int) Math.pow(left, right); break;

            default: throw new RuntimeException("Unknown operator: " + operator);

        }
// push  / add result back
        operands.push(result);
    }
}