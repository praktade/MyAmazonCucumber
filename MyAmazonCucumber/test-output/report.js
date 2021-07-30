$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/automation_workspace/MyAmazonCucumber/src/main/java/com/qa/feature/Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Login to amazon app",
  "description": "",
  "id": "login-to-amazon-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify if login sucessfully",
  "description": "",
  "id": "login-to-amazon-app;verify-if-login-sucessfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of the page is amazon",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Check if user is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonLogin.user_is_on_sign_in_page()"
});
formatter.result({
  "duration": 6684595659,
  "status": "passed"
});
formatter.match({
  "location": "AmazonLogin.title_of_the_page_is_amazon()"
});
formatter.result({
  "duration": 45918056,
  "status": "passed"
});
formatter.match({
  "location": "AmazonLogin.enter_username_and_password()"
});
formatter.result({
  "duration": 1476732615,
  "status": "passed"
});
formatter.match({
  "location": "AmazonLogin.check_if_user_is_navigated_to_home_page()"
});
formatter.result({
  "duration": 27523,
  "status": "passed"
});
});