from collections import Counter

class Solution:
    def minWindow(self, s, p):

        # Count characters required from string p
        need = Counter(p)

        # Total characters still needed
        missing = len(p)

        left = 0                 # left pointer of window
        start = 0                # start index of best window
        min_len = float('inf')   # smallest window length

        # Expand window by moving right pointer
        for right in range(len(s)):

            # If this character is still needed
            if need[s[right]] > 0:
                missing -= 1     # one required character found

            # Reduce count in dictionary
            need[s[right]] -= 1

            # If all characters are found
            while missing == 0:

                # Update minimum window
                if right - left + 1 < min_len:
                    start = left
                    min_len = right - left + 1

                # Remove left character from window
                need[s[left]] += 1

                # If removed char was required, window becomes invalid
                if need[s[left]] > 0:
                    missing += 1

                # Move left pointer to shrink window
                left += 1

        # If no valid window found
        if min_len == float('inf'):
            return ""

        # Return smallest window substring
        return s[start:start + min_len]