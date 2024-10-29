from collections import Counter

def solution(want, number, discount):
    answer = 0
    counter1 = Counter()
    for i in range(len(want)):
        counter1[want[i]] = number[i]
    
    
    for i in range(len(discount) - 9):
        counter2 = Counter()
        for j in range(i, i + 10):
            counter2[discount[j]] += 1
        if counter1 == counter2:
            answer = answer + 1
    
    return answer