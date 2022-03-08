$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("task.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM App Testing",
  "description": "",
  "id": "freecrm-app-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "validate Free CRM Tasks Page Test",
  "description": "",
  "id": "freecrm-app-testing;validate-free-crm-tasks-page-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "validate logged in user",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on task link",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "create new task",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefination.user_opens_browser()"
});
formatter.result({
  "duration": 5644578115,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefination.user_is_on_login_page()"
});
formatter.result({
  "duration": 4719639814,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefination.user_logs_into_app()"
});
formatter.result({
  "duration": 5299154845,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefination.validate_home_page_title()"
});
formatter.result({
  "duration": 1005446319,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefination.validate_logged_in_user()"
});
formatter.result({
  "duration": 896825325,
  "status": "passed"
});
formatter.match({
  "location": "TaskStepDefination.click_on_task_link()"
});
formatter.result({
  "duration": 7395696831,
  "status": "passed"
});
formatter.match({
  "location": "TaskStepDefination.create_new_task()"
});
formatter.result({
  "duration": 23585977447,
  "status": "passed"
});
});