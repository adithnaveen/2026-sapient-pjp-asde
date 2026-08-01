# PJP Sapient 2026 ASDE 

## team members: 
- Aniket Singh - Varanasi UP, BE IIT jodput, Intersted in competative programming and web development. Desigining and corrective system for models adversarial noise from images 
-  sai bharath - IIT patna, competative programming and cricket, project similar to uber + bring EV flavour to know the challenges for ex: charge etc + top 3 riders 
-  Ansh Mehtha - suraj gujrath, IIT jodpur, type to create different traffic scenarios for gen models, we can avoid accidents 
-  bhargavi - from hyd, IIT jodpur, in csc, detects 21 hand signals from video and take action accordingly, can be used for autonomous driving and traffic management
-  Meet - IIT jammu, theoretical on cryptography, can be used for secure communication and data privacy 
-  naga chaitanya - IIT dhanbad, in CS branch, condition of the CPU, battery, temparature and other parameters to predict the health of the system and take action accordingly, can be used for predictive maintenance and system optimization, and align the model for better performance
-  tejaswini - IIT indore, proactive intelligent trafic management system, majorly for timely traffice management and prediction timing,  CS branch 
-  vineet verma- IIT indore CS, traffic detection and mock the data for training the model, speed limit and diversion etc 
-  vineet raghavendra - IIT tirupati, CS Branch, GPU based scheduling system, like in what is your ETA etc in maps 


## what does it take to build good software 
    - technical skills 
      - write which are latest releases 
      - we shall not deal with values < 1000 we shall have more than few million records 
    - requirements gathering
    - security 
    - clear understanding of the problem statement
    - testing of the application 
    - algorithm usage 
    - UI / UX 
      - wcag 2.x capabilities - A, AA, AAA standards 
    - development practices 

## Prerequisites
- java 21  
- Intellij idea 
- Maven 
- git bash 
- 1 account with github 


## SDLC 
    - Waterfall 
      - Requirements 
        - know all the requirement and not change it 
        - any changes is costly 
        - can i build software today ? 
        - you have to have the requirement for entire project 
      - Design
      - Implementation
      - Testing
      - maintenance
    - Agile
      - requirements 
        - can i build software today ? 
        - you can have the requirements for 1 week or max 2 weeks 
        - MUSCOW Principle - must have, should have, could have, won't have


## Product Vs project   
    - amazon is a product - which solves customer problem which is a ongoing problem - amazon has a project which shall improve some features of the product, temp initiatives 
    - products are always customer centric - product is specific objective which you are solving, it may be temp and can be deleted 
  
## if we want to build smart calculator 
    - what problems should it solve 
      - arithmetic operations (FR)
      - simple display (FR)
      - should have opportunity to enter values (numbers) + special characters like + - * / (FR)
      - history of calculations (FR)
      - Light weight and fast (NFR)
      - results to be given with in 300 ms (NFR)
      - 
    - what are the features it should have
    - 


# day2 

## working with git commands 

### Configuration 
  - git config --global  user.name "meet borisagar"
  - git config --global user.email "your email id registered with github"
  - git config --global --edit 
  - git config --list 
- System - for the system 
- Global - for user 
- Local - for the folder 


### few comamnds to be explores 
  - git reset 
  - git revert
  - git rebase
  - git stash
  - git log 
  - git log --graph  --oneline 
  - git remote -v

## day 3 
  - we may have to have connectors for db, external tools like spring, kafka, aws system, logging frameworks 
    - programming language was created 
      - kotlin 
      - groovy 
      - ruby 
      - R 
      - scala 

## Day 4

  -  Product Engineering mindset: the 'why' before the 'how'
     -   2 + 2 =


``     -   i want to develop a calculator application 
          - Why  we need to develop the application 
          - what problem does it solve 
          - who will use this application 
          - 

``

