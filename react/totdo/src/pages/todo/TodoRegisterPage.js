import React from 'react';
import {Grid, Paper} from "@mui/material";
import PageLayout from "../../layout/PageLayout";
import {useParams} from "react-router-dom";
import Typography from "@mui/material/Typography";
import TodoRegisterComponent from "../../components/todo/TodoRegisterComponent";

function TodoRegisterPage(props) {



    return (
        <PageLayout title={'Todo Register Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p:2, display:'flex',flexDirection: 'column'}}>
                    <TodoRegisterComponent></TodoRegisterComponent>
                </Paper>
            </Grid>
        </PageLayout>
    );
}

export default TodoRegisterPage;