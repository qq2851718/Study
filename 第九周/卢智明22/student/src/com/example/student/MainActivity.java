package com.example.student;


import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	String[] num={"1	Miads		male	18	软件1",
			"2	TOM		male	18	软件1",
			"3	JACK		male	18	软件1",
			"4	Rose		male	18	软件1",
			"5	Miads		male	18	软件1"
			
	};
//	String[] num={"\t1\t","\t2\t","\t3\t","\t4\t"};
//	String[] name={"\tMidas\t","\tTom\t","\tJack\t","\tRoce\t"};
//	String[] sex={"\t男\t","\t男\t","\t男\t","\t男\t"};
//	String[] age={"\t18\t","\t18\t","\t18\t","\t18\t"};
//	String[] cls={"\t软件1\t","\t软件1\t","\t软件1\t","\t软件1\t"};
	
	ListView listView;
	BaseAdapter baseAdapter;
	List list1=new ArrayList();
	List list2=new ArrayList();
	List list3=new ArrayList();
	List list4=new ArrayList();
	List list5=new ArrayList();
	EditText addName;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView =(ListView)findViewById(R.id.list);
        addName = (EditText)findViewById(R.id.addName);
        for(int i = 0;i<num.length;i++){
        	list1.add(num[i]);
        }
        
        baseAdapter=new BaseAdapter() {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				LinearLayout linearLayout = new LinearLayout(MainActivity.this);
				linearLayout.setOrientation(LinearLayout.HORIZONTAL);
			
				TextView textView = new TextView(MainActivity.this);
//				TextView textView1 = new TextView(MainActivity.this);
//				TextView textView2 = new TextView(MainActivity.this);
//				TextView textView3 = new TextView(MainActivity.this);
//				TextView textView4 = new TextView(MainActivity.this);

				textView.setText(list1.get(position).toString());
//				textView.setText(num[position]);
//				textView1.setText(name[position]);
//				textView2.setText(sex[position]);
//				textView3.setText(age[position]);
//				textView4.setText(cls[position]);
//				
				linearLayout.addView(textView);
//				linearLayout.addView(textView1);
//				linearLayout.addView(textView2);
//				linearLayout.addView(textView3);
//				linearLayout.addView(textView4);
				
				
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
				return list1.size();
			}
		};
		listView.setAdapter(baseAdapter);	
        }
    	public void add(View view){
    		String num = addName.getText().toString();
    		list1.add(num);
    		baseAdapter.notifyDataSetChanged();
    	}
    }