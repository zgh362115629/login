package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_activity);
        Button button = (Button) findViewById(R.id.btn_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                EditText editText1 = findViewById(R.id.et_user);
                EditText editText2 = findViewById(R.id.et_pw);
                String user = editText1.getText().toString();
                String pw = editText2.getText().toString();
                intent.putExtra("user",user);
                intent.putExtra("pw",pw);
                startActivity(intent);
            }
        });
    }
}