package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Runner runner = new Runner("Runner " + i);
            runner.setRunner(i+1);
            runner.setRunnerNum(0);
            runner.setPriority(i);
            runner.start();
            try {
                runner.join();
            } catch (InterruptedException e) {
                e.printStackTrace();


            }
        }

        for (int i = 5; i > 1; i--) {
            Runner runner = new Runner("Runner " + i);
            runner.setRunner(i-1);
            runner.setRunnerNum(1);
            runner.setPriority(i);
            runner.start();
            try {
                runner.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}