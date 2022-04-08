package com.example.activity_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class Hasil_Activity extends AppCompatActivity {

    TextView Nama,NoHp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Nama = findViewById(R.id.tf_nama);
        NoHp = findViewById(R.id.tf_nohp);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama) {
            case "maulana":
                Nama.setText("maulana");
                NoHp.setText("08122223121");
                break;
            case "alfiansyah":
                Nama.setText("alfiansyah");
                NoHp.setText("08122223122");
                break;
            case "alfin":
                Nama.setText("alfin");
                NoHp.setText("08122223123");
                break;


        }
    }
}