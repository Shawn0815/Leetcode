import pytest


class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        groups = {}

        for word in strs:
            freq = [0] * 26

            for c in word:
                freq[ord(c) - ord('a')] += 1

            key = tuple(freq)

            if key not in groups:
                group = []
                groups[key] = group
            else:
                group = groups[key]

            group.append(word)

        return list(groups.values())

# ============================================================
# 測試（題目的 Example），用 LeetCode: Test current problem 跑；上面寫演算法就好
# ============================================================

def any_order(x):
    """題目說答案順序不限：每一層都排序"""
    if isinstance(x, list):
        return sorted((any_order(v) for v in x), key=repr)
    return x


if __name__ == "__main__":
    pytest.main([__file__, "-v"])


@pytest.mark.parametrize("strs, expected", [
    pytest.param(["eat", "tea", "tan", "ate", "nat", "bat"], [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]),
    pytest.param([""], [[""]]),
    pytest.param(["a"], [["a"]]),
])
def test_groupAnagrams(strs, expected):
    output = Solution().groupAnagrams(strs)
    assert any_order(output) == any_order(expected)
