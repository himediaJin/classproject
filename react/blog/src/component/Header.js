import React from 'react';

function Header({header}) {
    return (
        <header>
            <h1 className="title">{header.title}</h1>
            <p>{header.description}</p>
        </header>
    );
}

export default Header;