package study.tools;

import java.util.GregorianCalendar;

public class print {
    public static void r(String msg) {
        System.out.println(msg);
    }

    public static void r(Object msg) {
        System.out.println(msg.toString());
    }

    public static void r(String msg, boolean isExit) {
        System.out.println(msg);
        if (isExit) System.exit(1000);
    }

    public static void r(Object msg, boolean isExit) {
        System.out.println(msg.toString());
        if (isExit) System.exit(1000);
    }

    public static void f(String format, Object... args) {
        System.out.printf(format, args);
    }

    public static void f(String format, String... args) {
        System.out.printf(format, args);
    }

    public static void log(Object msg) {
        System.err.printf("%tc%n%s%n", new GregorianCalendar().getTimeInMillis(), msg.toString());
        ;
    }
}
