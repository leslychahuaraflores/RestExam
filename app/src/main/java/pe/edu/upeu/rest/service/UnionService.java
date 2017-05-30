package pe.edu.upeu.rest.service;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upeu.rest.bean.Campaign;
import pe.edu.upeu.rest.rest.RequestMethod;
import pe.edu.upeu.rest.rest.RestClient;

/**
 * Created by Alumnos on 30/05/2017.
 */

public class UnionService {
    public List<Campaign> findCampaign(String url) {
        List<Campaign> list = new ArrayList<Campaign>();
        try {
            RestClient client = new RestClient(url);
            client.execute(RequestMethod.GET);
            if (client.getResponseCode()==200){
                JSONArray arrayObj = new JSONArray(client.getResponse());
                for (int i = 0; i < arrayObj.length(); i++){
                    JSONObject obj = arrayObj.getJSONObject(i);
                    list.add(new Campaign(obj.getInt("id"),obj.getString("NameCampaign")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return list;
    }
}
