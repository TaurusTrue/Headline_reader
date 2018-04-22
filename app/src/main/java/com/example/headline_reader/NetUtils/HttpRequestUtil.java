package com.example.headline_reader.NetUtils;

import android.os.Handler;

import com.example.headline_reader.Date.Response;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Taurus on 2018/4/18.
 * 网络请求工具类
 */

public class HttpRequestUtil {
    public static String param = "http://api.irecommend.ifeng.com/irecommendList.php?userId=866048024885909&count=6&gv=5.2.6&av=5.2.6&uid=866048024885909&deviceid=866048024885909&proid=ifengnews&os=android_23&df=androidphone&vt=5&screen=720x1280&publishid=2024&nw=wifi";
    public static void sendHttpRequest(final String address,final HttpCallbackListener listener) {
        final Handler handler = new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpURLConnection connection = null;
                try {
                    URL url = new URL(address);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(8000);
                    connection.setReadTimeout(8000);
                    connection.setDoInput(true);
                    if (listener != null) {
                        final byte[] temp = read(connection.getInputStream());
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                listener.onFinish(new Response(temp));
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (listener != null) {
                        //回调onError方法
                        listener.onError(e);
                    }
                } finally {
                    if (connection != null) {
                        connection.disconnect();
                    }
                }
            }
        }).start();
    }

    public interface HttpCallbackListener {
        void onFinish(Response response);

        void onError(Exception e);
    }

    private static byte[] read(InputStream is) throws IOException {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] temp = new byte[1024];
        int len;
        while ((len = is.read(temp)) != -1)
            outputStream.write(temp, 0, len);
        is.close();
        return outputStream.toByteArray();
    }
}
