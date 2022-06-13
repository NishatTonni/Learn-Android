package com.tonni.banglaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button facebookButton, googleButton, playAsGuestButton;
    private LinearLayout loginPageLayout, guestLoginPageLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        facebookButton = findViewById(R.id.facebookButtonId);
        googleButton = findViewById(R.id.googleButtonId);
        playAsGuestButton = findViewById(R.id.playAsGuestButtonId);
        loginPageLayout = findViewById(R.id.loginPageLayoutId);
        guestLoginPageLayout = findViewById(R.id.guestLoginPageLayoutId);

        playAsGuestButton.setOnClickListener(this);
        facebookButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.playAsGuestButtonId)
        {
            guestLoginPageLayout.setVisibility(View.VISIBLE);
            loginPageLayout.setVisibility(View.GONE);

        }

        if (view.getId()==R.id.facebookButtonId)
        {
            Intent intent = new Intent(LoginActivity.this,FacebookAuthActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(intent);
        }

    }
}