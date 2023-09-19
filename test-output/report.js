$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ProductCategoryFunctionality.feature");
formatter.feature({
  "name": "Product Category CRUD Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "name": "Category CRUD Tests",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I generate all test random value",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.ProductCategoryFunctionality.i_generate_all_test_random_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a Category",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.ProductCategoryFunctionality.i_create_a_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify category id and name",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.ProductCategoryFunctionality.i_verify_category_id_and_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I update category with ABCD1234 as category Name",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.ProductCategoryFunctionality.i_update_category_with_ABCD1234_as_category_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify Updated category name and Id",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.ProductCategoryFunctionality.i_verify_Updated_category_name_and_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete that category",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.ProductCategoryFunctionality.i_delete_that_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify category is Deleted",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.ProductCategoryFunctionality.i_verify_category_is_Deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});