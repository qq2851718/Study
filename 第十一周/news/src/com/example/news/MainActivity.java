package com.example.news;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	ListView listView;
	List<NewInfo> data;
	BaseAdapter adapter;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   listView = (ListView) findViewById(R.id.list);
        

        init();
    }

	private void init() {
		// TODO Auto-generated method stub
		listView = (ListView) findViewById(R.id.list);
		
		adapter = new BaseAdapter() {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub

//				View view =View.inflate(MainActivity.this,R.layout.news_item ,null);
//				TextView titleView = (TextView)view.findViewById(R.id.title);
//				
//				NewInfo info = data.get(position);
//				titleView.setText(info.getTitleString());	
				View view = View.inflate(MainActivity.this, R.layout.news_item, null);
				
				//��ȡ �����б��е�����
				NewInfo info =data.get(position);
				
				//��ȡ ��ͼ view�����ͼƬ�ؼ����ı��ؼ�
				TextView titleView =(TextView)view.findViewById(R.id.title);
				
				//���������������ÿ��Ƶ���ʾ����
				titleView.setText(info.getTitleString());
				
				TextView contentView =(TextView)view.findViewById(R.id.newsContent);
				titleView.setText(info.getConterString());
				
				


				return view;
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
				return data.size();
			}
		};
		listView.setAdapter(adapter);
	}

 
}
