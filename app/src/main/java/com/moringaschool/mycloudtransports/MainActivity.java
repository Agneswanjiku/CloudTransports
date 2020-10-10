package com.moringaschool.mycloudtransports;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText password;
    private Button login;
    private int Counter;
    private TextView Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etName);
        password = (EditText) findViewById(R.id.etpassword);
        login = (Button) findViewById(R.id.btnlogin);
        Info=(TextView)findViewById(R.id.tvInfo);
        login.setOnClickListener(new View.OnClickListener);

        Info.setText("No of attempts remaining:10");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate (Name.getText().toString(), password.getText().toString())

            }
        });


        @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        })
}

//create validate function
private void validate( String UserName,String UserPassword){
    if((UserName.equals("howCreateIt")) && (UserPassword.equals("yes"))){
        Intent intent = new Intent(MainActivity.this, SelectionSeatsActivity.class);
        startActivity(intent);
    }else{
        Counter--;

        Info.setText("No attempts remaining: " + String.valueOf(Counter));
        if (Counter ==0){
            login.setEnabled(false);
        }


    }
}

    }