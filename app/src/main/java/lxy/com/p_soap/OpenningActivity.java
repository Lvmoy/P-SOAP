package lxy.com.p_soap;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;

/**
 * info:
 * date: 2017/4/7  22 ：48
 * mode:  - -!
 * author: Lvmoy
 */

public class OpenningActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(Window.FEATURE_NO_TITLE);
    }
}
