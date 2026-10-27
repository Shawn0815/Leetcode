import pytest


class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        seen = set()

        for num in nums:
            if num in seen:
                return True
            else:
                seen.add(num)

        return False


# ============================================================
# 測試（題目的 Example），按 VS Code 的 Run 跑；上面寫演算法就好
# ============================================================

if __name__ == "__main__":
    pytest.main([__file__, "-v"])


@pytest.mark.parametrize("nums, expected", [
    pytest.param([1, 2, 3, 1], True),
    pytest.param([1, 2, 3, 4], False),
    pytest.param([1, 1, 1, 3, 3, 4, 3, 2, 4, 2], True),
])
def test_containsDuplicate(nums, expected):
    output = Solution().containsDuplicate(nums)
    assert output == expected
