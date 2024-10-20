package org.example.object;

import java.util.Date;

public class JobNet {
    private String name;
    private Job jobStart;
    private Job jobEnd;
    private Date executionTime;

    public JobNet(String name, Job jobStart, Job jobEnd, Date excutionTime) {
        this.name = name;
        this.jobStart = jobStart;
        this.jobEnd = jobEnd;
        this.executionTime = excutionTime;
    }

    public JobNet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJobStart() {
        return jobStart;
    }

    public void setJobStart(Job jobStart) {
        this.jobStart = jobStart;
    }

    public Job getJobEnd() {
        return jobEnd;
    }

    public void setJobEnd(Job jobEnd) {
        this.jobEnd = jobEnd;
    }

    public Date getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
    }
}
