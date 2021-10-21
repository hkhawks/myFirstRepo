Feature: Login to Retail Website

# Each feature file starts with feature keyword and name for feature file
# Each scenario starts with Scenario keyword and : then name of scenario 
# Given is used for precondition
# When is used for an action 
# And is used for actions step following When keyword
# Then is used for expected result and writing assertions.
# scenario runs once with provided data
# Scenario outline will run same scenario with multiple set of data and 
# We use Examples keyword to store the data under it. 
# We can write same step N times as long as they are the same (case sensitive, and no extra space)
# but in step Definitions we should have only one step associated with this step. 
# the Background keyword will host any step or steps that are repeated at the 
# beginning of each scenario in the same feature file. for example the two steps Given user is on Retail website and 
# When user click on Myaccount are the same in the following scenarios, we have background keyword and and we dont need to 
# to repeate these two steps in the each of scenario. But background keyword works only in the same feature file. 
# for scenarios which dont have common step in the beginning, we dont need to have a Background keyword. 
# to use Background keword first the steps or steps should be common between al scenarios in the feature file, second, the common
# step or steps should be in the beginning of each scenario, not the end or middle. flow of execution


Background: 
Given user is on Retail website 
When user click on Myaccount

@smokeTest	@Resgression 	@endtoendTesting
Scenario: Retail website Login test

And user click on Login option
And user enter userName 'eagles@tekschool.us' and password 'eagles'
And user click on Login Button
Then user should be logged in to Myaccount dashboard

@endtoendTesting 	
Scenario Outline: Retail website Login test with multiple accounts 

And user click on Login option
And user enter userName '<userName>' and password '<password>'
And user click on Login Button
Then user should be logged in to Myaccount dashboard

Examples: 
		|userName|password|
		|eagles@tekschool.us|eagles|
		|hawks@tekschool.us|hawks|
		|falcons@tekschool.us|falcons|


Scenario: Retail website logout test

Then user click on logOut Option

	
		
			
