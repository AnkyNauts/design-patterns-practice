package com.chainOfResponsibility;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {


        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "exception happened");
        logProcessor.log(LogProcessor.DEBUG, "need to debug");
        logProcessor.log(LogProcessor.INFO, "just for info");
    }

}
