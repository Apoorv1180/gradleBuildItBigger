package com.udacity.gradle.builditbigger;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Apoorv Dubey on 7/9/2019.
 */
public class EndpointAsyncTaskTest {
    @Test
    public void doInBackground() throws Exception {
        com.udacity.gradle.builditbigger.MainActivityFragment fragment = new com.udacity.gradle.builditbigger.MainActivityFragment();
        fragment.testFlag = true;
        new EndpointAsyncTask().execute(fragment);
        Thread.sleep(5000);
        assertTrue("Error: Fetched Joke = " + fragment.loadedJoke, fragment.loadedJoke != null);

    }

}