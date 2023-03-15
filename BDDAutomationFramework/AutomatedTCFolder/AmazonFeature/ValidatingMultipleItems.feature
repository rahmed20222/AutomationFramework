Feature: Amazon
Scenario Outline: Validating Multiple items price
Given In Amazon Homepage
When enter <items>
Then Click on search
Then validating the first price
Examples:
|items|
|Baby Toys|
|TV|
|Watch|
|baseball|