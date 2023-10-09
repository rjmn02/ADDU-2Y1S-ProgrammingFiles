def insertionSort(arr): 
    print("INSERTION SORT: ")
    for i in range(1, len(arr)):
        temp = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > temp:
            arr[j+1] = arr[j]
            j = j - 1

        arr[j+1] = temp
        print(arr)

def bubbleSort(arr):
    print("BUBBLESORT: ")
    for i in range(len(arr)-1):
        for j in range(len(arr)-1, 0, -1):
            if arr[j] < arr[j-1]:
                temp = arr[j]
                arr[j] = arr[j-1]
                arr[j-1] = temp
    print(arr)

arr = [6,2,3,1,5,73,9]
bubbleSort(arr)