package com.example.nguyenpro231998.ungdungbansachonline;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Main3Activity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        action = new ActionBarDrawerToggle(Main3Activity.this,drawerLayout,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(action);
        action.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(action.onOptionsItemSelected(item)){
                 return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
