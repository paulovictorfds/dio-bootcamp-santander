function subtituirPares(array) {
    if (!array || !array.length) return -1;
    else {
        for (let i = 0; i < array.length; i++) {
            if (array[i] % 2 === 0 && array[i] !== 0) {
                console.log(`Substituindo ${array[i]} por 0...`);
                array[i] = 0;
            }
        }
        return array;
    }
}

arr = [1, 0, 4, 6, 80, 33, 23, 90];
console.log(subtituirPares(arr));