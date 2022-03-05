
Feature: Validate is leap Year test

Rule: Leap year
  Scenario Outline: should Leap Year Divisible Four
    Given a year <years>
    When Divisible 4
    Then return is a leap year "true"
  Examples: 
       |years|
       |1996|
    
  Scenario Outline: should Leap Year Divisible One Hundred
    Given a year <years>
    When Divisible 100
    Then return is a leap year "false"
  Examples: 
       |years|
       |2001|
  
  Scenario Outline: should Leap Year Divisible Four Hundred
    Given a year <years>
    When Divisible 400
    Then return is a leap year "true"
  Examples: 
       |years|
       |2000|
