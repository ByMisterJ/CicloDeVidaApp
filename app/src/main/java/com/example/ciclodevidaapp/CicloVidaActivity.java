package com.example.ciclodevidaapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CicloVidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i("CICLO", "onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CICLO", "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CICLO", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "tostada", Toast.LENGTH_SHORT).show();
        Log.i("CICLO", "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CICLO", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CICLO", "onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CICLO", "onRestart");
    }

}