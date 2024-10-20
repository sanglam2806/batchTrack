package org.example.process;

import org.example.object.App;
import org.example.object.AppWrapper;
import org.example.object.Job;
import org.example.object.JobNet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class Scraper {

    private static String JP1_URL = "file:///Users/lamsang/Document/Dev/Java/project/SeleniumTraning/src/main/resources/JP1Demo.html";

    public static String extractExcecutionTime(AppWrapper apps) {
        SafariOptions options = new SafariOptions();

        WebDriver driver = new SafariDriver(options);
        driver.get(JP1_URL);

        StringBuilder report = new StringBuilder("Job  Execution Report! \n");
        for(App app : apps.getApps()) {
            report.append(app.getAppName() + "\n");
            for (JobNet jobNet: app.getJobNets()) {
                report.append(getJobExecutionTime(jobNet.getJobStart(), driver) + "\n");
            }
        }

        return report.toString();
    }

    private static String getJobExecutionTime (Job job, WebDriver driver) {
        WebElement jobExecuteElement = driver.findElement(By.className(job.getName()));
        // Element button click
        // Continue find Job Execution Time
        // if want to get Child element can use
        // 1. WebElement executionTime = parentElement.findElement(By.cssSelector("span.execution-time"));
        // 2.WebElement executionTime = parentElement.findElement(By.xpath(".//span[@class='execution-time']"));

        WebElement parentDivJobElement = jobExecuteElement.findElement(By.xpath("parent::div"));
        return parentDivJobElement.getText();
    }

}
