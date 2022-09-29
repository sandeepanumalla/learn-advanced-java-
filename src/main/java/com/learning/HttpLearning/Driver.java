package com.learning.HttpLearning;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
//import java.net.URLConnection;
public class Driver {
    public static void main(String[] args) throws IOException {
        String line = "";

        try {
//            URL url = new URL("https://api.tiingo.com/tiingo/daily/AAPL/prices?startDate=2019-01-02&endDate=2019-12-12&token=8811aec9a23da3684bba9da69372d667c5baae5c");
            URL url = new URL("https://api.tiingo.com/tiingo/daily/AAPL/prices?startDate=2019-01-02&endDate=2019-12-12&token=8811aec9a23da3684bba9da69372d667c5baae5c");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
//            con.setConnectTimeout(5000);
//            con.setReadTimeout(5000);
            int status = con.getResponseCode();
            System.out.println(status);
            StringBuffer response = new StringBuffer("");
            if(status > 299){
                BufferedReader reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                while((line = reader.readLine()) != null){
                    response.append(line);
                }
            }
            else{
                BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while(
                        (line = reader.readLine())
                                != null){
                    response.append(line);
                }
            }
            System.out.println(response);
            parseAndSaveResponse(response.toString());
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        }


    }
    public static void parseAndSaveResponse(String response) throws IOException{
        try {
            JSONArray jsonArray = new JSONArray(response);
            StocksPOJO[] stocks = new StocksPOJO[10];
            for(int i = 0; i < 10; i++){
                JSONObject object = jsonArray.getJSONObject(i);
                String date = object.getString("date");
                double close = object.getDouble("close");
                double open = object.getDouble("open");
                double volume = object.getDouble("volume");
                double adjVolume = object.getDouble("adjVolume");
                StocksPOJO stocksPOJO = new StocksPOJO(date, open, close, volume, adjVolume);
                stocks[i] = stocksPOJO;
            }
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("Target/emp.json"), stocks);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
