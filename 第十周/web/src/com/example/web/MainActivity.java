package com.example.web;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText editText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText = (EditText)findViewById(R.id.browset); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void jumpweb(View view){
		
		String urlString = editText.getText().toString();
		urlString = "http://"+urlString;
		Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(urlString));
		startActivity(intent);
	}
}
