function arrayTask(){

    function shortestWord(sentence){
        const word = sentence.split(" ")
        let shortestWord = word[0];
        for(let counter = 1; counter<word.length; counter++){
            if(word[counter].length < shortestWord.length){
                shortestWord = word[counter]
            }
        }
        return shortestWord;
    };

    const ascendingOrder = (array)=>{
        for(let counter = 0; counter<array.length; counter++){
            array[counter] = array[counter] * array[counter];
        }

        for (let counter = 0; counter < array.length - 1; counter++) {
            for (let counterTwo = 0; counterTwo < array.length - 1 - counter; counterTwo++) {

                if (array[counterTwo] > array[counterTwo + 1]) {
                    let temp = array[counterTwo];
                    array[counterTwo] = array[counterTwo + 1];
                    array[counterTwo + 1] = temp;
                }
            }
        }

        return array;
    };
    

    return{
        shortestWord,
        ascendingOrder
    }
}

module.exports  = arrayTask()
