package org.zeroturnaround.jf.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelloActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // always need to call super
        super.onCreate(savedInstanceState);
        // display our message
        setContentView(R.layout.hello);
        Button myButton = (Button) findViewById(R.id.my_button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), R.string.click, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
