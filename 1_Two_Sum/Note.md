# Two Sum

Given an array of integers, return **indices** of the two numbers such that they add up to a specific target.

You may assume that each input would have **exactly** one solution, and you may not use the *same* element twice.

**Example:**

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

# General Concept

Get a hashmap and put < distanceToTarget, index > for every single number in the Array

if the next number in the loop match the distanceToTarget, saying that the next number plus the matched number will be the target.

# Time Complexity

O(n)
