package com.example.headline_reader.Date;

import com.example.headline_reader.NetUtils.JsonUtil;

/**
 * Created by Taurus on 2018/4/18.
 * 返回的初步Json数据
 */

public class Response {

    private int newsCount;
    private String data;

    public Response(byte[] response) {
        String res = new String(response);
        newsCount = JsonUtil.getInt(res, "count");
        data = JsonUtil.getString(res, "item");
    }

    public int getNewsCount() {
        return newsCount;
    }

    public void setNewsCount(int newsCount) {
        this.newsCount = newsCount;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
