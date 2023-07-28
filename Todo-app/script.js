// Created variables to access the input  and list container html element by id
const inputBox = document.getElementById("input-box"); 
const listContainer = document.getElementById("list-container")




// The function addTask() is to add or append each todo list in the list container after a user enters value and click on add button

function addTask(){
    if(inputBox.value === ''){
        alert("Please write something!")
    }
    else{
        let li= document.createElement("li");
        li.innerHTML = inputBox.value;
        listContainer.appendChild(li);
        let span = document.createElement("span");
        span.innerHTML="\u00d7";
        li.appendChild(span);
    }
    inputBox.value="";
    saveData();
}


// This is to toggle the check box (Checked - Unchecked)

listContainer.addEventListener("click", function(e){

    if(e.target.tagName === "LI"){
        e.target.classList.toggle("checked");
        if(e.target.classList === "checked"){
            saveData();
        }
    }
    else if(e.target.tagName ==="SPAN"){
        e.target.parentElement.remove();
        saveData();
    }


},false);


// This is to save the data in the browser that the users wants to add n the todo list
// That is even after refreshing the list items remains same
function saveData(){
    localStorage.setItem("data", listContainer.innerHTML);
}

// This is to show the data that is saved using the function saveData()
function showSavedTask(){
    listContainer.innerHTML=localStorage.getItem("data");
}
showSavedTask();