# EcommerceMasterAutomationSuite
A Profetional automation testing project built using selenium
WebDriver and TestNG to validate ent-to-end functionalities
of the **Magento eCommerce demo site**.
>URL Tested :
[htttps://magento.softwaretestingboard.com](https://magento.softwaretestingboard.com)
## Table of Contents 
- [Project OVerview](#project-overview)
- [Tech Stack Used](#tech-stack-used)
- [Project Structure](#project-structure)
- [Features Covered](#features-covered)
- [How to Run](#how-to-run)
- [Report](#Reports)
- [Screenshot](#screenshots)
- [Author](#author)
## Project Overview 
This project automates various user workflows of an eCommerce
website such as login, product search, add to cart, checkout, and logout 
functionalites. It follows the Page Object Model (POM) desing pattern 
and intergrates reporting through ExtendReports.
## Tech Stack Used 
- **Programming Language:** Java
- **Automation Framework:** Selenium WebDriver
- **Test Framework:**ExtentReports
- **Desing Patter:**Page Object Model (POM)
- **IDE Used:**Eclipse
## Project Structure 
EcommerceMasterAutomationSuite/ │ ├── src/ 
│   ├── main/java/ │   │   └── pages/              
# Page classes (LoginPage, HomePage, etc.)
│   └── test/java/ │       └── tests/             
# Test classes │ ├── test-output/                 
# TestNG output reports ├── target/                     
# Maven build output ├── pom.xml                     
# Maven configuration file ├── README.md                   
# Project overview and instructions └── ExtentReports/            
# (Optional) Extent report HTML files
## How to Run
1. Clone this repository 'git clone https://github.com/anjuman786/EcommerceMasterAutomationSuite.git'
2. Navigate to the project directory 'cd EcommerceMasterAutomationSuite'
3. Run tests using Maven 'mvn clean test'
## Reports
-After test execution, reports are available in the '/ExtenReports/'folder.
