package com.example.vibhor.intentforresult;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {


    EditText  editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextMessage=(EditText)findViewById(R.id.editTextMessage);
    }

    public void submitMessage(View V)
    {
        // get the Entered  message
        String message=editTextMessage.getText().toString();
        Intent intentMessage=new Intent();

        // put the message in Intent
        intentMessage.putExtra("MESSAGE",message);
        // Set The Result in Intent
        setResult(2,intentMessage);
        // finish The activity
        finish();
    }
}
