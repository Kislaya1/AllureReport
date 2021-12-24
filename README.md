# <span style="font-family: Calibri; font-size: 2.8em;"> Automation Reporting </span>
## <span style="font-family: Calibri; font-size: 2.8em;"> Introduction </span>

Hi All, I had created this demo-project which will in-cooperate **Allure Reporting.**
Anyone can use this demo-project as it will be helpful for a quick-start.

**NOTE: There are no designing principles that I had incorporated in my project to keep it simple.**

## <span style="font-family: Calibri; font-size: 2.8em;"> Project Overview </span>

Below are the key points in my project : - <br><br>
**a) Allure Reporting :** <br>
Allure Framework is a flexible lightweight multi-language test report tool that not only shows a very concise representation of what have been tested in a neat web report form, but allows everyone participating in the development process to extract maximum of useful information from everyday execution of tests.<br><br>
**b) Allure Integration with Rest Assured :** <br>
I had integrated rest assured with Allure inside (Rest Assured Test Class).<br><br>
**c) Docker Integration :** <br>
I had created docker-compose yml file to quick start Allure without any overhead to install the softwares.<br><br>

## <span style="font-family: Calibri; font-size: 2.8em;"> Technology Stack Used </span>

**1. Java** <br>
**2. Docker** <br>

## <span style="font-family: Calibri; font-size: 2.8em;"> Pre-Requisite </span>

**1. Docker Installed in your local.** <br>
**2. Maven Installed in your local.**<br>
**3. Any of your favorite IDE.** <br>

## <span style="font-family: Calibri; font-size: 2.8em;"> Execution </span>

**1. Clone the repository and checkout to main branch.** <br>
**2. Run the below Docker Commands. (Run the docker commands while being inside the project)** <br>

## <span style="font-family: Calibri; font-size: 2.8em;"> Docker Commands </span>

    1. docker-compose up -d allure allure-ui : Since you are using the project 1st time, run this command to install all dependencies.
    2. docker-compose down : Stopping all the running containers which are getting executed in above 1st step.

**3. Run the maven command : "mvn clean install" to run the project.** <br>
**4. Check the report at "allure-results" and "allure-reports" folders.**<br>
In order to access the Report generated launch [Local-ReportLink](http://localhost:5050/allure-docker-service/latest-report)

## <span style="font-family: Calibri; font-size: 2.8em;"> Drawbacks while using Allure Reporting </span>
Even if allure is open-source and also had created community for support (which is not in case of Extent Reports) the cons of using Allure Reporting is that it does not support in-build logging mechanism like in Extent Report and also the UI has only basic standard theme which is not appealing for end users.
