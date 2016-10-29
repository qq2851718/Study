package com.example.student;


import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	String[] num={"\t1\t","\t2\t","\t3\t","\t4\t"};
	String[] name={"\tMidas\t","\tTom\t","\tJack\t","\tRoce\t"};
	String[] sex={"\tÄÐ\t","\tÄÐ\t","\tÄÐ\t","\tÄÐ\t"};
	String[] age={"\t18\t","\t18\t","\t18\t","\t18\t"};
	String[] cls={"\tÈí¼þ1\t","\tÈí¼þ1\t","\tÈí¼þ1\t","\tÈí¼þ1\t"};
	
	ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView =(ListView)findViewById(R.id.list);
        
        BaseAdapter baseAdapter=new BaseAdapter() {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				LinearLayout linearLayout = new LinearLayout(MainActivity.this);
				linearLayout.setOrientation(LinearLayout.HORIZONTAL);
			
				TextView textView = new TextView(MainActivity.this);
				TextView textView1 = new TextView(MainActivity.this);
				TextView textView2 = new TextView(MainActivity.this);
				TextView textView3 = new TextView(MainActivity.this);
				TextView textView4 = new TextView(MainActivity.this);
				
				textView.setText(num[position]);
				textView1.setText(name[position]);
				textView2.setText(sex[position]);
				textView3.setText(age[position]);
				textView4.setText(cls[position]);
				
				linearLayout.addView(textView);
				linearLayout.addView(textView1);
				linearLayout.addView(textView2);
				linearLayout.addView(textView3);
				linearLayout.addView(textView4);
				
				
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
				return num.length;
			}
		};
		listView.setAdapter(baseAdapter);	
        }
    }