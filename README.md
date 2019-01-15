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
