

def insertionSort():
    list = [5,2,2,6,7,1,2,5]
    for i in range(len(list)-1):
        for j in range(len(list)-1, i, -1):
            if list[j] < list[j-1]:
                temp = list[j-1]
                list[j-1] = list[j]
                list[j] = temp 

    for l in list:
        print(l)
    

insertionSort()