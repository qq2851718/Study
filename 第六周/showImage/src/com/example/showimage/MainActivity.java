package com.example.showimage;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	

	ImageView imageView;
	Button preButton,nextbButton,addButton,subButton;
	int currentId;
	int alpha =255;
	int imageId[]={R.drawable.app,R.drawable.atools,R.drawable.callmsgsafe,
			R.drawable.netmanager,R.drawable.safe,R.drawable.settings,
			R.drawable.sysoptimize,R.drawable.taskmanager,R.drawable.trojan};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.linear);
		
		imageView =(ImageView)findViewById(R.id.image) ;
		preButton =(Button)findViewById(R.id.pre);
		nextbButton =(Button)findViewById(R.id.next);
		addButton =(Button)findViewById(R.id.add);
		subButton =(Button)findViewById(R.id.sub);	
	}
	
	public void submit(View view) {
		if (view == preButton) {
			currentId =(currentId-1+imageId.length)%imageId.length;
			imageView.setImageResource(imageId[currentId]);
		}
		else if (view == nextbButton) {
			currentId =(currentId+1)%imageId.length;
			imageView.setImageResource(imageId[currentId]);
			
		}
		else if (view == addButton) {
			alpha +=20;
			if (alpha >255) alpha = 0;
			imageView.setImageAlpha(alpha);
			
		}
		
		else if (view == subButton) {
			alpha -=20;
			if (alpha <0) alpha = 255;
			imageView.setImageAlpha(alpha);
		}
		
		
	}


}
