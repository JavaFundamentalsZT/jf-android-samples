package org.zeroturnaround.jf.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // always need to call super
        super.onCreate(savedInstanceState);
        // display our message
        String msg = "Hello World!";
        TextView root = new TextView(this);
        root.setText(msg);
        setContentView(root);
    }
}
