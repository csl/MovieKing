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
      //�إߤ@��ArrayAdapter����A�é�m�U�Կ�檺���e
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,new String[]
   {"����@�ػȦ�","����H�U","��X�Ȧ�","�ثn�Ȧ�","���׻Ȧ�","�é��H�Υd"}); 
    //�]�w�U�Կ�檺�˦� 
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); 
spinner.setAdapter(adapter); 
    //�]�w���سQ������᪺�ʧ@ 
   spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){ 
       public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id){ 
      Toast.makeText(Bank.this, "�z���"+adapterView.getSelectedItem().toString(), Toast.LENGTH_LONG).show(); 
      } 
   public void onNothingSelected(AdapterView<?> arg0) { 
   Toast.makeText(Bank.this, "�z�S����ܥ��󶵥�", Toast.LENGTH_LONG).show(); 
                   } 
                }); 
           } 
        }
        
        
        
        
        


