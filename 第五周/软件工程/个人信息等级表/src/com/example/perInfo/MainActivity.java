package com.example.perInfo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void submit(View view){
	  EditText eName = (EditText)findViewById(R.id.eName); 
	  EditText ePhone = (EditText)findViewById(R.id.ePhone); 
	  EditText eEmail = (EditText)findViewById(R.id.eEmail); 
	  
	  EditText info = (EditText)findViewById(R.id.info); 
	  
	  info.setText("ÐÕÃû£º"+eName.getText()+"\nµç»°ºÅÂë£º"+ePhone.getText()+"\nEmail:"+eEmail.getText());
   }
   
    
}
