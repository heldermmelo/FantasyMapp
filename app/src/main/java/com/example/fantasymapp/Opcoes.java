package com.example.fantasymapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;
import android.widget.ImageView;

public class Opcoes extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        // tabLayout.addTab(tabLayout.newTab().setCustomView(R.layout.layout_test));
        //tabLayout.addTab(tabLayout.newTab().setText("Second Tab"));
        //tabLayout.addTab(tabLayout.newTab().setText("Third Tab"));
        //tabLayout.addTab(tabLayout.newTab().setText("Fourth Tab"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }

        });
    }

    public void generateMapa(View view){
        final ImageView minhaImagemView = (ImageView) findViewById(R.id.imagemResult);
        Bitmap bitmap = Bitmap.createBitmap(minhaImagemView.getMaxWidth(),
                minhaImagemView.getMaxHeight(),
                Bitmap.Config.ARGB_8888);
        bitmap = bitmap.copy(bitmap.getConfig(),true);

        Canvas canvas = new Canvas(bitmap);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        canvas.drawRect(100f, 100f, 1900f, 1500f,paint);
       // canvas.drawVertices();
        minhaImagemView.setImageBitmap(bitmap);
    }
}

