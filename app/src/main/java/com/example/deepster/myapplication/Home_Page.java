package com.example.deepster.myapplication;

/**
 * Created by deepster on 6/9/16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

public class Home_Page extends Activity{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        ImageView img1 = (ImageView) findViewById(R.id.image1);
        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent i = new Intent(Home_Page.this, Links.class);
                startActivity(i);
            }
        });

        ImageView img2 = (ImageView) findViewById(R.id.image2);
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent i = new Intent(Home_Page.this, Links.class);
                startActivity(i);
            }
        });

        ImageView img3 = (ImageView) findViewById(R.id.image3);
        img3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent i = new Intent(Home_Page.this, Links.class);
                startActivity(i);
            }
        });
    }
}
