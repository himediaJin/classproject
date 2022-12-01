<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>

    <%-- bootstrap v5.2 --%>
    <link  href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">


</head>
<body>

<%--nav include--%>
<%@ include file="/WEB-INF/views/include/nav.jsp"%>


<main class="p-2">

    <div class="card">
        <div class="card-header">
            <h3 class="title">Basic Board Article Read</h3>
        </div>
        <div class="card-body">


                <div class="mb-3">
                    <label for="title" class="form-label">제목</label>
                    <input type="text" class="form-control" id="title" name="title" value="${board.title}" readonly>
                    <%--<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>--%>
                </div>
                <div class="mb-3">
                    <label for="content" class="form-label">내용</label>
                    <textarea class="form-control" id="content" name="content" rows="3"  readonly>${board.content}</textarea>
                </div>
                <div class="mb-3">
                    <label for="writer" class="form-label">작성자</label>
                    <input type="text" class="form-control" id="writer" name="writer" value="${board.writer}"  readonly>
                </div>
                <div class="mb-3">
                    <label for="regdate" class="form-label">등록일</label>
                    <input type="text" class="form-control" id="regdate" name="regdate" value="${board.regdate}"  readonly>
                </div>
                <div class="mb-3">
                    <label for="updatedate" class="form-label">수정일</label>
                    <input type="text" class="form-control" id="updatedate" name="updatedate" value="${board.updatedate}"  readonly>
                </div>

                <div class="text-end m-3">
                    <a href="/board/edit?bno=${board.bno}" class="btn btn-warning" role="button">수정</a>
                    <a href="/board/delete?bno=${board.bno}" class="btn btn-danger" role="button">삭제</a>
                    <a href="/board/list" class="btn btn-primary" role="button">리스트</a>
                </div>

        </div>

        <div class="card m-3">
            <div class="card-header">
                <h3 class="title">Article Reply</h3>
            </div>
            <div class="border-bottom p-3">
                <h5 class="title my-2">댓글 작성</h5>
                <div class="mb-3">
                    <label for="replyer" class="form-label">작성자</label>
                    <input type="text" class="form-control" id="replyer" name="replyer">
                </div>
                <div class="mb-3">
                    <label for="reply" class="form-label">내용</label>
                    <textarea class="form-control" id="reply" name="reply" rows="3"></textarea>
                </div>
                <div>
                    <input type="reset" value="등록" id="btn_reply" class="form-control btn btn-primary">
                </div>
            </div>
            <div class="card-body">
                <table class="table ">
                    <tbody id="replyList">

                    </tbody>
                </table>
            </div>
        </div>

    </div>



</main>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<script>

    let replyList;

    document.addEventListener('DOMContentLoaded', () => {

        replyList = document.querySelector('#replyList')
        const btn_reply = document.querySelector('#btn_reply')

        // 비동기 통신 : 댓글 리스트 가져오기
        axios.get('/reply')
            .then(res => {
                console.log('res', res.data)
                // 태그 캐스팅 -> 데이터 변경

                addReplyRow(res.data)

            })
            .catch(err => console.log(err))


        ////////////////////////////////////

        btn_reply.addEventListener('click', ()=>{

            const payload = {
                bno : ${param.bno},
                reply : document.querySelector("#reply").value,
                replyer : document.querySelector("#replyer").value,
            }

            console.log(payload)

            // 비동기 통신 : 댓글 등록
            axios.post('/reply', payload)
                .then(res => {
                    console.log('res', res.data)
                    const newReply = res.data

                    const tr_length = document.querySelectorAll('#replyList>tr').length
                    const trIndex = Number(document.querySelectorAll('#replyList>tr')[tr_length-1].getAttribute('tr-index'))+1
                    const newTR = document.createElement('tr')
                    let str = '' // '<td class="col-1">'+trIndex+'</td>'
                    str += '<td class="col-2">'+newReply.replyer+'</td>'
                    str += '<td class="col">'+newReply.reply+'</td>'
                    str += '<td class="col-2">'+newReply.replydate+'</td>'
                    str += '<td class="col-1"><a href="javascript: delTR('+trIndex+')" class="badge bg-danger text-decoration-none">x</a></td>'
                    newTR.innerHTML = str
                    newTR.setAttribute('class', 'fs-6 text-center')
                    newTR.setAttribute('tr-index', trIndex)
                    replyList.appendChild(newTR)

                })
                .catch(err => console.log(err))
        })
    })

    function addReplyRow(list){

        console.log(list)

        list.forEach((reply, index) => {
            const newTR = document.createElement('tr')
            let str = '' // <td class="col-1">'+index+'</td>'
            str += '<td class="col-2">'+reply.replyer+'</td>'
            str += '<td class="col">'+reply.reply+'</td>'
            str += '<td class="col-2">'+reply.replydate+'</td>'
            str += '<td class="col-1"><a href="javascript: delTR('+index+')" class="badge bg-danger text-decoration-none">x</a></td>'
            newTR.innerHTML = str
            newTR.setAttribute('class', 'fs-6 text-center')
            newTR.setAttribute('tr-index', index)
            replyList.appendChild(newTR)
        });
    }

    function delTR(index){
        console.log('index', index)

        if(!confirm('댓글을 삭제하시겠습니까?')){
            return;
        }

        // 비동기 통신 : 데이터 삭제
        axios.delete('/reply/'+index)
            .then(res => {
                console.log('res', res.data)
                // 화면에서 행 삭제
                const delTR = document.querySelector('tr[tr-index="'+index+'"]')
                replyList.removeChild(delTR)
            })
            .catch(err => console.log(err))
    }

</script>







</body>
</html>