
## Pre-Requirements

1. Familiarize yourself with the classes from the data, tools, wraps packages
2. Familiarize yourself with the application-test.properties configuration file
3. Run tests from the SomeTest class

## Task 1

1. Implement 4 override methods of getWebElement() in SearchExplicitPresent and SearchExplicitVisible classes.
2. Update the search in the PageObject classes of the pages package. Use Search with Strategy. Mainly you need to update the init() type methods.
3. Remove the WebDriver parameter transfer from the PageObject class constructor. Update the loadApplication method in the TestRunner class.
4. Change the search strategy to Explicit in the application-test.properties file.
5. Run tests from the SomeTest class.

## Task 2

1. Create a Club class that contains complete information about the club. We will use the class to create and check circles.
2. Implement the Builder pattern to create an object of the Club class.
3. Implement the ClubRepository class based on the Singleton pattern.
4. Update the provider methods clubProvider() and commentProvider() from class SomeTest.
5. Update the method parameters checkClubExist(), checkAdvancedSearch(), checkCommentExist() from class SomeTest.
6. Run tests from the SomeTest class.

## Task 3 (additional, optional)

1. Enable parallel execution of tests. Update the junit.jupiter.execution.parallel.enabled setting in the junit-platform.properties file.
2. Execute tests in parallel from the SomeTest class.
3. Update the drivers field in the DriverUtils class. Use ThreadLocal<WebDriver> instead of Map<Long, WebDriver>
4. Implement the DriverUtils class using the Singleton pattern.
3. Execute tests in parallel from the SomeTest class.

## Task 4 (additional, optional)

1. Update the createDropdownComponent() method in the TopPart class. Remove Thread.sleep(2000); use Explicit wait.
2. Update the initElements() method in the GuestDropdown class. Remove Thread.sleep(2000); use Explicit wait.
3. Update the initElements() method in the ClubsContainer class. Remove Thread.sleep(2000); use Explicit wait.
4. Update the acceptComment method in the ClubCommentModal class. Remove Thread.sleep(2000); use Explicit wait.
5. Run tests from the SomeTest class.

> Record a short video (3-5 minutes) demonstrating your code functionality and test execution, then post it on your YouTube channel.
The report should include a link to GitHub and a link to the video.
