import React, {useState} from 'react';
import styled from "styled-components";
import {useNavigate, useParams} from "react-router-dom";
import data from "../../data.json"
import Button from "../ui/Button";
import CommentList from "../list/CommentList";
import TextInput from "../ui/TextInput";

const Wrapper = styled.div`
    padding: 16px;
    width: calc(100%-32px);
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
`;

const Container = styled.div`
    width: 100%;
    max-width: 720px;
    
    & > * {
        :not(:lastChild) {
            margin-bottom: 16px;
        }
    }
`;

const PostContainer = styled.div`
    padding: 8px 16px;
    borcer: 1px solid #AAA;
    border-radius: 8px;
`;

const TitleText = styled.p`
    font-size: 28px;
    font-weight: 500;
`;

const ContentText = styled.p`
    font-sixe: 20px;
    line-height: 32px;
    white-space: pre-wrap;
`;

const CommentLabel = styled.p`
    font-size: 16px;
    font-weight: 500;
`;


function PostViewPage(props) {

    const navigate = useNavigate();
    const {postId} = useParams();   //  /post/12  => 12 값을 반환

    const [comment, setComment] = useState();

    // 전달받은 번호의 포스트(게시글) 데이터
    const post = data.find((item) => {
        return item.id == postId;
    })

    return (
        <Wrapper>
            <Container>
                <Button
                    title={"뒤로 가기"}
                    onClick={() => {
                        navigate("/")
                    }}
                />

                <PostContainer>
                    <TitleText>{post.title}</TitleText>
                    <ContentText>{post.content}</ContentText>
                </PostContainer>

                <CommentLabel>댓글</CommentLabel>
                <CommentList comments={post.comments}/>

                <TextInput
                    height={40}
                    value={comment}
                    onChange={(event) => setComment(event.target.value)}
                />
                <Button
                    title={'댓글 작성하기'}
                    onClick={() => navigate("/")}
                />

            </Container>
        </Wrapper>
    );
}

export default PostViewPage;