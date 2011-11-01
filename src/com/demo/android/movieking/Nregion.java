package com.demo.android.movieking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nregion extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nregion);
        
        //宣告Button實體並觸發事件給台北市按鈕
        Button button= (Button)findViewById(R.id.Taipei);
        button.setOnClickListener(Taipei);
        
    }
        
        //台北市的觸發事件
        private Button.OnClickListener Taipei = new Button.OnClickListener() 
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent();
        		intent.setClass(Nregion.this, Northmovie.class);
        		startActivity(intent);  		    		
        	
        	}
        };
        
        
        
    }