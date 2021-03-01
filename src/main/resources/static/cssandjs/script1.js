function compute() {
    let input = document.getElementById("square1").value;
      let number =0;
      
    if (input == "") {
        alert("Please, enter a number!");
        return false;
    }
    else {
        number = parseInt(input);

    number = number*50;

    alert(`Your course price is $${number}`); 
    }  }
