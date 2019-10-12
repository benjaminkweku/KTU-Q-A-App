package my.benjamin.com.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class probability extends AppCompatActivity {
    PDFView probpdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probability);

        probpdf=(PDFView) findViewById(R.id.prob);
        probpdf.fromAsset("prob.pdf")
                .load();
    }
}
