package com.example.apprendreunelangueetrangere;

import java.util.Locale;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class phrases extends ActionBarActivity  {
	TextToSpeech t1;
	TextView tv1;
	   Button b1;
	   final Intent intent = getIntent();


 

	String phrase1 = "Tu t’appelles comment ?";
	String phrase2 = "Je m’appelle Rokia";
	String phrase3 = "Tu habites où ?";
	String phrase4 = "J’habite à Rabat.";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phraes);
        tv1=(TextView)findViewById(R.id. textView1);
        b1=(Button)findViewById(R.id.speechButton);
        
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
           @Override
           public void onInit(int status) {
              if(status != TextToSpeech.ERROR) {
                 t1.setLanguage(Locale.FRANCE);
              }
           }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String toSpeak = tv1.getText().toString();
               Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
               t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
         });

       final Intent intent = getIntent();
       String message = intent.getStringExtra(presentation.EXTRA_MESSAGE);
     
       
       if(message.equals("phrase_1")){	   
    	   final TextView tv1 = (TextView)findViewById(R.id.textView1);
           tv1.setText(phrase1);
          }
       
       
       if(message.equals("phrase_2")){	   
    	   final TextView tv1 = (TextView)findViewById(R.id.textView1);
           tv1.setText(phrase2);
       }
       if(message.equals("phrase_3")){	   
    	   final TextView tv1 = (TextView)findViewById(R.id.textView1);
           tv1.setText(phrase3);
       }
       if(message.equals("phrase_4")){	   
    	   final TextView tv1 = (TextView)findViewById(R.id.textView1);
           tv1.setText(phrase3);
       }
            
          }
    public void onPause(){
    if(t1 !=null){
       t1.stop();
       t1.shutdown();
    }
    super.onPause();
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

 
