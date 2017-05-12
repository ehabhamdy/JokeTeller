package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
/**
 * Created by ehabhamdy on 5/7/17.
 */

@RunWith(AndroidJUnit4.class)
public class MyTest {
    private Context instrumentationCtx;

    @Before
    public void setup() {
        instrumentationCtx = InstrumentationRegistry.getContext();
    }
    @Test
    public void verifyAsyncTaskResult() throws ExecutionException, InterruptedException {
        String result = new EndpointsAsyncTask().execute(instrumentationCtx).get();
        assertNotEquals(result.trim().length(), 0);
        assertEquals(result, "Hahah, Java");
    }
}