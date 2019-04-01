package com.lichee.cable.cable;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.lichee.cable.cable.api.Api;
import com.lichee.cable.cable.app.AppConstant;
import com.lichee.cable.cable.entity.MapListResponse;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends Activity {

    private final String TAG = "MainActivity";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Api.getDefault(this, AppConstant.HOST_URL)
                .getMapList()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<MapListResponse>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG,"onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG,"onError:"+e.getMessage());
                    }

                    @Override
                    public void onNext(MapListResponse mapListResponse) {
                        Log.i(TAG, mapListResponse.toString());
                        textView.setText(mapListResponse.toString());
                    }
                });
    }
}
