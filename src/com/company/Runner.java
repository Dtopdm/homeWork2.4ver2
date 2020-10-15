package com.company;

public class Runner extends Thread {
    private int runner;
    private int runnerNum;

    public Runner(String name) {
        super(name);
    }

    public int getRunner() {
        return runner;
    }

    public void setRunner(int runner) {
        this.runner = runner;
    }

    public int getRunnerNum() {
        return runnerNum;
    }

    public void setRunnerNum(int runnerNum) {
        this.runnerNum = runnerNum;
    }

    public void run() {
        if (getRunnerNum() == 0) {
            if (getRunner() == 6) {
                System.out.println(getName() + " берет палочку ");
                System.out.println(getName() + " бежит к финишу ");

            } else {
                System.out.println(getName() + " берет палочку ");
                System.out.println(getName() + " бежит к Runner " + getRunner());
            }
        }
        else{
                if (getRunner() != 5) {
                    System.out.println(getName() + " берет палочку ");
                    System.out.println(getName() + " бежит к Runner " + getRunner());
                }
            }
        try {
            sleep(1000);
        } catch (InterruptedException ie) {
        }

        }
    }
