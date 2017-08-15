# Median of Two Sorted Arrays

There are two sorted arrays **nums1** and **nums2** of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

**Example 1:**

```
nums1 = [1, 3]
nums2 = [2]

The median is 2.0

```

**Example 2:**

```
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
```



# General Concept
## O(NlogN)
Combine 2 arrays and use the build-in Sort method, and then get the final outcome
## O(logN) --> Easy & Fast
We have 2 sorted array, if the combined array has a length "len", the median will be the array[(len >> 1) + 1] when len is an odd num

when len is an even num, the median will be the array[(len >> 1)] + array[(len >> 1) + 1] / 2.0





## O(log(min(M,N))) --> TODO
//Complicated 
//Check it on the Leetcode.com



[1,2,3,4,5]

[6,7,8,9,10]

