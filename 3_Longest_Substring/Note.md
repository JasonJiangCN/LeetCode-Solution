# Longest Substring Without Repeating Characters

Given a string, find the length of the **longest substring** without repeating characters.

**Examples:**

Given `"abcabcbb"`, the answer is `"abc"`, which the length is 3.

Given `"bbbbb"`, the answer is `"b"`, with the length of 1.

Given `"pwwkew"`, the answer is `"wke"`, with the length of 3. Note that the answer must be a **substring**, `"pwke"` is a *subsequence* and not a substring.

# General Concept
The j stands for the start of every possible "longest substring". Use the Math.max to always keep the varible max to be the max length of the substrings. 

So in this case, the max will keep unchanged or set to be i (current position) minus j (start index of the substring) and plus 1 (because the index is 0-based)

# Time Complexity

Should be O(N)



