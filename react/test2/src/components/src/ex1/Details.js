import React from 'react';

function Details({menu}) {

    if(!menu){
        return (
            <div>Not Selected</div>
        )
    }

    return (
        <div style={{border : "3px solid #333", padding : 10, width:200}}>
            <h3>{menu.mno}</h3>
            <h3>{menu.name}</h3>
            <h3>{menu.price}</h3>
        </div>
    );
}

export default Details;
