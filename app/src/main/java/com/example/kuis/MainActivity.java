package com.example.kuis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    RadioGroup radiogroup;
    //declaration obj dan var

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RadioGroup
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    // Select RadioButton
    public void onRadioButton(View view){

        Boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.radioButton:
                if(checked)
                    tampilDialog();
                break;
            case R.id.radioButton2:
                if(checked)
                    jawabanSalah();
                break;
            case R.id.radioButton3:
                if(checked)
                    jawabanSalah();
                break;
            case R.id.radioButton4:
                if(checked)
                    jawabanSalah();
                break;
        }
    }
    //Display Dialog
    public void tampilDialog(){
        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Hore !!!");
        builder.setMessage("Kamu benar");
        builder.setNegativeButton("Oke", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Toast.makeText(MainActivity.this, "Selamat", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("ULANGI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                radiogroup.clearCheck();
            }
        });

        builder.create().show();
    }
    //menampilkan toast text jawaban salah
    public void jawabanSalah(){
        Toast.makeText(this, "Jawaban kau salah", Toast.LENGTH_SHORT).show();
    }
}
