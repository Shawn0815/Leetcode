import pytest

class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        s= set(nums)

        return len(nums) != len(s)


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