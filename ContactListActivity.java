package com.example.nkalchos19.aim1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class ContactListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactlist_layout);



    }

    public void onFirst (View view)
    {
        Intent startIntent = new Intent (getApplicationContext(), ContactDetailsActivity.class);
        startActivity(startIntent);
    }

}




