package com.example.pdffiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOPENER extends AppCompatActivity {
PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
        myPDFViewer=(PDFView) findViewById(R.id.pdfviewer);
        String getItem=getIntent().getStringExtra("pdfFilename");

        if(getItem.equals("1.Assignment")){
            myPDFViewer.fromAsset("Abhishek Gupta_practical_file.pdf").load();

        }if(getItem.equals("2.Bca Magazine")){
            myPDFViewer.fromAsset("bcam.pdf").load();

        }if(getItem.equals("3.Effective communication")){
            myPDFViewer.fromAsset("Effective Communication.pdf").load();

        }if(getItem.equals("4.Interview Skills")){
            myPDFViewer.fromAsset("Interview Skills.pdf").load();

        }if(getItem.equals("5.TechMahindra Report")){
            myPDFViewer.fromAsset("practical file.docx.pdf").load();

        }if(getItem.equals("6.Cyber Crime")){
            myPDFViewer.fromAsset("Unit-1-5 - Cyber Crime.pdf").load();

        }
    }
}