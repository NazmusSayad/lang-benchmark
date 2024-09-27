-- Arithmetic operations
local arithSum = 0
for i = 0, 100000000 - 1 do
    arithSum = arithSum + i * 2
end

-- String concatenation
local strConcat = ""
for i = 0, 100000 - 1 do
    strConcat = strConcat .. "test"
end

-- Array operations
local arr = {}
for i = 0, 100000 - 1 do
    table.insert(arr, i)
end

local arrSum = 0
for i = 1, #arr do
    arrSum = arrSum + arr[i]
end

-- Function calls
local function square(n)
    return n * n
end

local funcSum = 0
for i = 0, 1000000 - 1 do
    funcSum = funcSum + square(i)
end

-- File write and read 1000 times
for j = 1, 1000 do
    local file = io.open("test.txt", "w")
    for i = 0, 10000 - 1 do
        file:write("This is a test file.\n")
    end
    file:close()

    file = io.open("test.txt", "r")
    local fileContent = file:read("*all")
    file:close()
end

-- Sorting
local unsortedArr = {}
for i = 0, 100000 - 1 do
    table.insert(unsortedArr, math.random())
end
table.sort(unsortedArr)

-- Dictionary operations (tables)
local dict = {}
for i = 0, 100000 - 1 do
    dict["key" .. i] = i
end

local dictSum = 0
for k, v in pairs(dict) do
    dictSum = dictSum + v
end
