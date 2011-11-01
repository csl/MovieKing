package com.demo.android.movieking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class SplashActivity extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        setContentView(R.layout.splash);  
        Handler x = new Handler();  
        x.postDelayed(new splashhandler(), 2000);          
        
    }
    
    class splashhandler implements Runnable
    {  
    	  public void run() {  
    	     startActivity(new Intent(getApplication(), MovieKing.class));  
    	     SplashActivity.this.finish();  
    	  }  
    }  
    
}
 
   
