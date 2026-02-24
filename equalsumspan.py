class Solution:
    def equalSumSpan(self, a1, a2):
        n = len(a1)
        
        diff_map = {}   # stores first index of each diff
        s1 = s2 = 0
        max_len = 0
        
        for i in range(n):
            s1 += a1[i]
            s2 += a2[i]
            
            diff = s1 - s2
            
            # If prefix sums are equal from 0 to i
            if diff == 0:
                max_len = i + 1
            
            # If diff seen before → span exists
            elif diff in diff_map:
                max_len = max(max_len, i - diff_map[diff])
            
            # Store first occurrence of diff
            else:
                diff_map[diff] = i
        
        return max_len