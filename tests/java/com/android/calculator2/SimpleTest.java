package com.android.calculator2;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by gilzhaiek on 2017-06-20.
 */

@RunWith(AndroidJUnit4.class)
public class SimpleTest {

    //Instantiate and provide access to the Activity under test
    @Rule
    public ActivityTestRule<StartActivity> startActivity =
            new ActivityTestRule<>(StartActivity.class);

    @Test
    public void testThis() {
    }
}
