import React from 'react';

function Nav({nav}) {
    return (
        <nav>
            <ul>
                {nav.menus.map((menu, index) => {
                    return (
                        <li key={index}>
                            <a href={menu.linkUrl}>{menu.name} </a>
                        </li>
                    )
                })}
            </ul>
            <div>
                <input type="text" />
                <input type="button" value="검색"/>
            </div>
        </nav>
    );
}

export default Nav;