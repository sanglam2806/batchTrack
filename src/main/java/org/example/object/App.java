package org.example.object;

import java.util.List;

public class App {
    private String appName;
    private List<JobNet> jobNets;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public List<JobNet> getJobNets() {
        return jobNets;
    }

    public void setJobNets(List<JobNet> jobNets) {
        this.jobNets = jobNets;
    }
}
