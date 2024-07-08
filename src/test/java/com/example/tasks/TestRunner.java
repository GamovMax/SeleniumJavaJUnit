package com.example.tasks;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        TestTask2.class,
        TestTask11TestReg.class,
        TestTask12.class,
        TestTask13.class,
        TestTask14.class,
        TestTask16.class,
        TestTask17.class,
        TestTask18.class,
        TestTask19.class,
})
public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestRunner.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}