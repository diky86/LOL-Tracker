package lwh.loltrolltracker;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Woonho on 16. 8. 10..
 */
public class SummonerRequest {
    final static String appKey = "953974d9-cbc9-418f-8d9c-2b208af385e1";
    final static String summonerUrl = "https://kr.api.pvp.net/api/lol/kr/v1.4/summoner/by-name/";
    LttMainActivity ltt = new LttMainActivity();
    public String urlString = summonerUrl + ltt.editText.getText().toString() + "?api_key=" + appKey;

    URL url;

    {
        try {
            url = new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
