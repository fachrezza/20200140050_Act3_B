package com.example.a20200140050_act1_b;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    // mendeklarasi variabel dengan tipe data TextView
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //Menghubungkan variabel txEmail dengan componen TextView pada layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variabel txPassword dengan componen TextView pada layout
        txPassword = findViewById(R.id.tvPassword);

        //mendeklarasi variabel bundle yang akan digunakan untuk mengambil pesan yang sudah dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        txEmail.setText(email);

        txPassword.setText(pass);
    }
}
