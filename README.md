# CalcMaster-Pro
Your smart expression evaluator that thinks like a mathematician!  A Java-based expression parser that calculates complex mathematical expressions with proper operator precedence and stack-based evaluation.

# Overview
CalcMaster Pro takes any mathematical expression with operators (+, -, *, /, ^) and calculates the result using stack-based algorithms that respect mathematical order of operations. It's like having a smart calculator that understands complex expressions!

# How It Works
## Parsing Phase:

- Splits expression into numbers and operators

- Uses two stacks: one for numbers, one for operators

- Respects operator precedence (PEMDAS rules)

## Evaluation Phase:

- Processes high-precedence operators first

- Handles exponents, multiplication, division, addition, subtraction

- Returns accurate mathematical results

# Features
🧮 Complex Expressions: Handles +, -, *, /, ^ with proper precedence

⚡ Stack-Based: Efficient two-stack algorithm for evaluation

🔢 Smart Parsing: Automatically handles spaces and number formats

🛡️ Error Handling: Detects invalid expressions and provides clear errors

📱 Interactive: Console-based interface for easy testing

# Quick Start
- Prerequisites
- Java JDK 21+

# Basic Usage

    public class Main {
        public static void main(String[] args) {
            // Evaluate expressions directly
            int result = ExpressionEvaluator.evaluate("2 + 3 * 4");
            System.out.println("Result: " + result); // Output: 14
        }
    }
    
# Interactive Mode

    // Run the main class for interactive expression evaluation
    // Enter expressions like: "5 + 3 * 2 ^ 2"

# Operator Precedence
        Operator	Precedence	Description
        ^	3	Exponentiation (highest)
        *, /	2	Multiplication, Division
        +, -	1	Addition, Subtraction (lowest)

#  Example Expressions
## Input:
    
      "2 + 3 * 4"
      "10 - 3 ^ 2"
      "8 / 2 * 2 + 1"

## Output:

      Result: 14
      Result: 1
      Result: 9

#  Project Structure

      CalcMasterPro/
      ├── src/
      │   ├── Main.java                 # Interactive console interface
      │   └── ExpressionEvaluator.java  # Core parsing and evaluation logic
      └── README.md

# How to Use
- Run the program in your Java environment

- Enter any mathematical expression when prompted

- Get instant results with proper order of operations
- Try complex expressions with multiple operators

# Supported Operations
- Addition: 5 + 3

- Subtraction: 10 - 4

- Multiplication: 6 * 7

- Division: 15 / 3

- Exponentiation: 2 ^ 3 (2 to the power of 3)

#  Technical Details
- Two-Stack Algorithm: Uses separate stacks for operands and operators

- Precedence Handling: Ensures mathematical correctness

- Space Handling: Automatically processes expressions with spaces

- Error Detection: Identifies invalid expressions and operations

# Common Examples
  
    ExpressionEvaluator.evaluate("3 + 5 * 2");        // Returns 13
    ExpressionEvaluator.evaluate("2 ^ 3 + 1");        // Returns 9
    ExpressionEvaluator.evaluate("10 - 2 * 3");       // Returns 4
    ExpressionEvaluator.evaluate("8 / 4 * 2");        // Returns 4

#  Error Handling
- Invalid expressions show clear error messages

- Division by zero is properly handled

- Unknown operators are detected and reported

- Malformed expressions provide helpful feedback

**Built to demonstrate stack algorithms and expression parsing**

_Calculate with confidence using proper mathematical rules!_

## Developer
  Developed by Sanjina Kumari at Pacific Lutheran University.
 
  For questions or feedback, feel free to reach out at sanjinamandhwani1@gmail.com!

## 📜 Acknowledgements
Project inspired by coursework in **CSCI 270 at Pacific Lutheran University**.  

Starter dataset and UML guidance provided by faculty.  
