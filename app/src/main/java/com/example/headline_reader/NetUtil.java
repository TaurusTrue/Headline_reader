package com.example.headline_reader;

/**
 * Created by 67698 on 2018/4/10.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

//写的一个简单网络请求
public  class NetUtil {
    StringBuilder response;
    public void sendRequestWithHttpURLConnection(final String url1) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpURLConnection connection = null;
                BufferedReader reader;
                try {
                    URL url = new URL(url1);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(6000);
                    connection.setReadTimeout(6000);
                    Scanner ip = new Scanner(connection.getInputStream());
                     response = new StringBuilder();
                    while (ip.hasNextLine()) {
                        response.append(ip.hasNextLine());
                    }

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (connection != null) connection.disconnect();
                }
            }
        }).start();
    }

}


