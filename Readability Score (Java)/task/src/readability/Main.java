package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static double polysyllablesCount;
    static double syllablesCount;
    static double characterCount;
    static double sentenceCount;
    static double wordCount;
    static double average;
    static String input = "";


    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(new File(args[0]));
            while (in.hasNext()) {
                input += in.nextLine();
            }
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        getCounts(input);
        print();

        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        Scanner in = new Scanner(System.in);
        String selection = in.nextLine();
        System.out.println();

        if (selection.equalsIgnoreCase("ARI")) {
            getARI();
        } else if (selection.equalsIgnoreCase("FX")) {
            getFX();
        } else if (selection.equalsIgnoreCase("SMOG")) {
            getSMOG();
        } else if (selection.equalsIgnoreCase("CL")) {
            getCL();
        } else if (selection.equalsIgnoreCase("all")) {
            getAll();
        }
    }

    private static void getARI() {
        double score;
        String ageRange = "";

        score = 4.71 * (characterCount / wordCount) + 0.5 * (wordCount / sentenceCount) - 21.43;

        int switchNumber = (int) Math.ceil(score);
        switch (switchNumber) {
            case 1:
                ageRange = "(about 6-year-olds).";
                break;
            case 2:
                ageRange = "(about 7-year-olds).";
                break;
            case 3:
                ageRange = "(about 8-year-olds).";
                break;
            case 4:
                ageRange = "(about 9-year-olds).";
                break;
            case 5:
                ageRange = "(about 10-year-olds).";
                break;
            case 6:
                ageRange = "(about 11-year-olds).";
                break;
            case 7:
                ageRange = "(about 12-year-olds).";
                break;
            case 8:
                ageRange = "(about 13-year-olds).";
                break;
            case 9:
                ageRange = "(about 14-year-olds).";
                break;
            case 10:
                ageRange = "(about 15-year-olds).";
                break;
            case 11:
                ageRange = "(about 16-year-olds).";
                break;
            case 12:
                ageRange = "(about 17-year-olds).";
                break;
            case 13:
                ageRange = "(about 18-year-olds).";
                break;
            case 14:
                ageRange = "(about 19-year-olds).";
                break;
        }

        System.out.printf("Automated Readability Index: %.2f %s\n", score, ageRange);
    }
    private static void getFX() {
        double score = 0.39 * (wordCount / sentenceCount) + 11.8 * (syllablesCount / wordCount) - 15.59;

        String ageRange = "";
        int switchNumber = (int) Math.ceil(score);
        switch (switchNumber) {
            case 1:
                ageRange = "(about 5-year-olds).";
                break;
            case 2:
                ageRange = "(about 6-year-olds).";
                break;
            case 3:
                ageRange = "(about 7-year-olds).";
                break;
            case 4:
                ageRange = "(about 8-year-olds).";
                break;
            case 5:
                ageRange = "(about 9-year-olds).";
                break;
            case 6:
                ageRange = "(about 10-year-olds).";
                break;
            case 7:
                ageRange = "(about 11-year-olds).";
                break;
            case 8:
                ageRange = "(about 12-year-olds).";
                break;
            case 9:
                ageRange = "(about 13-year-olds).";
                break;
            case 10:
                ageRange = "(about 14-year-olds).";
                break;
            case 11:
                ageRange = "(about 15-year-olds).";
                break;
            case 12:
                ageRange = "(about 16-year-olds).";
                break;
            case 13:
                ageRange = "(about 17-year-olds).";
                break;
            case 14:
                ageRange = "(about 18-year-olds).";
                break;
        }

        System.out.printf("Flesch–Kincaid readability tests: %.2f %s\n", score, ageRange);
    }
    private static void getSMOG() {
        double score = 1.043 * Math.sqrt(polysyllablesCount * (30 / sentenceCount)) + 3.1291;

        String ageRange = "";
        int switchNumber = (int) Math.ceil(score);
        switch (switchNumber) {
            case 1:
                ageRange = "(about 5-year-olds).";
                break;
            case 2:
                ageRange = "(about 6-year-olds).";
                break;
            case 3:
                ageRange = "(about 7-year-olds).";
                break;
            case 4:
                ageRange = "(about 8-year-olds).";
                break;
            case 5:
                ageRange = "(about 9-year-olds).";
                break;
            case 6:
                ageRange = "(about 10-year-olds).";
                break;
            case 7:
                ageRange = "(about 11-year-olds).";
                break;
            case 8:
                ageRange = "(about 12-year-olds).";
                break;
            case 9:
                ageRange = "(about 13-year-olds).";
                break;
            case 10:
                ageRange = "(about 14-year-olds).";
                break;
            case 11:
                ageRange = "(about 15-year-olds).";
                break;
            case 12:
                ageRange = "(about 16-year-olds).";
                break;
            case 13:
                ageRange = "(about 17-year-olds).";
                break;
            case 14:
                ageRange = "(about 18-year-olds).";
                break;
        }

        System.out.printf("Simple Measure of Gobbledygook: %.2f %s\n", score, ageRange);
    }
    private static void getCL() {
        double bigL =100 * characterCount / wordCount;
        double bigS = 100 * sentenceCount / wordCount;
        double score = (0.0588 * bigL) - (0.296 * bigS) - 15.8;

        String ageRange = "";
        int switchNumber = (int) Math.ceil(score);
        switch (switchNumber) {
            case 1:
                ageRange = "(about 7-year-olds).";
                break;
            case 2:
                ageRange = "(about 8-year-olds).";
                break;
            case 3:
                ageRange = "(about 9-year-olds).";
                break;
            case 4:
                ageRange = "(about 10-year-olds).";
                break;
            case 5:
                ageRange = "(about 11-year-olds).";
                break;
            case 6:
                ageRange = "(about 12-year-olds).";
                break;
            case 7:
                ageRange = "(about 13-year-olds).";
                break;
            case 8:
                ageRange = "(about 14-year-olds).";
                break;
            case 9:
                ageRange = "(about 15-year-olds).";
                break;
            case 10:
                ageRange = "(about 16-year-olds).";
                break;
            case 11:
                ageRange = "(about 17-year-olds).";
                break;
            case 12:
                ageRange = "(about 18-year-olds).";
                break;
            case 13:
                ageRange = "(about 19-year-olds).";
                break;
            case 14:
                ageRange = "(about 20-year-olds).";
                break;
            case 15:
                ageRange = "(about 21-year-olds).";
                break;
            case 16:
                ageRange = "(about 22-year-olds).";
                break;
        }

        System.out.printf("Coleman–Liau index: %.2f %s\n", score, ageRange);
    }
    private static void getAll() {
        getARI();
        getFX();
        getSMOG();
        getCL();
    }

    private static void getCounts(String input) {

        String[] sentences = input.split("[\\.|\\?|\\!]");
        sentenceCount = sentences.length;

        String[] words = input.split("\\s");
        wordCount = words.length;

        for (String w : words) {
            characterCount += w.length();
        }

        average = wordCount / sentenceCount;

        syllablesCount = 0;
        polysyllablesCount = 0;
        for (String w : words) {
            int tempCount = 0;
            w = w.toLowerCase();


            w = w.replaceAll("e$", "");
            w = w.replaceAll("[aeiouy]{2}", "a");
            w = w.replaceAll("[aeiouy]{2}", "a");
            w = w.replaceAll("[^aeiouy]", "");
            w = w.strip();

            if (w.length() > 2) {
                tempCount = w.length();
                polysyllablesCount += 1;
            } else if (w.length() > 1) {
                tempCount = w.length();
            } else {
                tempCount = 1;
            }
            syllablesCount += tempCount;
        }
    }

    private static void print () {
        System.out.println("The text is:");
        System.out.println(input);
        System.out.println();
        System.out.printf("Words: %.0f\n", wordCount);
        System.out.printf("Sentences: %.0f\n", sentenceCount);
        System.out.printf("Characters: %.0f\n", characterCount);
        System.out.printf("Syllables: %.0f\n", syllablesCount);
        System.out.printf("Polysyllables: %.0f\n", polysyllablesCount);
    }
}
