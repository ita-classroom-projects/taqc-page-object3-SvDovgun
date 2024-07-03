package com.softserve.edu.teachua.wraps.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchExplicitPresent extends SearchExplicit {

    @Override
    public WebElement getWebElement(By by) {
        // Done
        return getDriverWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    @Override
    public WebElement getWebElement(By by, WebElement fromWebElement) {
        // Done
        return getDriverWait().until(ExpectedConditions.presenceOfNestedElementLocatedBy(fromWebElement, by));
    }

    @Override
    public List<WebElement> getWebElements(By by) {
        // Done
        return getDriverWait().until(
                new ExpectedCondition<List<WebElement>>() {
                     public List<WebElement> apply(WebDriver driver) {
                     List<WebElement> allChildren = driver.findElements(by);
                     return allChildren.isEmpty() ? null : allChildren;
                     }
                }
        );
    }

    @Override
    public List<WebElement> getWebElements(By by, WebElement fromWebElement) {
        // TODO
        return getDriverWait().until(
                new ExpectedCondition<List<WebElement>>() {
                    public List<WebElement> apply(WebDriver driver) {
                        List<WebElement> allChildren = fromWebElement.findElements(by);
                        return allChildren.isEmpty() ? null : allChildren;
                    }
                }
        );
    }

}
