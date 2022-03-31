# Selenium - Rest Integrated Framework
This framework is able to run Back end (API) & front end (Selenium Web) parallely and individually. It has Page object model with page factory for locators and TestNG-maven based architecture.

# How to use this framework 
-Clone the git hub link to your IntelliJ/Eclipse

-Perform mvn clean install Or Right click on the project root folder -> Maven -> Reload projects

Right click on suite xml, 'Selenium.xml' for parallel run of Web & API tests.
Right click on suite xml, 'Rest.xml' for API tests alone.
 Or
Run from IntelliJ runner after configuring the runner as 'TestNG', Test kind as 'Suite' and locate the suite xml as 'Selenium.xml

# Extent Reporting

Extent reports can be found at, /Users/**/**/Makaia/reports (Mac)

It generates screenshot for web tests and test description for api tests. 

HTML report can be found at /reports/result.html

