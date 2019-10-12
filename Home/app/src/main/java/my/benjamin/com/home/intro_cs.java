package my.benjamin.com.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class intro_cs extends AppCompatActivity {
    PDFView pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_cs);

        pdf=(PDFView)findViewById(R.id.pdf);
        pdf.fromAsset("obgee.pdf")
                .load();



    }
}
