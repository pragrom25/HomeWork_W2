package com.example.homework_w2;


import android.os.Bundle;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(MainActivity.this,"Welcome to My ToDo application!",Toast.LENGTH_SHORT);
        t.show();
    }
}
