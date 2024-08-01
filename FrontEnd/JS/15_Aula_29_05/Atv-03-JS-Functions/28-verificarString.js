function contemString(str,substr){
    if(str.includes(substr)) {
        return true;
    } 
    return false;
}
let str ="hello world";
let substr ="hi";
console.log(`A string contém a substring: ${contemString(str, substr)}`);