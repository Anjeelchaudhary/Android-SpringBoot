package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void sendNow(View view) {
        Toast.makeText(this, "seding message",Toast.LENGTH_SHORT).show();
    }

    public void receivedMessage(View view) {
        Toast.makeText(this,"recevied message",Toast.LENGTH_SHORT).show();
    }

    public void deleteMessage(View view) {
        Toast.makeText(this,"deleting message",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}