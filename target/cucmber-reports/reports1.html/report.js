$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Flipkart.feature");
formatter.feature({
  "name": "Flipkartlogin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validation of login functinality of Flipkart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sainty"
    }
  ]
});
formatter.step({
  "name": "user launch url for Flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.FlipkartStepDef.user_launch_url_for_Flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the user credentials for Flipkart",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.FlipkartStepDef.user_enters_the_user_credentials_for_Flipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "use validate Home Page of Flipkart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.FlipkartStepDef.use_validate_Home_Page_of_Flipkart()"
});
formatter.result({
  "status": "passed"
});
});