package com.example.Project_Nhom23;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.kiemtra.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationView;
    private ViewPager2 view_pape2r;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.bottom_nav);
        view_pape2r =findViewById(R.id.view_pape2r);
        setUpViewPager();

        getSupportActionBar().hide();

        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.action_home:
                        view_pape2r.setCurrentItem(0);
                        Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_wallet:

                        view_pape2r.setCurrentItem(1);
                        Toast.makeText(MainActivity.this,"Wallet",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_chart:

                        view_pape2r.setCurrentItem(2);
                        break;
                    case R.id.action_more:

                        view_pape2r.setCurrentItem(3);
                        break;
                }
                return true;
            }
        });

    }
    private void setUpViewPager(){
        viewPager = new ViewPager(this);
        view_pape2r.setAdapter(viewPager);
        view_pape2r.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position){
                    case 0:
                        navigationView.getMenu().findItem(R.id.action_home).setChecked(true);
                        break;
                    case 1:
                        navigationView.getMenu().findItem(R.id.action_wallet).setChecked(true);
                        break;
                    case 2:
                        navigationView.getMenu().findItem(R.id.action_chart).setChecked(true);
                        break;
                    case 3:
                        navigationView.getMenu().findItem(R.id.action_more).setChecked(true);
                        break;
                }
            }
        });
        }

}

