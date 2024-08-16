package daluai.app.sdk_boost.wrapper;

import android.os.Handler;
import android.os.Looper;

import java.util.function.Consumer;

public final class UiUtils {

    private UiUtils() {
    }

    public  static <T> void runCallbackOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public  static <T> void runCallbackOnMainThread(Consumer<T> callback, T data) {
        new Handler(Looper.getMainLooper()).post(() ->
                callback.accept(data));
    }
}
