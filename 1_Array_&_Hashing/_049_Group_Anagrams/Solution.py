import pytest
from collections import defaultdict

# class Solution:
#     def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
#         d = defaultdict(list)

#         for str in strs:
#             key = ''.join(sorted(str))
#             d[key].append(str)

#         return list(d.values())

class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        d = defaultdict(list)

        for str in strs:
            count = [0] * 26

            for c in str:
                count[ord(c) - ord('a')] += 1

            key = tuple(count)
            d[key].append(str)

        return list(d.values())

if __name__ == "__main__":
    pytest.main([__file__, "-v"])

@pytest.mark.parametrize("strs, expected", [
    pytest.param(["eat","tea","tan","ate","nat","bat"], [["bat"],["nat","tan"],["ate","eat","tea"]]),
])
def test_groupAnagrams(strs, expected):
    output = Solution().groupAnagrams(strs)
    assert sorted([sorted(x) for x in output]) == sorted([sorted(x) for x in expected])
