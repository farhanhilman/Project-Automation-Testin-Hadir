package com.juaracoding.utils;

public enum ScenarioTests {

    T1("Successful login with valid credentials");

    // T1 ... T100

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }

}