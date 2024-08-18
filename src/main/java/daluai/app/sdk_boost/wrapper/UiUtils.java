package daluai.app.sdk_boost.wrapper;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Utility functions for UI.
 */
@SuppressWarnings("unused")
public final class UiUtils {

    private UiUtils() {
    }

    /**
     * Run callback on UI thread.
     */
    public  static <T> void runCallbackOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }


    /**
     * Run consumer callback on UI thread.
     */
    public  static <T> void runCallbackOnMainThread(Consumer<T> callback, T data) {
        new Handler(Looper.getMainLooper()).post(() ->
                callback.accept(data));
    }

    /**
     * Run consumer callback on UI thread.
     */
    public  static <T> void runCallbackOnMainThread(Consumer<T> callback, Supplier<T> dataSupplier) {
        new Handler(Looper.getMainLooper()).post(() ->
                callback.accept(dataSupplier.get()));
    }

    /**
     * Clear focus from components of given class, whenever user clicks away.
     * Usage example: override dispatchTouchEvent and call this function before returning super.
     * <p/>
     * Original source code <a href="https://stackoverflow.com/questions/4828636/edittext-clear-focus-on-touch-outside">here</a>
     */
    public static void clearFocusIfClickedAway(Activity activity, MotionEvent event, Class<?> componentClass) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View v = activity.getCurrentFocus();
            if (v!= null && componentClass.isAssignableFrom(v.getClass())) {
                Rect outRect = new Rect();
                v.getGlobalVisibleRect(outRect);
                if (!outRect.contains((int) event.getRawX(), (int) event.getRawY())) {
                    v.clearFocus();
                    InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        }
    }
}
