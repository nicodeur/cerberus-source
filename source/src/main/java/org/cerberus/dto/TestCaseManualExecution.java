package org.cerberus.dto;

/**
 * {Insert class description here}
 *
 * @author Tiago Bernardes
 * @version 1.0, 22/11/2013
 * @since 0.9.1
 */
public class TestCaseManualExecution {
    private String test;
    private String testCase;
    private String valueExpected;
    private String howTo;
    private String application;
    private String appType;
    private String url;
    private String system;
    private String build;
    private String revision;
    private String lastStatus;
    private long lastStatusDate;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTestCase() {
        return testCase;
    }

    public void setTestCase(String testCase) {
        this.testCase = testCase;
    }

    public String getValueExpected() {
        return valueExpected;
    }

    public void setValueExpected(String valueExpected) {
        this.valueExpected = valueExpected;
    }

    public String getHowTo() {
        return howTo;
    }

    public void setHowTo(String howTo) {
        this.howTo = howTo;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    public long getLastStatusDate() {
        return lastStatusDate;
    }

    public void setLastStatusDate(long lastStatusDate) {
        this.lastStatusDate = lastStatusDate;
    }
}