package com.example.qqlogin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void login(View view){
    	CheckBox RP = (CheckBox)findViewById(R.id.cb_remerber_pwd);
    	
    	if(RP.isChecked()){
    		Toast.makeText(this, "记住密码，登录成功", 0).show();
    	}else{
    		Toast.makeText(this, "登录成功", 0).show();
    	}
    		
    }
    
}
