# 🔗 Concatenation of Array

##  Problem

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` where:

* `ans[i] = nums[i]`
* `ans[i + n] = nums[i]`

---

## Idea

We iterate through the array and when the array get reach they will continuous iterate 
- i%nums.length when array reach this will return the counter to 0 again until loop reach.

---

## Example

**Input:**

```
nums = [1, 4, 1, 2]
```

**Output:**

```
ans = [1, 4, 1, 2, 1, 4, 1, 2]
```

---

## table to explain step by step

| i | nums[i % nums.length] | ans[i] | ans Array         |
|---|-----------------------| ------ |-------------------|
| 0 | 1                     | 1      | [1,0,0,0,0,0,0,0] |
| 1 | 4                     | 4      | [1,4,0,0,0,0,0,0] |
| 2 | 1                     | 1      | [1,4,1,0,0,0,0,0] |
| 3 | 2                     | 2      | [1,4,1,2,0,0,0,0] |
| 4 | 1                     | 1      | [1,4,1,2,1,0,0,0] |
| 5 | 4                     | 4      | [1,4,1,2,1,4,0,0] |
| 6 | 1                     | 1      | [1,4,1,2,1,4,1,0] |
| 7 | 2                     | 2      | [1,4,1,2,1,4,1,2] |

---

## 💻 Code 

```java
package array_problems;

public class ConcatenationOfArrays {
    public static int[] getConcatenating(int nums[]){
        int[] ans=new int[2*nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[i%nums.length];
        }
        return ans;
    }
}
```

---

##  Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n)

---

