package com.example.acer.testactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //接受
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();
        //发送
        Button button=(Button)findViewById(R.id.button2);
        final EditText editText1 = (EditText)findViewById(R.id.editTextUserId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //final EditText editText1 = v.findViewById(R.id.editTextUserId);
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
              //  intent.putExtra("name","uuu");
                 intent.putExtra("name",editText1.getText().toString());

                startActivity(intent);
            }
        });

    }
    @Override
    //指定activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==0 && resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }

    }
}
