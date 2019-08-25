package com.example.blankapp;

import android.app.Activity;
import android.util.Log;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class BaseActivity extends Activity {

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent2(MessageEvent event) {
        Log.e("yijunwu", "BaseActivity " + event.getClass());
    }
}
