Feature: Search Job

 # @Test1
  Scenario Outline: Search Job According to city
    Given App Lauch
    And User Enters The Name<Name>
    And User Enters The Phone Number<Number>
    When User Click Submit
    Then User Select city
    But user Enter Location<Location>
    But User Click SubmitButton
    But User Select gender
    But User Select Qualification
    But User Select SchoolMedium
    But User Select EnglishLevel
    Then User scroll and Select Exper Or Fresher
    And User Click Age
    And User Select Age
    And User Select Interest
    Then User click Submit Option
    But user Click on What You Know
    But user choose the options
    And user click Submito
    And User click on Degree and Choose the degree
    Then User Click On done
    And User Choose The language
    And User Click on search tab
    When User enter City <city>
    And Open Searched job
    Then Add job to favourite

    Examples: 
      | Name   | Number      | Location    | city  |
      | Arun | 9315408095 | Kamruddin Nagar | New Delhi |

  Scenario Outline: Search Job with invalid input
    Given User Click on Search tab
    When User Enter City <value>
    And Open Searched jobs
    Then Add job to Favourite

    Examples: 
      | value      |
      | aslkbjhvca |
