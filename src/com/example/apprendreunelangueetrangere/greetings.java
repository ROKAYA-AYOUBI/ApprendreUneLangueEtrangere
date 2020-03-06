package com.example.apprendreunelangueetrangere;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class greetings extends ActionBarActivity {
	static String EXTRA_MESSAGE = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greetings);
        
        findViewById(R.id.button1).setOnClickListener(
        		new Button.OnClickListener(){

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(greetings.this,enphrasesg .class);
						intent.putExtra(EXTRA_MESSAGE, "phrase_1");
						startActivity(intent);	
					}
        		}
        		);
        
        findViewById(R.id.button2).setOnClickListener(
        		new Button.OnClickListener(){
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(greetings.this, enphrasesg.class);
						intent.putExtra(EXTRA_MESSAGE, "phrase_2");
						startActivity(intent);	
					}
        		}
        		);
        findViewById(R.id.button3).setOnClickListener(
        		new Button.OnClickListener(){
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(greetings.this, enphrasesg.class);
						intent.putExtra(EXTRA_MESSAGE, "phrase_3");
						startActivity(intent);	
					}
        		}
        		);
        findViewById(R.id.button4).setOnClickListener(
        		new Button.OnClickListener(){
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(greetings.this, enphrasesg.class);
						intent.putExtra(EXTRA_MESSAGE, "phrase_4");
						startActivity(intent);	
					}
        		}
        		);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
