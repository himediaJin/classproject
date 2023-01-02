import React, {useState} from 'react';
import {Dialog, DialogTitle, Grid, Paper} from "@mui/material";
import PageLayout from "../../layout/PageLayout";
import {useNavigate, useParams} from "react-router-dom";
import Typography from "@mui/material/Typography";

function TodoReadPage(props) {

    const {cmd, id} = useParams()
    const [msg, setMsg] = useState(null)
    const navigate = useNavigate()

    const setResult = (result) => {
        setMsg(result)
    }

    const closeAndMove = () => {
        setMsg(null)

        navigate("/todo/list")
    }

    const getComponent = () => {
        if(cmd === 'read'){
            return
        } else if(cmd === 'modify'){
            return null
        }
        return  <></>
    }

    return (
        <PageLayout title={'Todo Read Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p:2, display:'flex',flexDirection: 'column'}}>
                    <h1>Todo Read Page</h1>
                    <Typography variant={'h3'}>{id}</Typography>
                </Paper>
            </Grid>

            <Dialog open={msg !== null}
                    onClose={closeAndMove}
                    aria-labelledby="alert-dialog-title"
                    aria-describedby="alert-dialog-description"
                    id="alert-dialog-title"
            >
                <DialogTitle>처리 결과</DialogTitle>
                <Typography variant={'h6'}>{msg}</Typography>
            </Dialog>

        </PageLayout>
    );
}

export default TodoReadPage;