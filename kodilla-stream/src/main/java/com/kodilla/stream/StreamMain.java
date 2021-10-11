package com.kodilla.stream;                                                   // [1]

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;                                    // [2]
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;                                   // [3]
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {                                                     // [4]

    public static void main(String[] args) {                                   // [5]
        Processor processor = new Processor();                                  // [6]
        Executor codeToExecute = () -> System.out.println("This is an example text.");  // [7]
        processor.execute(codeToExecute);

        System.out.println("\n");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);           // [6]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);           // [7]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);           // [8]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\n"+"Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\n" + "ZADANIE 7.1");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Poem poem poem. Poem!", (poem) -> "ABCD "+poem+ " ABCD");
        poemBeautifier.beautify("I want to grow big and capital", (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("Its just one word!", (poem)-> poem + " " + poem + " " + poem);
        poemBeautifier.beautify("Poem", (poem) -> poem.substring(1, poem.length() - 1));

    }
}