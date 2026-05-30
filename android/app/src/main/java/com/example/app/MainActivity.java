package com.example.app;

import android.os.Bundle; // <-- 1. Make sure to add this import
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 2. Add the web view configuration right here:
        this.bridge.getWebView().getSettings().setMediaPlaybackRequiresUserGesture(false);
    }
}