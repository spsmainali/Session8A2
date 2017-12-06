package com.example.spsm.session8a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String[] NAMES = {"Ram","Shyam","Rahul","Mehul","Aranya","Saranya","Abhishek","Animesh"};
    String[] MobNos = {"123","2345","543","5654","6476","345","5646","1423"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView);

        CustomAdaptor customAdaptor = new CustomAdaptor();

        listView.setAdapter(customAdaptor);

    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return NAMES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);

            TextView textView_name= (TextView) findViewById(R.id.textView_name);
            TextView textView_phoneNo = (TextView) findViewById(R.id.textView_phoneNo);

            textView_name.setText(NAMES[i]);
            textView_phoneNo.setText(MobNos[i]);
            return null;
        }
    }
}
