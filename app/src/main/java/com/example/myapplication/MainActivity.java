package com.example.myapplication;

import static com.example.myapplication.R.drawable.banana;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ActivityHalaman1;
import com.example.myapplication.ActivityHalaman2;
import com.example.myapplication.ActivityHalaman3;
import com.example.myapplication.ActivityHalaman4;
import com.example.myapplication.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivhalaman1, ivhalaman2, ivhalaman3, ivhalaman4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivhalaman1 = findViewById(R.id.iv_halaman1);
        ivhalaman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, ActivityHalaman1.class);
                startActivity(intent);
            }
        });

            ivhalaman2 = findViewById(R.id.iv_halaman2);
            ivhalaman2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent( MainActivity.this, ActivityHalaman2.class);
                    startActivity(intent);
                }
            });
        ivhalaman3 = findViewById(R.id.iv_halaman3);
        ivhalaman3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, ActivityHalaman3.class);
                startActivity(intent);
            }
        });
        ivhalaman4 = findViewById(R.id.iv_halaman4);
        ivhalaman4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, ActivityHalaman4.class);
                startActivity(intent);
            }
        });

    }
}
