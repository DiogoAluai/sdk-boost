package daluai.app.sdk_boost.wrapper;

import android.app.Activity;
import android.view.View;

/**
 * Activity aware lazy view creator.
 */
public class LazyViewFactory {

    private final Activity activity;

    /**
     * Constructor.
     *
     * @param activity activity on which the view will be found at.
     */
    public LazyViewFactory(Activity activity) {
        this.activity = activity;
    }

    /**
     * Create lazy view for given id.
     */
    public <T extends View> LazyView<T> createView(int viewId) {
        return new LazyView<>(activity, viewId);
    }
}
