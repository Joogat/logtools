package com.joogat.logger;

import android.util.Log;

public class L {

    public static void e(Object object){ Log.e( getCallingLocation(), object + ""); }

    public static void e(String string){ Log.e( getCallingLocation(), string + ""); }

    public static void e(double number){ Log.e( getCallingLocation(), number + " <<<  this is the number"); }

    private static String getCallingLocation(){
        StackTraceElement element = Thread.currentThread().getStackTrace()[4];
        String[] classHierarchy = element.getClassName().split("\\.");
        String className = classHierarchy[classHierarchy.length -1];
        return element.getLineNumber() + " " + className + " " + element.getMethodName();
    }
}