package com.kodilla.stream;                                                   // [1]

import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {                                                     // [4]

    public static void main(String[] args) {

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


        System.out.println("\n" + "BookList");
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        System.out.println("\n" + "BookList collector");
        //BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()   // [1]
                .filter(book -> book.getYearOfPublication() > 2005)                  // [2]
                .collect(Collectors.toList());                                       // [3]

        System.out.println("# elements: " + theResultListOfBooks.size());       // [4]
        theResultListOfBooks.stream()                                           // [5]
                .forEach(System.out::println);

        System.out.println("\n" + "Booklist map");
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]

        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);

        System.out.println("\n" + "collector.joining()");
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]
        System.out.println(theResultStringOfBooks);

        System.out.println("\n" + "Zadanie 7.3");
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap = (Map<Integer, ForumUser>) forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'm')
                .filter(forumUser -> forumUser.getDob().isBefore(LocalDate.of(2001,10,12)))
                .filter(forumUser -> forumUser.getNumberOfPosts() > 1)
                        .collect(Collectors.toMap(ForumUser::getID, forumUser -> forumUser));
        System.out.println(forumUserMap);

        System.out.println("\n" + "zadanie 7.5");
        ArrayOperations arrayOperations = new ArrayOperations();
        int [] numbers = new int[5];
        for (int n = 0; n < 5; n ++) {
            numbers [n] = n + 15;
        }
        Double avg = ArrayOperations.getAverage(numbers);
        System.out.println(avg);
    }
}