package org.zeroturnaround.jf.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class HelloActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // always need to call super
        super.onCreate(savedInstanceState);
        // display our message
        String msg = getResources().getString(R.string.hello_world);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
