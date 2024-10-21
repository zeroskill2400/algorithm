def solution(nums):
    tmp = len(set(nums))
    answer = min(tmp, len(nums)/2)
    return answer