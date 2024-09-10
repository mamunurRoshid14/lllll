package com.example.myidcard;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView facebookLogo = findViewById(R.id.facebookLogo);
        ImageView whatsappLogo = findViewById(R.id.whatsappLogo);
        ImageView phoneCallLogo = findViewById(R.id.phoneCallLogo);
        ImageView githubLogo = findViewById(R.id.githubLogo);
        ImageView linkedinLogo = findViewById(R.id.linkedinLogo);
        ImageView emailLogo = findViewById(R.id.emailLogo);

        facebookLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100055137085901&mibextid=ZbWKwL"));
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    // If the Facebook app is not installed, open the URL in a browser
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100055137085901&mibextid=ZbWKwL"));
                    startActivity(webIntent);
                }
            }
        });


        whatsappLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=+8801765597390"));
                startActivity(intent);
            }
        });

        phoneCallLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01765597390"));
                startActivity(intent);
            }
        });

        githubLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Sumaiya351"));
                startActivity(intent);
            }
        });

        linkedinLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/umma-sumaiya-jahan-4560111b6?trk=blended-typeahead/"));
                startActivity(intent);
            }
        });

        emailLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:sumaiya.stu20197@juniv.edu"));
                startActivity(intent);
            }
        });
    }
}