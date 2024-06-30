# OrangeHRM-Automation
### This is a project where [OrangeHrm Website](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login) is automated by performing smoke testing using selenium-webdriver and TestNg as testing framework.
The following key are automated:
- Login to admin
- Login with wrong credentials
- Logout by admin
- Search by the employee id if found
- Logout admin and login to the employee id you created last
- Update the texttFeild for new user
- Logout by user

## Technology :
- Tool: Selenium
- IDE: Intellij
- Build tool: Gradle
- Language: Java
- Testing Framework: TestNG

## Prerequisite :
- Need to install jdk 11, gradle and allure
- Configure Environment variable for jdk 11, gradle and allure
- Clone this project and unzip it
- Open the project folder
- Double click on "build.gradle" and open it through IntellIJ IDEA
- Let the project build successfully
- Click on "Terminal" and run the automation scripts

## Run the Automation Script by the following command: 
    gradle clean test 

- Selenium will open the browser and start automating.
- Gradle Reports 
![gradle](https://github.com/Amit23-10/TestNG-OrangeHRM-Automation/assets/74063361/7fcaa752-5038-4aa6-91a5-62cb37634ff2)

- After automation to view allure report , give the following commands:
  
       allure generate allure-results --clean -o allure-report
       allure serve allure-results
  
   ### Below is my allure overview report:
  

    ![2](https://github.com/Amit23-10/TestNG-OrangeHRM-Automation/assets/74063361/1a41516a-54bd-4aef-b4b0-5798237afaf6)
    ![1](https://github.com/Amit23-10/TestNG-OrangeHRM-Automation/assets/74063361/bc8a9146-3ddb-4e66-b9e5-740844f4aaa3)
