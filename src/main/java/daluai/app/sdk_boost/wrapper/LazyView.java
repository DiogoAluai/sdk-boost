package daluai.app.sdk_boost.wrapper;

import android.app.Activity;
import android.view.View;

import java.util.function.Supplier;

/**
 * View that initializes lazily, when get method is called.
 * This way, one can declare it's views as private final variables on activity's constructor.
 * Lazy loading is required, as views cannot be found by id because of android lifecycle constraints.
 *
 * @param <T> view type.
 */
public class LazyView<T extends View> implements Supplier<T> {

    private final Activity activity;
    private final int wrappedViewId;

    private T wrappedView;

    /**
     * Constructor.
     *
     * @param activity activity on which the view will be found at.
     */
    public LazyView(Activity activity, int viewId) {
        this.activity = activity;
        this.wrappedViewId = viewId;
    }

    @Override
    public T get() {
        if (wrappedView == null) {
            wrappedView = (T) activity.findViewById(wrappedViewId);
        }
        return wrappedView;
    }
}
