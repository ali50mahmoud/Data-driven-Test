Sample Project for SignUp phptravels >  (Data Driven Testing with Selenium integrated with TestNG )

(useing excel files in my test automation project for data driven testing.)

This Project has been created based on 3 Assumptions

Assumption 1: https://www.phptravels.net has a Signup Page

Assumption 2:User can enter SignUp Information into SignUp Page

Assumption 3: Once User Enters Information and clicks SignUp,user will be navigated to a Page with header "welcome user name"



Scenarios Covered :-

1- Navigation to Sign up page

2- Verify Invalid Sign up scenarios

3- Verify Valid Sign up scenarios




How to Run : Once Entire Project has been copied to Eclipse,Either run testNG File  in Eclipse

Code Location :  Data-driven-Test/php_reg/src/test/java/php_reg



Steps :-

Step-1: Add Apache POI , Selenium & TestNG Dependencies


Step-2: Create an ExcelUtil Class for Data Driven Testing


Step-3: Set Data Excel File Name in BaseTest Class


Step-4: Setup Test Data in Test Class


Step-5: Create a Test Excel File


Step-6: Modify Test and Page Classes


step-7 :Build the code once again and Run Tests to verify assertion results
  
  
step -8 : perform Cross Browser Testing & automate test cases using  FireFox & Chrome
  



#Project was built & tested on selenium 3.8.1,TestNG 6.14.3,poi 3.17, Chrome 56.0.2924.87 ,& Firefox 47.0.2 . If the programs give an error, please update the driver

