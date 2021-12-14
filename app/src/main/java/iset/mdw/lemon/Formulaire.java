package iset.mdw.lemon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;


public class Formulaire extends AppCompatActivity {

        TabLayout tabLayout;
        ViewPager viewPager;
        FloatingActionButton fb,google,twitter;
        float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulaire);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        fb = findViewById(R.id.fab_fb);
        google = findViewById(R.id.fab_google);
        twitter = findViewById(R.id.fab_twitter);

        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("Signup"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

     final LoginAdapter adapter = new LoginAdapter(getSupportFragmentManager(), this,tabLayout.getTabCount());
     viewPager.setAdapter(adapter);

     viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

      fb.setTranslationY(300);
      google.setTranslationY(300);
      twitter.setTranslationY(300);
      tabLayout.setTranslationY(300);

         fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                startActivity(i);

            }
        });


        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://myaccount.google.com/"));
                startActivity(i);

            }
        });


        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"));
                startActivity(i);

            }
        });



      fb.setAlpha(v);
      google.setAlpha(v);
      twitter.setAlpha(v);
      tabLayout.setAlpha(v);


      fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
      google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
      twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
      tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1000).start();


    }
}