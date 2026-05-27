
def LinearSearch(arr,target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1

numbers = [1,2,3,4,5]
print(LinearSearch(numbers,3)) 
print(LinearSearch(numbers,6))
    