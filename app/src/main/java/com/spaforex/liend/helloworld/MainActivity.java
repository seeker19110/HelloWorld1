package com.spaforex.liend.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private EditText edit;
    private  Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectView();
    }
    private void connectView(){
        tv = (TextView) findViewById(R.id.tv);
        edit= (EditText) findViewById(R.id.edit);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener( new View.OnClickListener(){
            @Override
            public  void onClick(View View) {
                doClickButton();
            }
        });
    }
    private void doClickButton(){
        String text = edit.getText().toString().trim();
        tv.setText(text);
        edit.setText("");
    }
}
