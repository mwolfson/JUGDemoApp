package com.djug.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DemoFragment extends Fragment {
    private Button button;
    private TextView title;
       
    /**
     * Inflate the view from a layout file and return it
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.main, container, false);
        button = (Button)view.findViewById(R.id.button);
        title = (TextView)view.findViewById(R.id.title);  
        
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent home = new Intent(view.getContext(), Demo1Activity.class);
                startActivity(home);                
            }
        });       

        return view;
    }

    /**
     * The activity has been fully created
     */
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);        
    }

    /**
     * Set the text for the DemoFragments Button
     * 
     * @param titleIn
     */
    public void setButtonText(String textIn) {
        button.setText(textIn);        
    }

    /**
     * Set the text for the DemoFragments Button
     * 
     * @param titleIn
     */
    public void setTitleText(String textIn) {
        title.setText(textIn);        
    } 

   
}