package com.cwsolutions.mytestapplication05;

import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.MainThread;

/**
 * Created by Christoffer on 9/15/2015.
 */
public class AsyncInterface extends AsyncTask<String, Integer, String> {

    MainActivity mContext;

    public AsyncInterface(MainActivity context)
    {
        mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mContext.txtInformation.setText("Processing has begun....");
    }

    @Override
    protected String doInBackground(String... params) {
       String message =params[0];

        // Dummy code
        for (int i = 0; i <= 50; i += 5) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publishProgress(i);
        }
        return message;
    }


    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        mContext.txtInformation.setText(values[0] + "");
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        mContext.txtInformation.setText(s);
    }

}
