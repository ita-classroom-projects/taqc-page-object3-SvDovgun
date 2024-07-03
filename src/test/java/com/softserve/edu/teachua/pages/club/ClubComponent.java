package com.softserve.edu.teachua.pages.club;

import com.softserve.edu.teachua.wraps.search.Search;
import com.softserve.edu.teachua.wraps.search.SearchStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ClubComponent {

    //protected WebDriver driver;
    protected Search search;
    private WebElement clubCard;
    //
    private WebElement titleLink;
    private List<WebElement> categoriesLabel;
    private WebElement descriptionLabel;
    private WebElement addressLabel;
    private WebElement detailsButton;

    public ClubComponent(WebElement clubCard) {
//        this.driver = driver;
//        this.clubCard = clubCard;
        this.clubCard = clubCard;
        search = SearchStrategy.getSearch();
        initElements();
    }

    private void initElements() {
        // init elements
        titleLink = search.cssSelector("div.title");
        categoriesLabel = search.cssSelectors("div.tags.club-tags span.name");
        descriptionLabel = search.cssSelector("p.description");
        addressLabel = search.cssSelector("div.address");
        detailsButton = search.cssSelector("a.details-button > a");
    }

    // Page Object

    // titleLink;
    public WebElement getTitleLink() {
        return titleLink;
    }

    public String getTitleLinkText() {
        return getTitleLink().getText();
    }

    public void clickTitleLink() {
        getTitleLink().click();
    }

    // categoriesLabel;
    public List<WebElement> getCategoriesLabel() {
        return categoriesLabel;
    }

    public List<String> getCategoriesLabelText() {
        List<String> categoriesNames = new ArrayList<>();
        for (WebElement current : getCategoriesLabel()) {
            categoriesNames.add(current.getText());
        }
        return categoriesNames;
    }

    // descriptionLabel;
    public WebElement getDescriptionLabel() {
        return descriptionLabel;
    }

    public String getDescriptionLabelText() {
        return getDescriptionLabel().getText();
    }

    // addressLabel
    public WebElement getAddressLabel() {
        return addressLabel;
    }

    public String getAddressLabelText() {
        return getAddressLabel().getText();
    }

    // detailsButton;
    public WebElement getDetailsButton() {
        return detailsButton;
    }

    public String getDetailsButtonText() {
        return getDetailsButton().getText();
    }

    public void clickDetailsButton() {
        getDetailsButton().click();
    }

    // Functional

    // Business Logic

    public ClubInfoModal openClubInfoModal() {
        clickTitleLink();
        return new ClubInfoModal();
    }

    public ClubDetailsPage openClubDetailsPage() {
        clickDetailsButton();
        return new ClubDetailsPage();
    }

}
