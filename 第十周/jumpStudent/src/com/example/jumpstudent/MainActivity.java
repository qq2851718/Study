package com.example.jumpstudent;


import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
//	String[] num={"1	Miads		male	18	软件1",
//			"2	TOM		male	18	软件1",
//			"3	JACK		male	18	软件1",
//			"4	Rose		male	18	软件1",
//			"5	Miads		male	18	软件1"
//			
//	};
	String[] num={"1","2","3","4"};
	String[] name={"Midas","Tom","Jack","Roce"};
	String[] sex={"男","男","男","男"};
	String[] age={"18","18","18","18"};
	String[] cls={"软件1","软件1","软件1","软件1"};
	
	ListView listView;
	BaseAdapter baseAdapter;
	List list=new ArrayList();
//	EditText addNum;
//	EditText addName;
//	EditText addAge;
//	EditText addSex;
//	EditText addClass;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        listView =(ListView)findViewById(R.id.list);
//        addNum = (EditText)findViewById(R.id.addNum);
//        addName = (EditText)findViewById(R.id.addName);
//        addAge = (EditText)findViewById(R.id.addAge);
//        addSex = (EditText)findViewById(R.id.addSex);
//        addClass = (EditText)findViewById(R.id.addClass);
        for(int i = 0;i<name.length;i++){
        	list.add(num[i]+"\t\t\t"+name[i]+"\t\t\t"+sex[i]+"\t\t\t"+age[i]+"\t\t\t"+cls[i]);
        }
        
        baseAdapter=new BaseAdapter() {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				LinearLayout linearLayout = new LinearLayout(MainActivity.this);
				linearLayout.setOrientation(LinearLayout.HORIZONTAL);
			
				TextView textView = new TextView(MainActivity.this);

				textView.setText(list.get(position).toString());
//				
				linearLayout.addView(textView);
				
				
				return linearLayout;
			}
			
			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				//return num.length;
				return list.size();
			}
		};
		listView.setAdapter(baseAdapter);	
		Intent intent = getIntent();
		num = intent.getStringArrayExtra("num");
		name = intent.getStringArrayExtra("name");
		sex = intent.getStringArrayExtra("sex");
		age = intent.getStringArrayExtra("age");
		cls = intent.getStringArrayExtra("cls");
		list.add(num+"\t\t\t"+name+"\t\t\t\t"+sex+"\t\t\t"+age+"\t\t\t"+cls);
		baseAdapter.notifyDataSetChanged();
        }
    
//    	public void add(View view){
//    		String num = addNum.getText().toString();
//    		String name = addName.getText().toString();
//    		String age = addAge.getText().toString();
//    		String sex = addSex.getText().toString();
//    		String cls = addClass.getText().toString();
//    		list.add(num+"\t\t\t"+name+"\t\t\t\t"+sex+"\t\t\t"+age+"\t\t\t"+cls);
//    		baseAdapter.notifyDataSetChanged();
//    	}
    	
    	/*调转到添加页面*/
    	public void jumpadd(View view) {
			// TODO Auto-generated method stub

    		Intent intent = new Intent(MainActivity.this,AddActivity.class);
    		startActivity(intent);
		}
    }