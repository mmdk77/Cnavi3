package com.sds.study.cnavi3;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{
    String TAG;

    ViewPager viewPager;
    CnaviViewPagerAdapter viewPagerAdapter;

    String[] menuTitles={"test1","test2","test3"};
    ListView menuList;


    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getName();
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPagerAdapter = new CnaviViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);

        viewPager.setCurrentItem(0);

        menuList = (ListView) findViewById(R.id.left_drawer);
        menuList.setAdapter(new ArrayAdapter<String>(this,R.layout.draw_item_list,menuTitles));

        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close) {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                //Log.d(TAG, "슬라이드");
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                Log.d(TAG, "오픈");
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                Log.d(TAG, "클로즈");
            }
        };
        drawerLayout.addDrawerListener(drawerToggle);

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);

    }


}