```
  - help me develop a mobile application for employee attendance + leaves tracking 
      - why we need a application 
      - why - should be able to track attendance 
      - why -  to know whether the employee is present or not
      - why - so that the sessions can be conducted 
      - why - to prepare them for boot camp 
      - why - there is a project demand from the client 
      - why - there is real prblem in the industry to be solved 
      - why - to make life easier and efficient 

  Developer 
    - should i user android or ios or both
    - java or kotlin  
    - what database to use it 
    - what cloud to use it 

  Product Engineer 
    - why do you need mobile application 
    - what problems i'm i solving 
    - how will i approve leaves to absentees - how it is done today - i'm using excel sheet 
    - for only levaes management good to have mobile app 

```


```
  -  Design Thinking: Empathize, Define, Ideate, Prototype, Test
    - Domain - public transport 
    - Problem - bus is getting delayed 
    - Solution - 
      - Empathize -  driver (cause of delay - there was a punchure, yesterday also delayed - yesterday also puncher),
           conductor, state transport officer, 
      - Define - 
      - Ideate 
      - Prototype
      - Test 

```
  -  Problem-solving frameworks: 5 Whys, Fishbone / Root Cause Analysis
  -  Critical thinking principles and common cognitive biases
  -  Structured problem decomposition and analytical thinking
  -  Decision matrices and prioritization frameworks
  -  Requirements analysis: functional vs non-functional"
  


# Day 5 

  ## Login Feature 
    - Front end - 
      ```
        Given the application is working on http://localhost:3000 
        When the user goes to home screen 
        Then on top right corner in green color there should be a button labelled "Login" 
        When clikced on Login button
        Then the pop up should come 
        And the screen contains two fields username and password 
        And when user enter basic validation shall happen like email and spl chars for password 
        Then submit button to be enabled 

      ```
    - Backend 
    - NFR 
    - Usability 
    - DOD & DOR 

- quick work breakout room 
  - Calculator Example 
    - Categories People · Process · Technology · Data · Environment · Measurement




# DAY 6 
  - discussion time was not good for discussion 
  - FR v/s NFR 
  - Given(pre condition) When(actuals) Then (post condition) - And But Not  

### disucssion to build user stories 
  - deploying the code with CI/CD pipelines 
  - uptime of the site 99.99 
  - handle client request of ~5000 at a time 
  - PII handling 
- ```
  Given the customer registration API is up 
  When the customer sends the details 
      {
        custName:String, 
        custPhone: String,
        address: {
          hno:Integer, 
          street: String, 
          city:String, 
          state:String
        }, 
        mobile: integer, 
        email: integer
      }
  Then the PII data should be handled i.e., mobile number should not be saved as is 
  And the mobile data information should be encrypted with AES-256 
  And only last 4 digits to be shown 
  And for email id PII data - first character and last char of the email and first char after@ and last char after . to be shown 
```
  - compatability on different devices (AWD)
  - handling user experience with different devices 
  - unit test cases 
  - integration testing 
  - validating the code coverage 
  - coding principles 
  - system + application -  hardering
  - password vault 

  - create a website 
  - sign up and login 
  - most frequently buy items to be shown 
  - the ease of adding a product to cart and place order 
  - items which are repeatedly used 
  - payment gateway (card / UPI / COD)
  - product notification when not available or newly launch 
  - feedback for the purchases done 


  ### Task for calculator - 30 mins 
    - team of 2 
    - 5 why's of calculator 
    - User Story 2 FR / 2 NFR 
    - For calcuator - which data structures to be used LIST / SET / MAP 



# Day 7 


  ## Ways of Development 
    - BDD - Behaviour Driven Development  Given When Then 
    - MDD - MOdel Driven Development - figma, 
    - DDD - Domain Driven Development - domain knowledge, domain experts, domain model, domain events, domain services, domain driven design 
    - TDD - Test Driven Development - write test cases first and then write code to pass the test cases 
    - SDD - Specification Driven Development - write specification first and then write code to pass the specification 


### java discussion 

```

  #define hello main 
  int hello() {
    printf("Hello World");
    return 0; 
  }


  void main() {
    printf("Hello World");
  }
```


-- WORM - Write One Read Many 
-- Loosely Coupled - High Cohesive system, not tightly coupled, so that if one module is changed it should not impact other modules
-- ```
  class Customer {} -> 


      class Customer extends Object{
        public Customer(){
          super();
        }
      }
  Customer c = new Customer(); 
```