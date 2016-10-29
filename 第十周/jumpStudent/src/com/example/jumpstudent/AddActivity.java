package com.example.jumpstudent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class AddActivity extends Activity {
	
	EditText addNum;
	EditText addName;
	EditText addAge;
	EditText addSex;
	EditText addClass;
	Intent intent;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.add_stu);
		
		addNum = (EditText)findViewById(R.id.addNum);
        addName = (EditText)findViewById(R.id.addName);
        addAge = (EditText)findViewById(R.id.addAge);
        addSex = (EditText)findViewById(R.id.addSex);
        addClass = (EditText)findViewById(R.id.addClass);
	}
	
	/*添加用户资料*/
	public void add(View view){
		String num = addNum.getText().toString();
		String name = addName.getText().toString();
		String age = addAge.getText().toString();
		String sex = addSex.getText().toString();
		String cls = addClass.getText().toString();
		intent = new Intent();
		intent.putExtra("num", num);
		intent.putExtra("name", name);
		intent.putExtra("age", age);
		intent.putExtra("sex", sex);
		intent.putExtra("cls", cls);
		intent = new Intent(AddActivity.this,MainActivity.class);
		startActivity(intent);
	}
	/* 返回 */
	public void addback(View view) {
		// TODO Auto-generated method stub
		intent = new Intent(AddActivity.this,MainActivity.class);
		startActivity(intent);
	}
}
