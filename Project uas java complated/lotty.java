package com.example.myapplication3;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class lotty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lotty);

        // Menangani padding untuk sistem bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inisialisasi LottieAnimationView
        LottieAnimationView animationView = findViewById(R.id.animationView);

        // Menambahkan interaksi untuk animasi ketika selesai
        animationView.setOnClickListener(view -> {
            // Anda bisa menambahkan logika lain di sini
            Toast.makeText(this, "Animation clicked!", Toast.LENGTH_SHORT).show();
        });

        // Mengatur animasi untuk otomatis dimulai dan loop
        animationView.setAnimation(R.raw.payment); // Menyatakan file animasi dari raw folder
         // Agar loop terus berulang
        animationView.playAnimation(); // Memulai animasi

        // Jika Anda ingin animasi berhenti setelah satu kali putaran:
        // animationView.setRepeatCount(0); // Hanya satu kali putaran
    }
}
