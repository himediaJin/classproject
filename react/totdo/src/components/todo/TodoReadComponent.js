import React, {useEffect, useState} from 'react';
import {getTodo} from "../../apis/todoAPI";

function TodoReadComponent({id, moveToList, setResult}) {

    const [todo, setTodo] = useState({});

    useEffect(() => {
        getTodo(id).then(result => {
            setTodo(result)
        })
    })

    return (
        <div></div>
    );
}

export default TodoReadComponent;