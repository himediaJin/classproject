import React, { useState } from "react";

function SignUp(props){

    const [userName, setUserName] = useState('손흥민')
    const [gender, setGender] = useState('남자')

    return (
        <form onSubmit={(event) => {
            event.preventDefault();
            alert(`이름 : ${userName}, 성별 : ${gender}`)
        }}>
            <label>
                이름 : 
                <input
                    type="text"
                    value={userName}
                    onChange={(event) => {
                        setUserName(event.target.value)
                    }}
                />
            </label>
            <br/>
            <label>
                성별 : 
                <select
                    value={gender}
                    onChange={(event) => {
                        setGender(event.target.value)
                    }}
                >
                        <option value="남자">남자</option>
                        <option value="여자">여자</option>
                </select>
            </label>
            <br/>
            <button type="submit">제출</button>                    

        </form>
    )

}

export default SignUp