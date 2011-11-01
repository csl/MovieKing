package com.demo.android.movieking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class MovieKing extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //�ŧiButton�����Ĳ�o�ƥ�gps
        Button button= (Button)findViewById(R.id.gps);
        button.setOnClickListener(gps);
        
      //�ŧiButton�����Ĳ�o�ƥ�movie
        Button button1= (Button)findViewById(R.id.movie);
        button1.setOnClickListener(movie);
        
      //�ŧiButton�����Ĳ�o�ƥ�card
		Button button2= (Button)findViewById(R.id.card);
        button2.setOnClickListener(card);
        
        
    }
    
    
   //gps��Ĳ�o�ƥ�
    private Button.OnClickListener gps = new Button.OnClickListener() 
    {
    	public void onClick(View v)
    	{
    		Intent intent = new Intent();
    		intent.setClass(MovieKing.this, MeteorMap.class);
    		startActivity(intent);  		    		
    	
    	}
    };
  //movie��Ĳ�o�ƥ�
    private Button.OnClickListener movie = new Button.OnClickListener() 
    {
    	public void onClick(View v)
    	{
    		Intent intent = new Intent();
    		intent.setClass(MovieKing.this, Region.class);
    		startActivity(intent);  		    		
    	
    	}
    };
  //card��Ĳ�o�ƥ�
    private Button.OnClickListener card = new Button.OnClickListener() 
    {
    	public void onClick(View v)
    	{
    		Intent intent = new Intent();
    		intent.setClass(MovieKing.this, Bank.class);
    		startActivity(intent);  		    		
    	
    	}
    };
    
}
 
   
