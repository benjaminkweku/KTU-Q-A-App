package my.benjamin.com.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notes extends AppCompatActivity {
    private Button hard;
    private Button program;
    private Button intro_cs;
    private Button prob;
    private Button com_math;
    private Button com_skills;
    private Button info_tech;
    private Button networking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        hard=(Button)findViewById(R.id.hardware);
        program=(Button)findViewById(R.id.programming);
        com_math=(Button)findViewById(R.id.com_math);
        prob=(Button)findViewById(R.id.probability);
        com_skills=(Button)findViewById(R.id.com_skills);
        info_tech=(Button)findViewById(R.id.info_tech);
        intro_cs=(Button)findViewById(R.id.intro_cs);
        networking=(Button)findViewById(R.id.intro_networking);

        //hardware section
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(notes.this,hardware.class);
                startActivity(intent);
            }
        });

        //programming section
        program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(notes.this,programming.class);
                startActivity(intent);
            }
        });

        //Intro to computer science and it section
        intro_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(notes.this,intro_cs.class);
                startActivity(intent);
            }
        });


        //probability section
        prob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(notes.this,probability.class);
                startActivity(intent);
            }
        });


        //computer maths section
        com_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(notes.this,computer_maths.class);
                startActivity(intent);
            }
        });


        //communication skills section
        com_skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(notes.this,com_skills.class);
                startActivity(intent);
            }
        });



        //information technology
        info_tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(notes.this,info_tech.class);
                startActivity(intent);
            }
        });


        //introduction to networking section
        networking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(notes.this,networking.class);
                startActivity(intent);
            }
        });








    }
}
