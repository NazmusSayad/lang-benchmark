# Arithmetic operations
arith_sum = 0
for i in range(100000000):
    arith_sum += i * 2

# String concatenation
str_concat = ''
for i in range(100000):
    str_concat += 'test'

# Array operations
arr = []
for i in range(100000):
    arr.append(i)
arr_sum = sum(arr)

# Function calls
def square(n):
    return n * n

func_sum = 0
for i in range(1000000):
    func_sum += square(i)

# File write and read 1000 times
for _ in range(1000):
    with open('test.txt', 'w') as f:
        f.write('This is a test file.\n' * 10000)
    with open('test.txt', 'r') as f:
        file_content = f.read()

# Sorting
import random
unsorted_arr = [random.random() for _ in range(100000)]
sorted_arr = sorted(unsorted_arr)

# Dictionary operations
dict = {f'key{i}': i for i in range(100000)}
dict_sum = sum(dict.values())
