package com.example.act6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.act6.database.DBController;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class TemanBaru extends AppCompatActivity {
    private TextInputEditText tNama,tTelpon;
    private Button simpanBtn;
    String nm,tlp;
    DBController controller= new DBController(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teman_baru);

        tNama=(TextInputEditText) findViewById(R.id.tietNama);
        tTelpon=(TextInputEditText) findViewById(R.id.tietTelpon);
        simpanBtn=(Button) findViewById(R.id.buttonSave);

        simpanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tNama.getText().toString().equals("")||tTelpon.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Data Belum Komplit!!", Toast.LENGTH_SHORT).show();
                }else{
                    nm = tNama.getText().toString();
                    tlp =tTelpon.getText().toString();

                    HashMap<String,String> vlues = new HashMap<>();

                    vlues.put("nama",nm);
                    vlues.put("telpon",tlp);

                    controller.insertData(vlues);
                    callHome();
                }
            }
        });
    }
    public void callHome(){
        Intent i = new Intent(TemanBaru.this,MainActivity.class);
        startActivity(i);
        finish();
    }
}