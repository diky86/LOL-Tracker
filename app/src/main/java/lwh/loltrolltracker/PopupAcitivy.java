package lwh.loltrolltracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PopupAcitivy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);
        Intent intent = getIntent();
        String urlString = intent.getStringExtra("id");

        try {
            URL url = new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
//            JSONObject json = new JSONObject(getStringFromInputStream(in));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(urlString);
    }

//    private SummonerRequest parseJSON(JSONObject json) throws JSONException {
//        SummonerRequest sreq = new SummonerRequest();
//
//    }

//    private static String getStringFromInputStream(InputStream is) {
//
//    }

}
