$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/login.feature");
formatter.feature({
  "line": 3,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@bvts"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on sample page",
  "keyword": "Given "
});
formatter.match({
  "location": "common.i_am_on_sample_page()"
});
formatter.result({
  "duration": 2704683397,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Check the fields",
  "description": "",
  "id": "title-of-your-feature;check-the-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@bvts"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on sample page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I check all fields",
  "keyword": "Then "
});
formatter.match({
  "location": "common.i_am_on_sample_page()"
});
formatter.result({
  "duration": 1412995437,
  "status": "passed"
});
formatter.match({
  "location": "common.i_check_all_fields()"
});
formatter.result({
  "duration": 58240477,
  "status": "passed"
});
});