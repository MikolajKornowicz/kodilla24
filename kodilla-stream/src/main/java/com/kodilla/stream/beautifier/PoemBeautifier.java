package com.kodilla.stream.beautifier;

public class PoemBeautifier {
String beautified;

    public void beautify(String poem, PoemDecorator poemDecorator) {
        beautified = poemDecorator.decorate(poem);
        System.out.println(beautified);
    }
}
