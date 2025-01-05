package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class activityexplore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityexplore); // Pastikan layout ini sesuai

        // Inisialisasi BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomnav);
        bottomNavigationView.setSelectedItemId(R.id.navexplore); // Set explore sebagai item yang terpilih

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.navhome) {
                startActivity(new Intent(getApplicationContext(), Home.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (id == R.id.navexplore) {
                return true; // Sudah di explore activity
            } else if (id == R.id.navbag) {
                startActivity(new Intent(getApplicationContext(), cart.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (id == R.id.navprofile) {
                startActivity(new Intent(getApplicationContext(), profile.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            }
            return false;
        });

        // Inisialisasi ImageView dan set OnClickListener
        ImageView productImage2 = findViewById(R.id.productImage2);

        // Menambahkan onClickListener pada ImageView
        productImage2.setOnClickListener(view -> {
            // Beralih ke Activity product1 saat gambar diklik
            Intent intent = new Intent(activityexplore.this, product1.class);
            startActivity(intent);
        });
    }
}
