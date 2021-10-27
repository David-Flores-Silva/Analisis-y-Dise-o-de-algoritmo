from matplotlib import pyplot as plt

def insertSort(a):
    j=1
    for j in range(len(a)):
        key = a[j]
        i = j-1 
        while i>=0 and a[i]>key:
            a[i+1] = a[i]
            i = i - 1
        a[i+1] = key


a = [5,2,4,6,1,3,7,10,9,8]
insertSort(a)
print(a)


plt.plot(a)
plt.show()

