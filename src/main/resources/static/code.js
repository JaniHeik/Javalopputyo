let list = document.querySelector("ul")

//Getting list of blogs when opening the webpage
getStudents()

//Form button action.
document.querySelector("button")
.addEventListener("click", e =>{
    e.preventDefault()

    //Creating blog object from the form information
    let student = {
        id: document.getElementById("id").value,
        firstName: document.getElementById("firstName").value,
        lastName: document.getElementById("lastName").value
    }

    //Posting the object as JSON to server
    //After posting getting the updated list of blogs from the server
    fetch("http://localhost:8090/addstudent",
        {
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify(student)
        })
        .then(resp => getStudents())
})


//Function for getting all the blogs
function getStudents()
{
    //Empty the list in webpage
    list.innerHTML = ""

    //Fetch all the blogs from the server
    fetch("http://localhost:8090/students")
    .then(response => response.json())
    .then( data =>
    {
        //Create list item of each blog object
        data.forEach(i => {
            let li = document.createElement("li")
            li.innerText = i.message
            list.appendChild(li)
        })
    })
}

