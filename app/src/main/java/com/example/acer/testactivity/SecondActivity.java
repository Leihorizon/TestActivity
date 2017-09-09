package com.example.acer.testactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //接受
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();
        Button button=(Button)findViewById(R.id.button);
        final EditText editText2 = (EditText)findViewById(R.id.editTextUserId);
        button.setOnClickListener(new View.OnClickListener() {//发送
            @Override
            public void onClick(View v) {//发送
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("name",editText2.getText().toString());
                startActivity(intent);
            }
        });
    }

}
