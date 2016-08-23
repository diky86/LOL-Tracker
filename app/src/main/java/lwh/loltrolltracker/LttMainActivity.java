package lwh.loltrolltracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class LttMainActivity extends AppCompatActivity {
    Button searchButton;
    EditText editText;
    String id;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchButton = (Button)findViewById(R.id.search_button);
        editText = (EditText)findViewById(R.id.editText);
        tv = (TextView)findViewById(R.id.result_view);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                getLOLId(v);
//                Intent intent = new Intent(getApplicationContext(), PopupAcitivy.class);
//                String urlString = summonerUrl + id + "?api_key=" + appKey;
//                intent.putExtra("url", urlString);
//                startActivity(intent);
                getLOLId();
            }
        });
    }

    public void getLOLId() {
        id = editText.getText().toString();

        OpenLOLAPITask t = new OpenLOLAPITask();

        try {
            SummonerResponse sRes = t.execute(id).get();
            System.out.println("ID = " + sRes.getId());
            tv.setText(sRes.getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


}
