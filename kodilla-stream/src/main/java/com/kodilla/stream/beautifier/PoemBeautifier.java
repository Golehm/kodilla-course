package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String myPoem, String myBeautifier, PoemDecorator poemDecorator) {
        String string = poemDecorator.decorate(myPoem, myBeautifier);
        System.out.println(string);
    }
}
