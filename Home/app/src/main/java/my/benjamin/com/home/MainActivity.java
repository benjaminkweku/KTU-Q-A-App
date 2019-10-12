package my.benjamin.com.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button help;
    private Button question;
    private Button note;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        help=(Button)findViewById(R.id.help);
        question=(Button)findViewById(R.id.question);
        note=(Button)findViewById(R.id.note);
        about=(Button)findViewById(R.id.about);


        //help section
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helpMethod();
            }
        });


        //question section
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionMethod();
            }
        });



        //note section begins here
        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noteMethod();
            }
        });



        //about section begins here

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutMethod();
            }
        });


    }


    //help section ends here
    public void helpMethod(){
        Intent intent1 =new Intent(MainActivity.this,HELP.class);

        startActivity(intent1);


    }


    //question section ends here
    public void questionMethod(){
        Intent intent2 =new Intent(MainActivity.this,questions.class);

        startActivity(intent2);

    }


    //note section ends here
    public void noteMethod(){
        Intent intent3 =new Intent(MainActivity.this,notes.class);

        startActivity(intent3);

    }


    //about section ends here
    public void aboutMethod(){
        Intent intent4 =new Intent(MainActivity.this,about.class);

        startActivity(intent4);


    }

}
