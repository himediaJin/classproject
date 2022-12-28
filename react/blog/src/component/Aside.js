import React from 'react';

function Aside({ctgy , recentPosts}) {
    return (
        <aside>
            <h4>카테고리</h4>
            <ul>
                {ctgy.map((item, index) => <li key={index}><a href={item.linkUrl}>{item.name}</a></li> )}
            </ul>

            <h4>최근 글</h4>
            <ul>
                {recentPosts.map((item, index) => <li key={index}><a href={item.linkUrl}>{item.name}</a></li> )}
            </ul>
        </aside>
    );
}

export default Aside;