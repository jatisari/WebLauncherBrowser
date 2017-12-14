package net.agusharyanto.uteeslauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri
                .parse("http://www.mandirisekuritas.co.id"));
        startActivity(intent);
        finish();
    }
}
