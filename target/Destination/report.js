$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon search",
  "description": "",
  "id": "amazon-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Search Nikon",
  "description": "",
  "id": "amazon-search;search-nikon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "an url \u0027www.amazon.com\u0027",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "www.amazon.com",
      "offset": 8
    }
  ],
  "location": "AmazonSteps.anUrl(String)"
});
formatter.result({
  "duration": 6952397814,
  "status": "passed"
});
formatter.step({
  "line": 4,
  "name": "searching for \u0027Nikon\u0027",
  "keyword": "When "
});
});