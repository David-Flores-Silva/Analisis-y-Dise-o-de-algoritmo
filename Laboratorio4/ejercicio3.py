def twoSum(array):
    for i in len(array):
        for e in len(array):
            if i != e & array[i] + array[e] == 10:
                return True

    return False