package com.chainOfResponsibility;

public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level, String message) {
        if (level == INFO) {
            System.out.println("INF0: " + message);
        } else {
            super.log(level , message);
        }
    }
}
