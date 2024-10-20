package org.example.object;

public class Job {
    private String name;
    private String processTime;

    public Job() {
    }

    public Job(String name, String processTime) {
        this.name = name;
        this.processTime = processTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }
}
