package daluai.app.sdk_boost.wrapper;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

@SuppressWarnings("unused")
public class ToastHandler {

    private final Handler mainHandler;
    private final Context context;

    public ToastHandler(Context context) {
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.context = context;
    }

    public ToastHandler(Application application) {
        this(application.getApplicationContext());
    }

    /**
     * Show short duration toast message using main thread.
     * @param toastMessage message to be displayed in toast.
     */
    public void showToast(String toastMessage) {
        showToast(toastMessage, Toast.LENGTH_SHORT);
    }

    /**
     * Show toast message using main thread.
     * @param toastMessage message to be displayed in toast.
     */
    public void showToast(String toastMessage, int duration) {
        mainHandler.post(() ->
                Toast.makeText(context, toastMessage, duration).show()
        );
    }
}