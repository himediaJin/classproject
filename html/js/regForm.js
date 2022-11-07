document.addEventListener('DOMContentLoaded', () => {
    const regForm = document.querySelector('#regForm')

    regForm.addEventListener('submit', (event) => {
        console.log('check')

        let userid = document.querySelector('#userid')
        let pw = document.querySelector('#pw')
        let repw = document.querySelector('#repw')
        let username = document.querySelector('#username')
        let year = document.querySelector('#year')
        let month = document.querySelector('#month')
        let day = document.querySelector('#day')
        let gender = document.querySelector('#gender')
        let email = document.querySelector('#email')
        let tel = document.querySelector('#tel')

        // String search => matching return 0 
        console.log(userid.value.search(/[a-zA-Z0-9]/i))
        console.log(/[a-zA-Z0-9]/.test(userid.value))

        event.preventDefault();
        event.stopPropagation();

    })
})