//package com.jaymansmann;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * Hello world!
// */
//public class App {
//    public static void main(String[] args) {
//        runOtherMethod();
//
//    }
//
//    public static int getScore() {
//        List<TriviaQuestion> triviaQuestions = new ArrayList<>();
//        Prompter prompter = new Prompter();
//        int score = 0;
//        for (TriviaQuestion triviaQuestion : triviaQuestions) {
////            System.out.println( triviaQuestion);
//            prompter.showPrompt(triviaQuestion.getPrompt());
//            String guess = scanner.next();
//
//            if (guess.equals(triviaQuestion.getAnswer())) {
//                System.out.println("Great!");
//                score++;
//            } else {
//                score--;
//            }
//            System.out.println("Score " + score);
//
//        }
//        scanner.close();
//        return score;
//    }
//}
//
//interface QuestionAsker {
//    public String askQuestion(TriviaQuestion question);
//}
//
//class TriviaGame {
//    private QuestionAsker questionAsker;
//    public TriviaGame(QuestionAsker questionAsker) {
//        this.questionAsker = questionAsker;
//    }
//
//    public void play() {
//        String response = questionAsker.askQuestion(new TriviaQuestion("What's my name", "Jay"));
//
//    }
//}