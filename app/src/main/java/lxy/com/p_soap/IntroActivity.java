package lxy.com.p_soap;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.matthewtamlin.sliding_intro_screen_library.buttons.IntroButton;

import java.util.Collection;

/**
 * info:
 * date: 2017/4/7  23 ：32
 * mode:  - -!
 * author: Lvmoy
 */

public class IntroActivity extends com.matthewtamlin.sliding_intro_screen_library.core.IntroActivity{
    @Override
    protected Collection<? extends Fragment> generatePages(Bundle savedInstanceState) {
        return null;
    }

    @Override
    protected IntroButton.Behaviour generateFinalButtonBehaviour() {
        return null;
    }
}
