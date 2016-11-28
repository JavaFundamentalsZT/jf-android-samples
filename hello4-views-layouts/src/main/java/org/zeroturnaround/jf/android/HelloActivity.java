package org.zeroturnaround.jf.android;

import android.app.Activity;
import android.os.Bundle;

public class HelloActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // always need to call super
        super.onCreate(savedInstanceState);
        // display our message
        setContentView(R.layout.hello);
    }
}
