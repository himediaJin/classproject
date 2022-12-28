import React from 'react';
import Aside from "./Aside";
import Article from "./Article";

function MainWrap({posts, ctgy, recentPosts}) {
    return (
        <div id="wrap">
            <section>
                {posts.map((post, index) => {
                    return <Article key={index}
                        title={post.title}
                        date={post.date}
                        imgUrl={post.imgUrl}
                        content={post.content}
                    />
                })}
            </section>
            <Aside ctgy={ctgy} recentPosts={recentPosts}/>
        </div>
    );
}

export default MainWrap;