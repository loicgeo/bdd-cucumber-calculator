# BDD tests

## Cucumber

### Scenarios

Each .feature file is composed of one or more Scenarios.

#### Scenario types

Background -> Scenario

##### Scenario

A Scenario is a list of `steps` which are prerequisites, actions, validations performing a test case.

Scenarios are independent of one another during Feature execution.

##### Background

Backgrounds are similar to regular Scenarios, except the Background is executed before each Scenario is executed in the Feature File.

Usually they use to load/clean dataset or instances.

##### Scenario Outline

Scenario Outlines are similar to regular Scenarios except that a Scenario Outline is executed multiple times, according a following `Examples` section right after.

The values in the Example section are used to replace matching tokens in the Scenario Outline.


## Useful links

### Cucumber

    [Documentation](https://docs.cucumber.io)

### Gherkin

    [Documentation](https://docs.cucumber.io/gherkin/reference)
