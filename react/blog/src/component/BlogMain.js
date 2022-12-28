import React from 'react';
import Header from "./Header";
import Nav from "./Nav";
import MainWrap from "./MainWrap";

const blogData = {
    header : {
        title : '리액트로 만드는 블로그',
        description : 'React Component BlogMain '
    },
    nav : {
        menus : [
            {name : 'HTML5', linkUrl : '#'},
            {name : 'Javascript', linkUrl : '#'},
            {name : 'React.js', linkUrl : '#'},
        ]
    },
    aside : {
        ctgy : [
            {name : '카테고리1', linkUrl : '#'},
            {name : '카테고리2', linkUrl : '#'},
            {name : '카테고리3', linkUrl : '#'},
            {name : '카테고리4', linkUrl : '#'},
            {name : '카테고리5', linkUrl : '#'},
        ],
        recentPost : [
            {name : '최신글1', linkUrl : '#'},
            {name : '최신글2', linkUrl : '#'},
            {name : '최신글3', linkUrl : '#'},
            {name : '최신글4', linkUrl : '#'},
            {name : '최신글5', linkUrl : '#'},
        ]
    },
    posts : [
        {title : 'HTML5', date: '2022.12.25', imgUrl: '#', content:'메타는 서비스 장애 약 1시간 뒤인 오후 11시15분(한국시간) 공식 트위터를 통해 "일부 인스타그램 계정 접속에 문제가 있다는 것을 알고 있다. 원인을 파악 중이며 불편을 끼쳐 죄송하다"는 메시지를 띄웠다.'},
        {title : 'CSS3', date: '2022.12.25', imgUrl: '#', content:'메타는 서비스 장애 약 1시간 뒤인 오후 11시15분(한국시간) 공식 트위터를 통해 "일부 인스타그램 계정 접속에 문제가 있다는 것을 알고 있다. 원인을 파악 중이며 불편을 끼쳐 죄송하다"는 메시지를 띄웠다.'},
        {title : 'Javascript', date: '2022.12.25', imgUrl: '#', content:'메타는 서비스 장애 약 1시간 뒤인 오후 11시15분(한국시간) 공식 트위터를 통해 "일부 인스타그램 계정 접속에 문제가 있다는 것을 알고 있다. 원인을 파악 중이며 불편을 끼쳐 죄송하다"는 메시지를 띄웠다.'},
        {title : 'React.js', date: '2022.12.25', imgUrl: '#', content:'메타는 서비스 장애 약 1시간 뒤인 오후 11시15분(한국시간) 공식 트위터를 통해 "일부 인스타그램 계정 접속에 문제가 있다는 것을 알고 있다. 원인을 파악 중이며 불편을 끼쳐 죄송하다"는 메시지를 띄웠다.'},
    ]
}

function BlogMain(props) {
    return (
        <>
            <Header header={blogData.header}/>
            <Nav nav={blogData.nav} />
            <MainWrap
                posts={blogData.posts}
                ctgy={blogData.aside.ctgy}
                recentPosts={blogData.aside.recentPost} />
            <footer>
                Create by Jin
            </footer>
        </>
    );
}

export default BlogMain;