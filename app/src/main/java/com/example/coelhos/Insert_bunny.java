package com.example.coelhos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Insert_bunny extends AppCompatActivity {

    public List<Bunny> rabbits = new ArrayList<>();
    public String name ,age;
    public TextView fieldAge, fieldName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_bunny);

        TextView fieldName = findViewById(R.id.text_insert_name);
        TextView fieldAge = findViewById(R.id.text_insert_age);

        Intent i = getIntent();
        Bundle b = i.getExtras();

        this.rabbits = (List<Bunny>) b.getSerializable("arrayRabbits");

    }

    public void finishInsert(View view) {
        finish();
    }

    public void addBunnyList(View view) {

        name = fieldName.getText().toString();
        age = fieldAge.getText().toString();

        Bunny bunny = new Bunny();
        bunny.setNome(name);
        bunny.setAge(age);

        rabbits.add(bunny);


//        Intent i = new Intent(this, MainActivity.class);
//        i.putExtra("arrayRabbits",(Serializable) rabbits);
//        startActivity(i);

    }
}