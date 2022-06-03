@srcmainLogin
Feature: LeafTaps Application Login Functionality

Background:
Given Open Leaftaps Chrome browser
And Load Leaftaps application url

Scenario Outline: Login Leaftap with positive credentials
Given Enter login username as <username>
And Enter login password as <password>
When Click login button
Then Homepage should display

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
#|'DemoCSR'|'crmsfa'|

Scenario: CreateLeadMain
Given Enter login username as 'Demosalesmanager'
And Enter login password as 'crmsfa'
When Click login button
Then Homepage should display
When Click on main CRMSFA link
Then Main Title should be displayed

Scenario: EditLeadMain
Given Enter login username as 'DemoCSR'
And Enter login password as 'crmsfa'
When Click login button
Then Homepage should display
When Click on main CRMSFA link
Then Main Title should be displayed
When Click leads button
Then Leads page shuld be displayed

