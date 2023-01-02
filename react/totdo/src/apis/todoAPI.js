import axios from "axios";

// todo 등록
export  const postTodo = async (todo) => {
    // todo => {title:'청소', writer:'호날두', coomplete:false}
    const res = await axios.post('http://localhost/todos', todo)
    return res.data
}

// Todo List
export  const getTodoList = async () => {
    const res = await axios.get('http://localhost/todos')
    return res.data
}

export const getTodo = async (id) => {
    const res = await axios.get(`http://localhost/todos/${id}`)
    return res.data
}

export const deleteTodo = async (id) => {
    const res = await axios.delete(`http://localhost/todos/${id}`)
    return res.data
}

export const putTodo = async (todo) => {
    const res = await axios.put(`http://localhost/todos/${todo.id}`, todo)
    return res.data
}