import React from 'react';
import {Button, Grid, Paper} from "@mui/material";
import PageLayout from "../../layout/PageLayout";
import {useNavigate, useSearchParams} from "react-router-dom";
import Typography from "@mui/material/Typography";
import TodoListComponent from "../../components/todo/TodoListComponent";

function TodoListPage(props) {

    const [searchParams, setSearchParams] = useSearchParams()
    const navigate = useNavigate()

    const page = searchParams.get("page")
    const size = searchParams.get("size")

    const clickMove = (page, size) => {
        setSearchParams({page, size})
    }

    const clickRegister = () => {
        navigate("/todo/register")
    }

    const moveToRead = (id) =>{
        const pageNum = page || 1
        const sizenum = size || 10
        navigate({
            pathname: `/todo/read/${id}`,
            search: `?page=${pageNum}&size=${sizenum}`
        })
    }

    const query = {page, size}

    return (
        <PageLayout title={'Todo List Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p: 2, display: 'flex', flexDirection: 'column'}}>
                    <h1>Todo List Page</h1>

                    <TodoListComponent query={query} moveToRead={moveToRead}></TodoListComponent>


                    <Typography variant={'h5'}>page : {page}</Typography>
                    <Typography variant={'h5'}>size : {size}</Typography>
                    <Button onClick={clickRegister} >등록</Button>
                    <Button onClick={() => clickMove(3, 3)} >Move</Button>
                </Paper>
            </Grid>
        </PageLayout>
    );
}

export default TodoListPage;