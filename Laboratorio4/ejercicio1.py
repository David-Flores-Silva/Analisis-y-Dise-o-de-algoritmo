def greatestNumber(array):
    for i in array:
        isIValTheGreatest = True
        for e in array:
            if e > i:
                isIValTheGreatest = False
        if isIValTheGreatest:
            return i


            