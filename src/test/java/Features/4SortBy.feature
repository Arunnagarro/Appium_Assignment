Feature: SortBy
 @Test1
  Scenario Outline: Search Job By Applying SortBy
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
    Given User Click On Sort By Option
    And User Select The Option
    When User Select The job
    Then User Click Call To HR

    Examples: 
      | Name   | Number      | Location    |
      | Arun | 9315408095 | Kamruddin Nagar |
