class Solution:
    def areIsomorphic(self, s1, s2):
        return [s1.index(c) for c in s1] == [s2.index(c) for c in s2]