package lwh.loltrolltracker;

import android.os.AsyncTask;

/**
 * Created by leewoonho on 2016. 8. 22..
 */
public class OpenLOLAPITask extends AsyncTask <String, Void, SummonerResponse>{
    @Override
    protected SummonerResponse doInBackground(String... params) {
        OpenLOLAPIClient client = new OpenLOLAPIClient();

        String id = String.valueOf(params[0]);

        SummonerResponse sRes = client.getLOLInfo(id);
        return sRes;
    }
}
