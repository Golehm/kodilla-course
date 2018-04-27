package com.kodilla.stream;

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
//import com.kodilla.stream.lambda.Executor;
//import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }
        //Processor processor = new Processor();
        //Executor codeToExecute = () -> System.out.println("This is an example text.");
        //processor.execute(codeToExecute);
        //processor.execute(() -> System.out.println("This is an example text."));

       // ExpressionExecutor expressionExecutor = new ExpressionExecutor();

       // expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
      //  expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
      //  expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
       // expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
}
