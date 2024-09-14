def subArrayExists(arr, n):
    for i in range(n):
        sum = arr[i]
        if sum == 0:
            return True
        for j in range(i + 1, n):
            sum += arr[j]
            if sum == 0:
                return True
    return False
if __name__ == "__main__":
    arr = [-3, 2, 3, 1, 6]
    N = len(arr)

    if subArrayExists(arr, N):
        print("Found a subarray with 0 sum")
    else:
        print("No Such Sub Array Exists!")
