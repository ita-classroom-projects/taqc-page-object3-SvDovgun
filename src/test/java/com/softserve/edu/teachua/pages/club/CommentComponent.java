package com.softserve.edu.teachua.pages.club;

import com.softserve.edu.teachua.wraps.search.Search;
import com.softserve.edu.teachua.wraps.search.SearchStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommentComponent {

    protected Search search;
    private WebElement clubCard;
    //
    private WebElement authorLabel;
    private WebElement datetimeLabel;
    private WebElement commentLabel;

    public CommentComponent( WebElement clubCard) {
        this.clubCard = clubCard;
        search = SearchStrategy.getSearch();
        initElements();
    }

    private void initElements() {
        // init elements
        authorLabel = search.cssSelector("div.author-content > span.name");
        datetimeLabel = search.cssSelector("div.author-content > span.datetime");
        commentLabel = search.cssSelector("div.ant-comment-content-detail > p");
    }

    // Page Object

    // authorLabel;
    public WebElement getAuthorLabel() {
        return authorLabel;
    }

    public String getAuthorLabelText() {
        return getAuthorLabel().getText();
    }

    // datetimeLabel;
    public WebElement getDatetimeLabel() {
        return datetimeLabel;
    }

    public String getDatetimeLabelText() {
        return getDatetimeLabel().getText();
    }

    // commentLabel
    public WebElement getCommentLabel() {
        return commentLabel;
    }

    public String getCommentLabelText() {
        return getCommentLabel().getText();
    }

    // Functional

    // Business Logic

}
