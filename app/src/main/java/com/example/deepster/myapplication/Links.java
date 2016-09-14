package com.example.deepster.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by deepster on 6/9/16.
 */
public class Links extends Activity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.links);

        TextView gText = (TextView) findViewById(R.id.infoTxtGoogle);
        gText.setMovementMethod(LinkMovementMethod.getInstance());

        TextView yText = (TextView) findViewById(R.id.infoTxtYahoo);
        yText.setMovementMethod(LinkMovementMethod.getInstance());

        TextView gmText = (TextView) findViewById(R.id.infoTxtGmail);
        gmText.setMovementMethod(LinkMovementMethod.getInstance());

        TextView wikiText = (TextView) findViewById(R.id.infoTxtWiki);
        wikiText.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
