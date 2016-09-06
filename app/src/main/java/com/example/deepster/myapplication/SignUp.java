package com.example.deepster.myapplication;

/**
 * Created by deepster on 6/9/16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class SignUp extends Activity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        Button mSignUpSave = (Button) findViewById(R.id.user_sign_up_save_button);
        mSignUpSave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent i = new Intent(SignUp.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}
