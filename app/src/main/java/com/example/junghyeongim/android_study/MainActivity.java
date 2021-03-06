package com.example.junghyeongim.android_study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * main activity
 * master branch
 * test
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textview;
    Button btnTrans, btnBrowser, btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.main_textView);
        btnTrans = (Button) findViewById(R.id.main_button);
        btnBrowser = (Button) findViewById(R.id.main_button_browser);
        btnMap = (Button) findViewById(R.id.main_button_map);

        btnTrans.setOnClickListener(this);
        btnBrowser.setOnClickListener(this);
        btnMap.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.main_button:
                textview.setText("환영합니다!");
                break;
            case R.id.main_button_browser:
                startActivity(new Intent(this, WebViewActivity.class));
                break;
            case R.id.main_button_map:
                startActivity(new Intent(this, MapActivity.class));
                break;
        }
    }
}
