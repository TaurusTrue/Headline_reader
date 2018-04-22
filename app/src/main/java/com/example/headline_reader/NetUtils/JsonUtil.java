package com.example.headline_reader.NetUtils;

import com.example.headline_reader.Date.News;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by Taurus on 2018/4/22.
 * Json数据的解析工具
 */

public class JsonUtil {
    public static void getNewsList(String data, List<News> newsList) {
        try{
        JSONArray jsonArray = new JSONArray(data);
            for (int i = 0; i < jsonArray.length(); i++) {
                News news = new News();
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                news.setImageUrl(jsonObject.getString("thumbnail"));
                news.setNewsTitle(jsonObject.getString("title"));
                news.setNewsResouce(jsonObject.getString("source"));
                news.setUpdateTime(jsonObject.getString("updateTime"));
                news.setNewsType(jsonObject.getString("type"));
                JSONObject jsonObject1 = jsonObject.getJSONObject("link");
                news.setNewsContentType(jsonObject1.getString("type"));
                news.setNewsContent(jsonObject1.getString("url"));
                newsList.add(news);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getString(String data, String name) {
        try {
            return (new JSONObject(data)).getString(name);
        } catch (Exception e) {
            e.printStackTrace();
        }return null;
    }

    public static int getInt(String data, String name) {
        try {
            return (new JSONObject(data)).getInt(name);
        } catch (Exception e) {
            e.printStackTrace();
        }return 0;
    }
}
