import React, {useState} from 'react';
import WordInput from './WordInput';
import WordList from './WordList';


function WordContainer(props) {

    const styles = {
        wrapper: {
            padding: 16,
            display: "flex",
            flexDirection: "row",
            justifyContent: "space-around" 
        },
        box : {border : "3px solid #333"}
    };

    const [words, setWords] = useState(['AAAA','BBBB','CCCC'])

    const addWord = (word) => {
        //전개 연산자를 이용해서 새로운 배열
        setWords([...words, word])
    }

    const removeWord = (word) => {
        const filteredWords = words.filter( w => w.toLowerCase() !== word.toLowerCase())
        setWords([...filteredWords])
    }

    return (
        <div style={styles.wrapper}>
            <WordInput addWord={addWord}></WordInput>
            <WordList words={words} removeWord={removeWord}></WordList>

        </div>
    );
}

export default WordContainer;
