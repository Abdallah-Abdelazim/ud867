package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class JokesEndpointAsyncTaskTest {

    @Test
    public void testNonEmptyStringResult() {

        new JokesEndpointAsyncTask(InstrumentationRegistry.getTargetContext(), new JokesEndpointAsyncTask.TaskListener() {
            @Override
            public void onTaskStarting() {}

            @Override
            public void onTaskFinished(String result) {
                Assert.assertTrue(result != null && result.length() > 0);
            }
        }).execute();

    }

}
