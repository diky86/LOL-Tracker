package lwh.loltrolltracker;

import com.google.gson.Gson;

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

/**
 * Created by leewoonho on 2016. 8. 23..
 */
public class OpenLOLAPIClient {
    final String appKey = "953974d9-cbc9-418f-8d9c-2b208af385e1";
    final String summonerUrl = "https://kr.api.pvp.net/api/lol/kr/v1.4/summoner/by-name/";
    String urlString;
    SummonerResponse sRes;

    public SummonerResponse getLOLInfo(String id) {
        urlString = summonerUrl + id + "?api_key=" + appKey;
        try {
            URL url = new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            JSONObject json = new JSONObject(getStringFromInputStream(in));

            //parse JSON
            sRes = parsJSON(json);

            //parse GSON
            sRes = parseGSON(json);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return sRes;
    }

    private static String getStringFromInputStream(InputStream is) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line=br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        }
    }

    private SummonerResponse parsJSON(JSONObject json) throws JSONException {
        SummonerResponse sRes = new SummonerResponse();
//        sRes.setId(json.getJSONObject("id").getInt("id"));
        sRes.setId(json.getString("id"));
        return sRes;
    }

    public SummonerResponse parseGSON(JSONObject json) {
        Gson gson = new Gson();
//        SummonerResponse sRes = gson.toJson("id");
        return null;
    }

}
