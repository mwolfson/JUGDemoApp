package com.djug.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Demo1Activity extends FragmentActivity {
    private Button button;
    private TextView title;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v("DJUG", "Fragment Button pressed");
                Intent home = new Intent(Demo1Activity.this, Demo2Activity.class);
                startActivity(home);                
            }
        });
        
        Log.v("DJUG", "Verbose");
        Log.d("DJUG", "Debug");
        Log.v("DJUG-x", "Tag 2");
        Log.v("DJUG-xy", "Tag 2");
        
    }
    
    
}