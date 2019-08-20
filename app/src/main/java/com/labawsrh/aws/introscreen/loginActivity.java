package com.labawsrh.aws.introscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {
    Button LoginBtn;
    EditText userName;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);
        getSupportActionBar().hide();
        LoginBtn=findViewById(R.id.loginBtn);
        userName=findViewById(R.id.login_mail);
        password=findViewById(R.id.login_password);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dashboard=new Intent(getApplicationContext(),Dashboard.class);
                startActivity(dashboard);
            }
        });



    }
}
