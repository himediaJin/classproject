import React from 'react';

function Display({arr, changeMenu}) {

    return (
        <div style={{border: "3px solid #333", padding: 10, width: 200}}>
            <ul>
                {arr.map(menu =>
                    <li key={menu.mno} onClick={() => changeMenu(menu.mno)}>{menu.name} </li>)}
            </ul>
        </div>
    );
}

export default Display;

