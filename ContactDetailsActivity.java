package com.example.nkalchos19.aim1;

import android.database.MatrixCursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class ContactDetailsActivity extends AppCompatActivity {
    String[]columnNames = {"_contactid", "First Name", "Last Name", "Phone #", "Email", "Contact Type"};
    MatrixCursor cursor = new MatrixCursor(columnNames);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.contactView);

        ArrayList<Contact> ContactList = new ArrayList<>();


        ContactList.add(new Contact(1, "Bob", "S.", "555-999-8888", "bobs@gmail.com", "Friend"));
        ContactList.add(new Contact(2, "Roy", "B.", "555-789-1108", "royb@gmail.com", "Friend"));
        ContactList.add(new Contact(3, "Ellen", "B.", "555-569-1241", "ellenbn@gmail.com", "Business"));


        /**
         * TODO - add cursor adapter
         */

        for (Contact item : ContactList) {
            String[] data = {String.valueOf(item.getContactID()), item.getFirstName(), item.getLastName(),
                    item.getPhone(), item.getEmail(), item.getContactType()};
            cursor.addRow(data);
        }
    }


    /**
     * TODO - update?
     */

    public void onFirst (View view)
    {
        cursor.moveToFirst();
    }

    public void onLast (View view)
    {
        cursor.moveToLast();
    }

    public void onNext (View view)
    {
        cursor.moveToNext();
    }


    public void onPrev (View view)
    {
        cursor.moveToPrevious();
    }
}

