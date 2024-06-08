package daluai.app.sdk_boost.wrapper;

import android.util.Log;

/**
 * Aluai Log, developed by Diogo Aluai.
 * Reduces the hassle of logging by setting up a tag with simple name of provided class.
 */
@SuppressWarnings("unused")
public class Logger {

    private final String tag;

    public Logger(String tag) {
        this.tag = tag;
    }

    public Logger(Class<?> clazz) {
        this.tag = clazz.getSimpleName();
    }

    public static Logger ofClass(Class<?> clazz) {
        return new Logger(clazz);
    }

    public void i(String message) {
        Log.i(tag, message);
    }

    public void i(String message, Throwable e) {
        Log.i(tag, message, e);
    }

    public void e(String message) {
        Log.e(tag, message);
    }

    public void e(String message, Throwable e) {
        Log.e(tag, message, e);
    }

    public void w(String message) {
        Log.w(tag, message);
    }

    public void w(String message, Throwable e) {
        Log.w(tag, message, e);
    }

    public void v(String message) {
        Log.v(tag, message);
    }

    public void v(String message, Throwable e) {
        Log.v(tag, message, e);
    }

    public void d(String message) {
        Log.d(tag, message);
    }

    public void d(String message, Throwable e) {
        Log.d(tag, message, e);
    }

    public void wtf(String message) {
        Log.wtf(tag, message);
    }

    public void wtf(String message, Throwable e) {
        Log.wtf(tag, message, e);
    }
}