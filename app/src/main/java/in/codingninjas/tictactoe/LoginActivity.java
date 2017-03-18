package in.codingninjas.tictactoe;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;


public class LoginActivity extends AppCompatActivity implements OnClickListener {

    private Button email_sign_in_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        Cast xml views into java
        setBasicViews();
    }


    private void setBasicViews() {
//        Cast xml views into java
        email_sign_in_button = (Button) findViewById(R.id.email_sign_in_button);
        email_sign_in_button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.email_sign_in_button){
            startActivity(new Intent(this, MainActivity.class));
        }

    }


}
