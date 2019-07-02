# CodingKata@Careem - 3/7/19

Exersice: 

Weather Data:

In weather.csv you’ll find daily weather data for Morristown, NJ for June 2002. Download this text file, then write a function that return the day number (column one) with the smallest temperature spread (the maximum temperature is the second column, the minimum the third column).

## Requirements: 
1. If List of String is empty or null return -1. 
2. If two days has same spread return the first one.
3. Return the day number with the smallest temperature spread.

## Rules: 
 
You need to Follow Three Rules of TDD

  1. You are not allowed to write any production code unless it is to make a failing unit test pass.
  2. You are not allowed to write any more of a unit test than is sufficient to fail; and compilation failures are failures.
  3. You are not allowed to write any more production code than is sufficient to pass the one failing unit test.


## Common Files
`weather.csv` has all the records required for parsing.
`weatherTest.csv` has one record line used for testing file input.

## Java Blueprint

In the `Java` folder you'll find `TDD.java` and `TDDTest.java` with `getDataFromFile` function implemented. 

## Python Blueprint

In the `Python` folder, you'll find `tdd.py` and `test_tdd.py`. 
You will need to develop tests in test_tdd.py first, and then develop corresponding functions in `tdd.py`.
