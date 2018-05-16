package com.example.stefannytoro.myapplication;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;


import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by stefanny.toro on 16/05/18.
 */

@RunWith(AndroidJUnit4.class)


public class Prueba {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLogin() throws  Exception{
        onView(withId(R.id.editText)).perform(typeText("stefanny"));
        onView(withId(R.id.editText2)).perform(typeText("yeah"));
        onView(withId(R.id.boton)).perform(click());


    }
}
