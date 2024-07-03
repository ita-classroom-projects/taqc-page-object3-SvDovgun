package com.softserve.edu.teachua.pages.challenge;

import com.softserve.edu.teachua.pages.top.TopPart;
import com.softserve.edu.teachua.wraps.browser.DriverUtils;
import com.softserve.edu.teachua.wraps.search.Search;
import com.softserve.edu.teachua.wraps.search.SearchStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeFrame {

    protected Search search;
    //
    private WebElement videoPlayerLink;
    private WebElement videoPlayButton;
    private WebElement youtubeLink;

    public YoutubeFrame() {
        search = SearchStrategy.getSearch();
        initElements();
    }

    private void initElements() {
        videoPlayerLink = search.cssSelector("div.html5-video-player");
        videoPlayButton = search.cssSelector("button[aria-label='Play']");
        youtubeLink = search.cssSelector("a[title='Watch on YouTube']");
    }

    // Page Object

    // videoPlayerLink
    public WebElement getVideoPlayerLink() {
        return videoPlayerLink;
    }

    public void clickVideoPlayerLink() {
        getVideoPlayerLink().click();
    }

    // videoPlayButton
    public WebElement getVideoPlayButton() {
        return videoPlayButton;
    }

    public void clickVideoPlayButton() {
        getVideoPlayButton().sendKeys(Keys.ENTER);
        //getVideoPlayButton().click();
    }

    // youtubeLink
    public WebElement getYoutubeLink() {
        return youtubeLink;
    }

    public String getYoutubeLinkText() {
        return getYoutubeLink().getAttribute(TopPart.TAG_ATTRIBUTE_HREF);
    }

    public void clickYoutubeLink() {
        getYoutubeLink().click();
    }

    // Functional

    // Business Logic

    public YoutubeFrame playVideoContent() {
        clickVideoPlayButton();
        //clickVideoPlayButton();
        return this;
    }

    public ChallengeTeachPage gotoChallengeTeachPage() {
        // Return to ChallengeTeachPage
        DriverUtils.switchToDefaultContent();
        return new ChallengeTeachPage();
    }

}
