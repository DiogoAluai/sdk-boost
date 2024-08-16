package daluai.app.sdk_boost.wrapper;

import android.util.Log;

/**
 * Reduces the hassle of logging by setting up a tag with simple name of provided class.
 */
@SuppressWarnings("unused")
public class Logger {

    private final String tag;

    /**
     * Constructor
     */
    public Logger(String tag) {
        this.tag = tag;
    }

    /**
     * Constructor
     * @param clazz class to be used for logger tag
     */
    public Logger(Class<?> clazz) {
        this.tag = clazz.getSimpleName();
    }

    /**
     * Factory method
     * @param clazz class to be used for logger tag
     */
    public static Logger ofClass(Class<?> clazz) {
        return new Logger(clazz);
    }

    /**
     * Info
     */
    public void i(String message) {
        Log.i(tag, message);
    }

    /**
     * Info
     */
    public void i(String message, Throwable e) {
        Log.i(tag, message, e);
    }

    /**
     * Error
     */
    public void e(String message) {
        Log.e(tag, message);
    }

    /**
     * Error
     */
    public void e(String message, Throwable e) {
        Log.e(tag, message, e);
    }

    /**
     * Warning
     */
    public void w(String message) {
        Log.w(tag, message);
    }

    /**
     * Warning
     */
    public void w(String message, Throwable e) {
        Log.w(tag, message, e);
    }

    /**
     * V!
     */
    public void v(String message) {
        Log.v(tag, message);
    }

    /**
     * V!
     */
    public void v(String message, Throwable e) {
        Log.v(tag, message, e);
    }

    /**
     * Debug
     */
    public void d(String message) {
        Log.d(tag, message);
    }

    /**
     * Debug
     */
    public void d(String message, Throwable e) {
        Log.d(tag, message, e);
    }

    /**
     * Wtf?
     */
    public void wtf(String message) {
        Log.wtf(tag, message);
    }

    /**
     * Wtf?
     */
    public void wtf(String message, Throwable e) {
        Log.wtf(tag, message, e);
    }
}