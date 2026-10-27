import pytest

class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        seen = {}

        for i in range(len(nums)):
            complement = target - nums[i]
            
            if complement in seen:
                return [seen[complement], i]
            else:
                seen[nums[i]] = i

        return []
                

# ============================================================
# 測試（題目的 Example），用 LeetCode: Test current problem 跑；上面寫演算法就好
# ============================================================

def any_order(x):
    """題目說答案順序不限：只排最外層"""
    return sorted(x, key=repr)


if __name__ == "__main__":
    pytest.main([__file__, "-v"])


@pytest.mark.parametrize("nums, target, expected", [
    pytest.param([2, 7, 11, 15], 9, [0, 1]),
    pytest.param([3, 2, 4], 6, [1, 2]),
    pytest.param([3, 3], 6, [0, 1]),
])
def test_twoSum(nums, target, expected):
    output = Solution().twoSum(nums, target)
    assert any_order(output) == any_order(expected)
