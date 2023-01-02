import React, {useState} from 'react';
import Typography from "@mui/material/Typography";
import {Button, TextField} from "@mui/material";
import Box from "@mui/material/Box";

function TodoRegisterComponent(props) {

    const [todo, setTodo] = useState({title:'', writer:'', complete:false})

    const changeTodo = (e) => {

        const attr = e.target.name
        const value = e.target.value

        todo[attr] = value;
        //console.log(todo)
        setTodo({...todo})
    }

    return (
    <>
        <Typography variant={'h4'} sx={{p:3}}>Todo Register Page</Typography>

        <Box sx={{p:1}}>
            <TextField
                variant="outlined"
                fullWidth
                name={'title'}
                label={'title'}
                onChange={(e) => changeTodo(e)}
            ></TextField>
        </Box>
        <Box sx={{p:1}}>
            <TextField
                variant="outlined"
                fullWidth
                name="writer"
                label="writer"
                onChange={(e) => changeTodo(e)}
            ></TextField>
        </Box>

        <Box sx={{p:1}} display={"flex"} justifyContent={"right"} >
            <Button variant={"contained"}>등록</Button>
        </Box>

    </>
    );
}

export default TodoRegisterComponent;