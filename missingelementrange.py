def find_missing(arr, low, high):
    arr_set = set(arr)   # Convert to set for fast lookup
    missing = []

    for num in range(low, high + 1):
        if num not in arr_set:
            missing.append(num)

    return missing
