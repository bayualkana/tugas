package com.example.layouting;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    //langkah1 kenalan buat Variabel
    Button btnLinear, btnRelative, btnFrame, btnConstraint, btnScroll;

    //langkah2 bikin setoncreate setelah setcontent, sambungin inisialisasi variabel sesuai dengan id

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnLinear = findViewById(R.id.btn_linear);
        btnRelative = findViewById(R.id.btn_relative);
        btnFrame = findViewById(R.id.btn_frame);
        btnConstraint = findViewById(R.id.btn_constraint);
        btnScroll = findViewById(R.id.btn_scroll);

        //langkah 3 boleh dievent handling

        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         //       Toast.makeText(MenuActivity.this, "ini Linear", Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(pindah);
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //nama komponen apa = new komponen()
                //context = namaActivity
                AlertDialog.Builder pesan = new AlertDialog.Builder(MenuActivity.this);
                pesan.setTitle("Alert Dialog");
                pesan.setMessage("ini alert dialog");
                pesan.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MenuActivity.this, "Anda Memilih Ok", Toast.LENGTH_SHORT).show();
                        Intent pindah = new Intent(MenuActivity.this, RelativeActivity.class);
                        startActivity(pindah);

                    }
                });
                pesan.setNegativeButton("Tidak", null);
                pesan.show();

            }
        });

        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, FrameActivity.class);
                startActivity(pindah);
            }
        });

        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, ConstraintActivity.class);
                startActivity(pindah);
            }
        });

        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, ScroolActivity.class);
                startActivity(pindah);
            }
        });
    }
}
