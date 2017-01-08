package com.iconasystems.android.trumeter.config;

import android.app.Application;
import android.support.annotation.VisibleForTesting;

import com.iconasystems.android.trumeter.di.component.AppComponent;
import com.iconasystems.android.trumeter.di.component.DaggerAppComponent;
import com.iconasystems.android.trumeter.di.module.ApplicationModule;
import com.raizlabs.android.dbflow.config.FlowLog;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by christoandrew on 11/20/16.
 */

public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        // This instantiates DBFlow
        FlowManager.init(this);
        mAppComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        // add for verbose logging
        FlowLog.setMinimumLoggingLevel(FlowLog.Level.V);

    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    @VisibleForTesting
    public void setAppComponent(AppComponent appComponent) {
        mAppComponent = appComponent;
    }
}
