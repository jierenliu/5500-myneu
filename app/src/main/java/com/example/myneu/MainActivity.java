package com.example.myneu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.myneu.Fragments.PostFragment;
import com.example.myneu.Fragments.SearchFragment;
import com.example.myneu.Fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

/** references:
 [1] Instagram-UI-Android: https://github.com/usman18/Instagram-UI-Android
 [2] Android-N-developer-Course:https://github.com/Ashleshk/Android-N-developer-Course
 [3] Instagram-Prototype: https://github.com/shubhamsawantsjsu/Instagram-Prototype
 [4] Socialise: https://github.com/PrashantAmoli/Socialise **/

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, new PostFragment()).commit();

        bottomNavigationView.setSelectedItemId(R.id.homeFragment);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.homeFragment:
                        fragment = new PostFragment();
                        break;
                    case R.id.profileFragment:
                        fragment = new ProfileFragment();
                        break;
                    case R.id.searchFragment:
                        fragment = new SearchFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
                return true;
            }
        });
    }
}