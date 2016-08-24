package lwh.loltrolltracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PopupAcitivy extends AppCompatActivity {

    String urlString;
    Intent intent;
    SummonerResponse sRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);
        intent = getIntent();
        urlString = intent.getStringExtra("url");
//        sRes = new SummonerResponse();

//        TextView textView = (TextView)findViewById(R.id.textView);
//        textView.setText(urlString);
    }

}
