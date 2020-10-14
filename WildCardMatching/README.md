# Readme

***Wild card matching using Dynamic Programming***

This is a dynamic programing approach to match the given string with a given pattern.

The pattern can be empty and can contain only lowercase letters a-z, and characters like ? or *.
The string can be empty and can contain only lowercase letters a-z.

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).

The matching will cover the entire input string (not partial).

***Example 1:***

```Input:```
s = "aa"
p = "a"

```Output:``` aa doesn't match with the given pattern: a?

```Explanation:``` "a" does not match the entire string "aa".

***Example 2:***

```Input:```
s = "aa"
p = "*"

```Output:``` aa matches the pattern: *?

```Explanation:``` '*' matches any sequence.

