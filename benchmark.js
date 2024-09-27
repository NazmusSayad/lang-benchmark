import fs from 'fs';

// Arithmetic operations
let arithSum = 0;
for (let i = 0; i < 100000000; i++) {
    arithSum += i * 2;
}

// String concatenation
let strConcat = '';
for (let i = 0; i < 100000; i++) {
    strConcat += "test";
}

// Array operations
let arr = [];
for (let i = 0; i < 100000; i++) {
    arr.push(i);
}
let arrSum = arr.reduce((acc, val) => acc + val, 0);

// Function calls
function square(n) {
    return n * n;
}
let funcSum = 0;
for (let i = 0; i < 1000000; i++) {
    funcSum += square(i);
}

// File write and read 1000 times
for (let j = 0; j < 1000; j++) {
    fs.writeFileSync('test.txt', 'This is a test file.\n'.repeat(10000));
    let fileContent = fs.readFileSync('test.txt', 'utf8');
}

// Sorting
let unsortedArr = [];
for (let i = 0; i < 100000; i++) {
    unsortedArr.push(Math.random());
}
let sortedArr = unsortedArr.sort();

// Dictionary (object) operations
let dict = {};
for (let i = 0; i < 100000; i++) {
    dict[`key${i}`] = i;
}
let dictSum = 0;
for (let key in dict) {
    dictSum += dict[key];
}
