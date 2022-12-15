function doMagic(limit) {
  for (let i = 0; i < limit; ++i) {
    if (i % 2 == 0) {
      console.log(i + " ist gerade");
    } else {
      console.log(i + " ist ungerade");
    }
  }
}

console.log("Hello World!");
let zahl = 120;
console.log("plus", zahl + 3);
console.log("minus", zahl - 3);
console.log("multiplikation", zahl * 3);
console.log("division", zahl / 3);

doMagic(4);
doMagic(24);

let message = "Hello World!";
console.log(message, message.toUpperCase());
