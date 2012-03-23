package com.djug.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Demo2Activity extends Activity {
    private Button button;
    private TextView title;
    
    private Button button2;
    private TextView title2;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_two);
        
        title = (TextView)findViewById(R.id.title);
        title.setText("Demo2Activity");
        
        //First Button
        button = (Button) findViewById(R.id.button);        
        button.setText("Launch Demo1Activity");                
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent home = new Intent(Demo2Activity.this, Demo1Activity.class);
                startActivity(home);                
            }
        });
        
        //Second Button
        button2 = (Button) findViewById(R.id.button_two);
        button2.setText("Launch FragmentHostActivity");                
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v("DJUG", "Button pressed");
                Intent fragHome = new Intent(Demo2Activity.this, FragmentHostActivity.class);
                startActivity(fragHome);                
            }
        });
        
    }
}