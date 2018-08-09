package com.example.congh.myasm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.congh.myasm.Fragment.Fragment_About;
import com.example.congh.myasm.Fragment.Chi.Fragment_Chi;
import com.example.congh.myasm.Fragment.Fragment_ThongKe;
import com.example.congh.myasm.Fragment.Thu.Fragment_Thu;

public class MainActivity extends AppCompatActivity  {

    DrawerLayout mdrawerLayout;
    NavigationView mnavigationView;
    android.support.v4.app.FragmentManager mfragmentManager;
    android.support.v4.app.FragmentTransaction mfragmentTransaction;
    android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();

        /*===Dấu 3 gạch dấu mủi tên===*/
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mdrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);
        mDrawerToggle.syncState(); /*hiển thị 3 gạch menu*/
        mdrawerLayout.setDrawerListener(mDrawerToggle); /*dấu mũi tên*/

        /*---------------------------------*/

        /*===Set các manager điều khiển, để có đc fragment ở trong ===*/
        mfragmentManager = getSupportFragmentManager();
        mfragmentTransaction = mfragmentManager.beginTransaction();
        /*1. truyền framelayout, 2. truyền tabfragment, 3. cuối cùng commit*/
        mfragmentTransaction.replace(R.id.containerview, new Fragment_Thu()).commit();
        /*---------------------------------*/

        /*===Gắn fragment cho drawer layout===*/
        mnavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                mdrawerLayout.closeDrawers(); /*Bấm vô item tắt menu*/

                if (item.getItemId() == R.id.nav_thu) {
                    mfragmentTransaction = mfragmentManager.beginTransaction();
                    mfragmentTransaction.replace(R.id.containerview, new Fragment_Thu()).commit();
                }

                if (item.getItemId() == R.id.nav_chi) {
                    mfragmentTransaction = mfragmentManager.beginTransaction();
                    mfragmentTransaction.replace(R.id.containerview, new Fragment_Chi()).commit();
                }
                if (item.getItemId() == R.id.nav_thongke) {
                    mfragmentTransaction = mfragmentManager.beginTransaction();
                    mfragmentTransaction.replace(R.id.containerview, new Fragment_ThongKe() ).commit();
                }
                if (item.getItemId() == R.id.nav_about) {
                    mfragmentTransaction = mfragmentManager.beginTransaction();
                    mfragmentTransaction.replace(R.id.containerview, new Fragment_About()).commit();
                }
                if (item.getItemId() == R.id.nav_exit) {
                    finish();
                    Toast.makeText(MainActivity.this, "Đã thoát app", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
        /*---------------------------------*/
    }

    private void anhxa() {
        mdrawerLayout = findViewById(R.id.drawerlayout);
        mnavigationView = findViewById(R.id.nav_view);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
    }


}
