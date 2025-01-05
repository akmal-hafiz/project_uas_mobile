package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class product1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product1);

        // Menangani padding untuk sistem bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inisialisasi ToggleButton
        ToggleButton toggleSizeM = findViewById(R.id.toggle_size_m);
        ToggleButton toggleSizeL = findViewById(R.id.toggle_size_l);
        ToggleButton toggleSizeXL = findViewById(R.id.toggle_size_xl);

        // Listener untuk ToggleButton Size M
        toggleSizeM.setOnClickListener(view -> {
            if (toggleSizeM.isChecked()) {
                toggleSizeL.setChecked(false);
                toggleSizeXL.setChecked(false);
            }
        });

        // Listener untuk ToggleButton Size L
        toggleSizeL.setOnClickListener(view -> {
            if (toggleSizeL.isChecked()) {
                toggleSizeM.setChecked(false);
                toggleSizeXL.setChecked(false);
            }
        });

        // Listener untuk ToggleButton Size XL
        toggleSizeXL.setOnClickListener(view -> {
            if (toggleSizeXL.isChecked()) {
                toggleSizeM.setChecked(false);
                toggleSizeL.setChecked(false);
            }
        });

        // Inisialisasi tombol "Add to Bag"
        Button addToBagButton = findViewById(R.id.addtobag);

        // Tambahkan onClickListener untuk pindah ke CartActivity
        addToBagButton.setOnClickListener(view -> {
            Intent intent = new Intent(product1.this, cart.class);
            startActivity(intent);
        });

        // Inisialisasi tombol "Buy Now"
        Button buyNowButton = findViewById(R.id.buynow);  // pastikan ID sesuai dengan di XML

        // Set OnClickListener untuk tombol Buy Now
        buyNowButton.setOnClickListener(view -> {
            // Intent untuk pindah ke activity lotty
            Intent intent = new Intent(product1.this, lotty.class);
            startActivity(intent);
        });

        // Inisialisasi BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomnav);
        bottomNavigationView.setSelectedItemId(R.id.navhome); // Menyetel Home sebagai default (opsional)

        // Tambahkan listener navigasi
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.navhome) {
                startActivity(new Intent(getApplicationContext(), Home.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
            } else if (id == R.id.navexplore) {
                startActivity(new Intent(getApplicationContext(), activityexplore.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                return true;
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
    }
}
