def unionArrays(a, b):
    result_set = set()

    for x in a:
        result_set.add(x)

    for x in b:
        result_set.add(x)

    return list(result_set)
