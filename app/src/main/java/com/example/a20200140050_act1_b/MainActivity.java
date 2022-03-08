package com.example.a20200140050_act1_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnlogin dengan componen button pada layout
        btnLogin=findViewById(R.id.btSignIn);

        //Menghuhbungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email ke dalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password ke dalam variabel password
                password = edpassword.getText().toString();

                //mengeset email yang benar
                String email = "fachreza@mail.com";

                //mengeset password yang benar
                String pass = "2002";

                if (nama.isEmpty()&&password.isEmpty()){
                    //jika login berhasil
                    Toast t = Toast.makeText(getApplicationContext(), "Email dan Password wajib diisi",Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                } else {
                    //mengecek apakah isi dari email dan password sudah sama dengan email dan password yang sudah di set
                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(), "Login SUkses", Toast.LENGTH_LONG);

                        // menampilkan toast
                        t.show();

                        //membuat objek bundle
                        Bundle b = new Bundle();

                        //Memasukkan value dari variabel nama dengan kunci "a" dan dimasukkan kedalam bundle
                        b.putString("a", nama.trim());

                        //memasukkan value dari variabel password dengan kunci "b" dan dimasukkan kedalam bundle
                        b.putString("b", password.trim());

                        //membuat objek intent berpindah activity dari mainactivity ke ActivityHasil
                        Intent i = new Intent(getApplicationContext(), ActivityKedua.class);

                        //memasukkan bundle kedalam intent untuk dikirimkan ke ActivityHasil
                        i.putExtras(b);

                        //berpindah ke ActivityHasil
                        startActivity(i);
                    } else {
                        //membuat variabel toast dan membuat toast dan menampilkan pesan "login gagal"

                        Toast t = Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_LONG);
                        // menampilkan toast
                        t.show();
                    }
                }
            }
        });
    }
}