package com.gigatech.ekyc;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ProvideAdditionalInformation extends AppCompatActivity {
    Spinner income,occupation;
    TextInputEditText salary,phonenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_information);

        income=findViewById(R.id.income_spinner);
        occupation=findViewById(R.id.occupation_spinner2);
        salary=findViewById(R.id.income_edt);
        phonenumber=findViewById(R.id.phone_edt);
        //aMAR CODE
        String incomesource[]={"Salary","Bonus","Pension","Etc"};
        String occupationstring[]={"Service Holder","Student","Etc"};
        ArrayAdapter<String> income_adapter=new ArrayAdapter<>(this,R.layout.spinner_text_item,incomesource);
        ArrayAdapter<String> occupation_adapter=new ArrayAdapter<>(this,R.layout.spinner_text_item,occupationstring);
        income.setAdapter(income_adapter);
        occupation.setAdapter(occupation_adapter);

    }

    public void takephoto_btn(View view) {

        startActivity(new Intent(getApplicationContext(),CaptureCustomerPhotoActivity.class));

    }
}
