const fruit = {
    name: apple,
	price: 1.5,
};

const quantity = [1, 2, 3, 4, 5, 6, 7, 8 ,9, 10];

function mapArray(array) {
	return array.map(function (item) { return item * this.price; }, fruit);
}

console.log(mapArray(quantity));