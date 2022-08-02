Feature: Verifying the funtionality of the application

@US001
Scenario: positive testing for validating searchbox
Given initialize browser with edge
And Navigate to "https://tide.com/en-us" site
When user enter "Antibacterial fabric spray" and click on search
Then verify that user succesfully search the item 


@US002
Scenario: positive testing for validating shop product link
Given initialize browser with edge
And Navigate to "https://tide.com/en-us" site
When user mouseover on it list should be displyed


@US003
Scenario: positive testing for validating shop products
Given initialize browser with edge
And Navigate to "https://tide.com/en-us" site
When user click on the shoplink
Then it should display the products


@US004
Scenario: positive testing for validating shop product list 
Given initialize browser with edge
And Navigate to "https://tide.com/en-us" site
When user click on the link 
Then user should  verify the text3 


@US005
Scenario: positive testing for validating shop product item
Given initialize browser with edge
And Navigate to "https://tide.com/en-us" site
When user check and verify the text


@US006
Scenario: positive testing for validating text 
Given initialize browser with edge
And Navigate to "https://tide.com/en-us" site
When user click on register  rigister page displayed
And user should click on signup
Then user should verify the text2


@US007
Scenario: positive testing for validating create account
Given initialize browser with edge
And Navigate to "https://tide.com/en-us" site
When user click on link rigister registration page should be displayed
And user should click on signup button
Then user should enter the firstname
And user should enter the email
And user should enter the password
And user should click on create account button

@US008
Scenario: positive testing for validating text
Given initialize browser with edge
And Navigate to "https://tide.com/en-us" site
When user click on link latest news page should be displayed
Then user should verify the text in latest news page


@US009
Scenario: positive testing for validating commitment page text
Given initialize browser with edge
And Navigate to "https://tide.com/en-us" site
When user click on link latest our commitments page should be displayed
Then user should verify the text in commitments page

@US010
Scenario: positive testing for validating text in contact us page
Given initialize browser with edge
And Navigate to "https://tide.com/en-us" site
When user click on link latest our contact us page should be displayed
Then user should verify the text in contact us page
