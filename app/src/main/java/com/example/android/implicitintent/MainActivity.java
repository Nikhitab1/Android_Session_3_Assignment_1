package com.example.android.implicitintent;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   EditText edt1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt1 = (EditText) findViewById(R.id.edittext);
        b1 = (Button) findViewById(R.id.button);

    }

 public void OnClickSearch(View v){

     String term=edt1.getText().toString();

     Intent intent=new Intent(Intent.ACTION_WEB_SEARCH);
     intent.setData(Uri.parse("https://www.google.com"));
     intent.putExtra(SearchManager.QUERY, term);
     startActivity(intent);

 }
}