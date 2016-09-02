package lwh.loltrolltracker;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Woonho on 16. 8. 10..
 */
public class SummonerResponse {

    String id;
    int profileIconId;
    int summonerLevel;
    int revisionDate;
    String name;

    public String getId() {
        return id;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public int getRevisionDate() {
        return revisionDate;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public void setRevisionDate(int revisionDate) {
        this.revisionDate = revisionDate;
    }

    public void setName(String name) {
        this.name = name;
    }

}
