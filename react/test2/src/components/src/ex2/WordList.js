import React from 'react';


function WordList({words, removeWord}) {


    const list = words.map( (w,i) => {

        return (
            <ul>
                <li key={i}>
                    {w}
                    <button style={{marginLeft:10}} onClick={() => removeWord(w) }>delete</button>                    
                </li>
            </ul>
        )
    })


    return (
        <div>
            {list}
        </div>
    );
}

export default WordList;
