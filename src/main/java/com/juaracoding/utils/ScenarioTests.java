package com.juaracoding.utils;

public enum ScenarioTests {

    T1("Successful login with valid credentials"),
    T2("Failed login with invalid email"),
    T3("Failed login with invalid email not input"),
    T4("Failed login with invalid password"),
    T5("Failed login without input password"),
    T6("Failed login witout input email"),
    T7("Failed login without email and password"),
    T8("Successful Logout");

    // T1 ... T100

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }

}