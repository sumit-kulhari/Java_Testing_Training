function confirm_form()
{
    let s = document.forms["myForm"]["fname"].value;
    if(s.length==0){
        alert("Length of name cannot be zero");
        return false
    }
    else{
        console.log(s)
        console.log("The length of name is good");
    }

    let x = document.forms["myForm"]["lname"].value;
    if(x.length==0){
        alert("Length of last name cannot be zero")
    }
    else{
        console.log("The length of name is good");
    }

    if(document.getElementById("male").checked){
        alert("Congratulations!!! You are a Male")
    }

    if(document.getElementById("female").checked){
        alert("Congratulations!!! You are a female")
    }
}
