import React, {useState} from 'react';

function WordInput({addWord}) {

    const [text, setText] = useState('')

    const changeText = (e) => {
        setText( e.target.value )
    }

    const clickAdd = () => {
        addWord(text)
        setText('')
    }

    return (
        <div >
            <input
                id="outlined-basic"
                label="단어 입력"
                value={text}
                onChange={e => changeText(e)}
            />
            <button  onClick={clickAdd} >ADD</button>
        </div>
    );
}

export default WordInput;
