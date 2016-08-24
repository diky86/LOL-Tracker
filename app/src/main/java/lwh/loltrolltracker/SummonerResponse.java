package lwh.loltrolltracker;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Woonho on 16. 8. 10..
 */
public class SummonerResponse {

    long id;
    int profileIconId;
    long summonerLevel;
    long revisionDate;
    String name;

    public long getId() {
        return id;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public void setName(String name) {
        this.name = name;
    }

}
