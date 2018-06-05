package com.codecool.thehistory;

import java.util.Arrays;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        String[] stringArray = text.split("\\s");
        wordsArray = Arrays.copyOf(stringArray, stringArray.length);
//        System.out.println(Arrays.toString(wordsArray));
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        String[] temporaryArray = new String[0];
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].equals(wordToBeRemoved)) {
                ;
            } else {
                temporaryArray = Arrays.copyOf(temporaryArray, temporaryArray.length + 1);
                temporaryArray[temporaryArray.length - 1] = wordsArray[i];
            }
        }
//        System.out.println(Arrays.toString(temporaryArray));
    }

    @Override
    public int size() {
        return wordsArray.length;
    }

    @Override
    public void clear() {
        wordsArray = new String[0];
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
