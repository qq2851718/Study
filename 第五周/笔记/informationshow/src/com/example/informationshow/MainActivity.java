package com.example.informationshow;

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


    public void submit(View view) {
    EditText namEditText = (EditText)findViewById(R.id.name);
    EditText phoneEditText = (EditText)findViewById(R.id.phone);
    EditText emailEditText = (EditText)findViewById(R.id.email);
    
    EditText infoEditText = (EditText)findViewById(R.id.info);
    
    String nameString = namEditText.getText().toString();
    String phoneString = phoneEditText.getText().toString();
    String emailString = emailEditText.getText().toString();
    
    infoEditText.setText(nameString+phoneString+emailString);
    
    
		
	}
    
}
