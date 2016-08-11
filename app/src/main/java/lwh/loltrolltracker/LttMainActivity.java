package lwh.loltrolltracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LttMainActivity extends AppCompatActivity {
    Button serachButton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serachButton = (Button)findViewById(R.id.search_button);
        editText = (EditText)findViewById(R.id.editText);



        final String appKey = "953974d9-cbc9-418f-8d9c-2b208af385e1";
        final String summonerUrl = "https://kr.api.pvp.net/api/lol/kr/v1.4/summoner/by-name/";
//        final String urlString = summonerUrl + editText.getText().toString() + "?api_key=" + appKey;



        serachButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PopupAcitivy.class);
//                intent.putExtra("id", editText.getText().toString());
                String urlString = summonerUrl + editText.getText().toString() + "?api_key=" + appKey;
                intent.putExtra("id", urlString);
                startActivity(intent);
                finish();
            }
        });
    }
}
