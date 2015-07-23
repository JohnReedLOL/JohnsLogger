/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Utilities.AppTester;

/**
 *
 * @author johnmichaelreed2
 */
class Test {

    public static void main(String args[]) {
        
        AppTester.printerr("lalala 1");
        
        try {
            two();
        } catch (Exception e) {
            AppTester.printEx(e);
            AppTester.printEx(new Exception("I am another exception"));
            AppTester.printEx("Input mismatch", new Exception("I am a third exception"));
        }

    }

    public static void two() throws Exception {
        three();
        AppTester.printerr("lalala 2");
        throw new Exception("Hi, I am an exception.");
    }

    public static void three() {
        four();
        AppTester.printerr("lalala 3");

    }

    public static void four() {
        five();
        AppTester.printerr("lalala 4");
    }

    public static void five() {
        
        six();
    }

    public static void six() {
        
        seven();
    }

    public static void seven() {
        //AppTester.check(false);
        AppTester.printerr("lalala 17 + \n + 8");
        AppTester.setNumberOfRowsIDisplayInStackTraces_(2);
        AppTester.check(false);
    }

}
