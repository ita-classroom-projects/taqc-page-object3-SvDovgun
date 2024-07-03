package com.softserve.edu.teachua.pages.club;

import com.softserve.edu.teachua.pages.top.TopSearchPart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Only one club page. Update next time
public class ClubPageOld extends TopSearchPart {

    private WebElement clubTitleLink;
    private WebElement clubDescriptionLabel;
    private WebElement clubDetailsLink;

    public ClubPageOld() {
        //super(driver);
        initElements();
    }

    private void initElements() {
        // init elements
        clubTitleLink = search.cssSelector("div.ant-card.ant-card-bordered.card div.name");
        clubDescriptionLabel = search.cssSelector("p.description");
        clubDetailsLink = search.cssSelector("a.details-button > a");
    }

    // Page Object

    // clubTitleLink;
    public WebElement getClubTitleLink() {
        return clubTitleLink;
    }

    public String getClubTitleLinkText() {
        return getClubTitleLink().getText();
    }

    public void clickClubTitleLink() {
        getClubTitleLink().click();
    }

    // clubDescriptionLabel;
    public WebElement getClubDescriptionLabel() {
        return clubDescriptionLabel;
    }

    public String getClubDescriptionLabelText() {
        return getClubDescriptionLabel().getText();
    }

    public void clickClubDescriptionLabel() {
        getClubDescriptionLabel().click();
    }

    // clubDetailsLink;
    public WebElement getClubDetailsLink() {
        return clubDetailsLink;
    }

    public String getClubDetailsLinkText() {
        return getClubDetailsLink().getText();
    }

    public void clickClubDetailsLink() {
        getClubDetailsLink().click();
    }

    // Functional

    // Business Logic

    public ClubInfoModal openClubInfoModal() {
        clickClubTitleLink();
        return new ClubInfoModal();
    }

    public ClubDetailsPage gotoClubDetailsPage() {
        clickClubDetailsLink();
        return new ClubDetailsPage();
    }

}
