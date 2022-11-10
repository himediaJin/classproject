let members = []
let memberList

document.addEventListener('DOMContentLoaded', () => {


    const uid = document.querySelector('#userID')
    const pw = document.querySelector('#pw')
    const uname = document.querySelector('#userName')

    const form = document.querySelector('#regForm')

    memberList = document.querySelector('#list')



    form.addEventListener('submit', (event) => {
        
        event.preventDefault();

        const member = {
            userid : uid.value,
            pw : pw.value,
            username : uname.value
        }

        members.push(member)

        members.forEach(console.log)

        memberList.innerHTML = '';


        

        const newTr = `
    <tr>
        <th>순번(index)</th>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>이름</th>
        <th>관리</th>
    </tr>
        `
        memberList.innerHTML = newTr;


        // 배열의 개수만큼 tr
        members.forEach((member, index) => {

            const newMemberTr = document.createElement('tr')
            newMemberTr.setAttribute('member-index', index)


            let memberTr = `
            
                <td>${index+1}</td>
                <td>${member.userid}</td>
                <td>${member.pw}</td>
                <td>${member.username}</td>
  
                `

            newMemberTr.innerHTML = memberTr

            // <td> 수정 | <a member-index="${index}")" onclick="delMember(index)">삭제</a> </td>

            const newTd = document.createElement('td')
            newTd.textContent = ' 수정 | '

            const newLink = document.createElement('a')
            newLink.textContent = '삭제'
            //newLink.setAttribute('member-index', index)

            newTd.appendChild(newLink)
            newMemberTr.appendChild(newTd)

            newLink.addEventListener('click', (event) => {
                console.log('delete ...')
                delMember(index)
            })

            memberList.appendChild(newMemberTr)      

        })
    })







})

function delMember(index) {

    members.splice(index,1)
    const delEm = document.querySelector(`tr[member-index="${index}"]`)
    memberList.removeChild(delEm)

    /* console.log(members)


    memberList.innerHTML = '';


        

        const newTr = `
    <tr>
        <th>순번(index)</th>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>이름</th>
        <th>관리</th>
    </tr>
        `
        memberList.innerHTML = newTr;


        // 배열의 개수만큼 tr
        members.forEach((member, index) => {

            const newMemberTr = document.createElement('tr')


            let memberTr = `
            
                <td>${index+1}</td>
                <td>${member.userid}</td>
                <td>${member.pw}</td>
                <td>${member.username}</td>
                <td> 수정 | <a member-index="${index}" onclick="delMember(${index})">삭제</a> </td>            
            
            `

            newMemberTr.innerHTML = memberTr


            memberList.appendChild(newMemberTr)      

        }) */
}