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

public class Scraper {

    private static String JP1_URL = "file:///Users/lamsang/Document/Dev/Java/project/SeleniumTraning/src/main/resources/JP1Demo.html";
    public String extractExcecutionTime(AppWrapper apps) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        driver.get(JP1_URL);

        StringBuilder report = new StringBuilder("Job  Execution Report! \n");
        for(App app : apps.getApps()) {
            report.append(app.getAppName() + "\n");
            for (JobNet jobNet: app.getJobNets()) {
                report.append(getJobExecutionTime(jobNet.getJobStart(), driver));
            }
        }

        return report.toString();
    }

    private String getJobExecutionTime (Job job, WebDriver driver) {
        WebElement jobExecuteElement = driver.findElement(By.className(job.getName()));
        WebElement parentDivJobElement = jobExecuteElement.findElement(By.xpath(".."));
        return parentDivJobElement.getTagName();
    }

}
