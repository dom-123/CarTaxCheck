Feature: Car Check

  Scenario Outline: Check Registration Details
    Given I am on cartaxcheck home page
    When I enter "<vehicle registration>" on enter registration field and click free car check button
    Then the following vehicle identity "<registration>" "<make>" "<model>" "<colour>" "<year>" are displayed
    Examples:
      | vehicle registration | registration | make       | model                      | colour | year |
      | SG18HTN              | SG18HTN      | Volkswagen | Golf Se Navigation Tsi Evo | White  | 2018 |
      | DN09HRM              | DN09HRM      | BMW        | 320D Se                    | Black  | 2009 |
      | BW57BOF              | BW57BOF      | Toyota     | Yaris T2                   | Black  | 2010 |
      | KT17DLX              | KT17DLX      | Skoda      | Superb Sportline Tdi S-A   | White  | 2017 |