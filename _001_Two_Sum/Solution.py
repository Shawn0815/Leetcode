import pytest

class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        seen = {}

        for i, num in enumerate(nums):
            complement = target - num

            if complement in seen:
                return [seen[complement], i]

            seen[num] = i

        return []


if __name__ == "__main__":
    pytest.main([__file__, "-v"])


@pytest.mark.parametrize("nums, target, expected", [
    pytest.param([2, 7, 11, 15], 9, [0, 1]),
    pytest.param([3, 2, 4], 6, [1, 2]),
    pytest.param([3, 3], 6, [0, 1]),
])
def test_twoSum(nums, target, expected):
    output = Solution().twoSum(nums, target)
    assert output == expected