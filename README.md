# Algorithms
Solving algorithms tasks.

# LeetCode
## Easy
### Jewels and Stones
Time: 31 ms,

Faster than 2.57% of Java online submissions.
  
We use split string S and J into arrays. After we create a hashmap of S, where a key is a letter and value number of this letters in S. 
The last step is to find what letters from J exist in this hashmap and sum values.

### Unique Email Adresses
Time: 72 ms, 

Faster than 22.96% of Java online submissions.
  
Firstly we check that emails are correct (1 <= emails.length() <= 100; 1 <= emails[i] <= 100; every email contains only 1 @ symbol.
Secondly, we split email by "@", and remove all after "+". After we remove dots.

Create a new set, save emails and get size of this set.

### Two Sum

Time: 400 ms, 

Faster than 42.19% of C# online submissions for Two Sum.

Memory Usage: 30.5 MB, less than 92.69% of C# online submissions for Two Sum.

There is an input array and an input target int values.
Program should find 2 indices for which values sum is equal to target.

Starts from the first number, check if it sum with next value is equal to target; when array ends, start comparing for second number; and do it until there is end of the array.

### Running Sum

Time: 252 ms, faster than 40.90% of C# online submissions for Running Sum of 1d Array.

Memory Usage: 30.7 MB, less than 100.00% of C# online submissions for Running Sum of 1d Array.

Example:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].