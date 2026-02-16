# inventory-management-system
# Inventory Management System Update (Duplicate Zeros)

## Background (Business Context)
In a retail inventory system, a stock value of 0 represents an out-of-stock product. 
To simulate a restock order, every zero in the inventory array must be duplicated, 
while shifting the remaining elements to the right. The array must be modified in-place 
without changing its original length.

---

## Problem Statement
Given an integer array `inventory`, duplicate each occurrence of zero in-place. 
Elements shifted beyond the array length should be discarded.

Example:
Input: [4,0,1,3,0,2,5,0]  
Output: [4,0,0,1,3,0,0,2]

---

## Clarifying Questions (Interview Style)
1. Should the array be modified in place? (Yes)
2. Should the array length remain fixed? (Yes)
3. What happens to elements that exceed array length? (They are discarded)
4. Are negative numbers allowed? (Does not affect algorithm)

---

## Approach (Algorithm Explanation)
I used a backward two-pointer approach:
1. Count the number of zeros in the array.
2. Use two pointers:
   - `i` for the original array (starting from the end)
   - `j` for the virtual expanded array
3. Traverse from right to left to avoid overwriting elements.
4. If a zero is found, duplicate it by writing it twice (if within bounds).
5. This ensures in-place modification and optimal efficiency.

---

## Flowchart / Logic (Text Diagram)
START  
↓  
Count zeros in array  
↓  
Set i = n-1 and j = n-1 + zeros  
↓  
Traverse backward while i >= 0  
↓  
If j < n → copy element  
↓  
If element == 0 → duplicate zero  
↓  
Move i-- and j--  
↓  
END  

---

## Test Cases

### Normal Test Cases
1. [4,0,1,3,0,2,5,0] → [4,0,0,1,3,0,0,2]  
2. [3,2,1] → [3,2,1]  
3. [1,2,0,3,4] → [1,2,0,0,3]  

### Edge Test Cases
1. [] → []  
2. [0,0,0] → [0,0,0]  
3. [0] → [0]  

---

## Time and Space Complexity
Time Complexity: O(n)  
- One pass to count zeros  
- One pass to modify the array  

Space Complexity: O(1)  
- No extra array used (in-place modification)

---

## Optimization & Refinement
Naive Approach:
- Shift elements every time a zero is found
- Time Complexity: O(n²)

Optimized Approach (Used):
- Backward traversal with two pointers
- Time Complexity: O(n)
- Space Complexity: O(1)

This improves efficiency and avoids unnecessary shifting operations.

---

## How to Run the Code (VS Code Terminal)
```bash
javac Solution.java
java Solution
