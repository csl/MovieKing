package com.demo.android.movieking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Region extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.region);
        
        //�ŧiButton�����Ĳ�o�ƥ�north(�_�ϫ��s)
        Button button= (Button)findViewById(R.id.North);
        button.setOnClickListener(north);
       
        
        
    }
    
    
   //�_�ϫ��s��Ĳ�o�ƥ�
    private Button.OnClickListener north = new Button.OnClickListener() 
    {
    	public void onClick(View v)
    	{
    		Intent intent = new Intent();
    		intent.setClass(Region.this, Nregion.class);
    		startActivity(intent);  		    		
    	
    	}
    };
    
    
    
}
 
   
