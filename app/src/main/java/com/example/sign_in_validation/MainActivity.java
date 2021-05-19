package com.example.sign_in_validation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.editUsername);
        password = findViewById(R.id.editPassword);
    }
    public void onSignin(View view){
        String u_name = username.getText().toString();
        String u_pwd = password.getText().toString();
        if(u_name.isEmpty() || u_pwd.isEmpty()){
            Toast.makeText(this,"Please enter both fields.",Integer.valueOf(1)).show();
            username.setText("");
            password.setText("");
        }else{
            Toast.makeText(this,"Validation complete.",Integer.valueOf(1)).show();
            username.setText("validation complete");
            Toast.makeText(this,"Validation Complete",Integer.valueOf(1)).show();
        }
    }
}