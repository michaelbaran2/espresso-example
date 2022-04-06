package com.example.espressoexample;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void passingTest() {
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.text_view)).check(matches(withText("Hello There")));
    }


    @Test
    public void failingTest() {
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.text_view)).check(matches(withText("WAKA WAKA WAA")));
    }



}