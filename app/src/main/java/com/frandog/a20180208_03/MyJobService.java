package com.frandog.a20180208_03;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

public class MyJobService extends JobService {
    public MyJobService() {
    }

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.d("JOB", "This is onStartJob");
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

}
