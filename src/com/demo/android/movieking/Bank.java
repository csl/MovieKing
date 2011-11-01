package com.demo.android.movieking;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class Bank extends Activity {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bank);
	
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
      //建立一個ArrayAdapter物件，並放置下拉選單的內容
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,new String[]
   {"國泰世華銀行","中國信託","花旗銀行","華南銀行","永豐銀行","永旺信用卡"}); 
    //設定下拉選單的樣式 
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); 
spinner.setAdapter(adapter); 
    //設定項目被選取之後的動作 
   spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){ 
       public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id){ 
      Toast.makeText(Bank.this, "您選擇"+adapterView.getSelectedItem().toString(), Toast.LENGTH_LONG).show(); 
      } 
   public void onNothingSelected(AdapterView<?> arg0) { 
   Toast.makeText(Bank.this, "您沒有選擇任何項目", Toast.LENGTH_LONG).show(); 
                   } 
                }); 
           } 
        }
        
        
        
        
        


