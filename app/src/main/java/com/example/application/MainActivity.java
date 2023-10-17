package com.example.application;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;  // Import correct de SearchView
import androidx.viewpager2.widget.ViewPager2;
import com.example.application.ImageAdapter;
import com.example.application.R;

public class MainActivity extends AppCompatActivity {
    private SearchView searchView;
    private ImageView cartButton;  // Assurez-vous d'importer la classe ImageView si ce n'est pas déjà fait
    private int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4}; // Image5 et image6 ajoutées pour corriger la duplication de l'image4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.searchView);
        cartButton = findViewById(R.id.cartButton);  // Assurez-vous d'avoir une vue avec l'ID cartButton dans votre layout

        ViewPager2 viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this, images);
        viewPager.setAdapter(adapter);
    }
}