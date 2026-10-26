import pytest

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        countS = [0] * 26
        countT = [0] * 26

        for i in range(len(s)):
            countS[ord(s[i]) - ord('a')] += 1
            countT[ord(t[i]) - ord('a')] += 1

        return countS == countT

if __name__ == "__main__":
    pytest.main([__file__, "-v"])

@pytest.mark.parametrize("s, t, expected", [
    pytest.param("anagram", "nagaram", True),
    pytest.param("rat", "car", False),
])
def test_isAnagram(s, t, expected):
    output = Solution().isAnagram(s, t)
    assert output == expected