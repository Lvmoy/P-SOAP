package utils.globe;

import android.app.Application;

import timber.log.Timber;

/**
 * info:
 * date: 2017/4/3  15 ：49
 * mode:  - -!
 * author: Lvmoy
 */

public class SoapApplication extends Application {
    private static SoapApplication mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        Timber.plant(new Timber.DebugTree());
    }

    public final static SoapApplication getInstance(){
            return mContext;
    }
}
