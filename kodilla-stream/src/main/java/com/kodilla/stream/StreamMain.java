package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier greatPoet = new PoemBeautifier();
        greatPoet.beautify( "TIGER, tiger, burning bright", "@@@",
                (poem, beautifier) -> beautifier + " " + poem + " " + beautifier);
        greatPoet.beautify( "In the forests of the night,", "@@@",
                (poem, beautifier) -> beautifier + " " + poem.toUpperCase() + " " + beautifier);
        greatPoet.beautify( "What immortal hand or eye", "@@@",
                (poem, beautifier) -> beautifier + " " + poem.toLowerCase() + " " + beautifier);
        greatPoet.beautify( "Could frame thy fearful symmetry?", "@@@",
                (poem, beautifier) -> beautifier + " " + poem.substring(0,24) + "..." + " " + beautifier);
    }

}
