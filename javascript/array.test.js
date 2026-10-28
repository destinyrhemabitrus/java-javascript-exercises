const arrayTask = require("./array");

test("That i can add two numbers", ()=>{
    let input = "God is good";
    const actual = arrayTask.shortestWord(input);
    expect(actual).toBe("is")
});

test("That i can subtract two numbers", ()=>{
    const input = [2,6,5,1,7];
    let expected = [1,4,25,36,49];
    const actual = arrayTask.ascendingOrder(input);
    expect(actual).toEqual(expected)
});
