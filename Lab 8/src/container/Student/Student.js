import React, { useState } from "react";
import Students from "../../component/Students/Students";
import './Student.css';

const Student = () =>{

    const x = "Dr.Din";


    const [name, setName] = useState(x);


    const changeNameHandler = () =>{
setName(document.getElementById("name1").value)
    }

    return(
        <React.Fragment>
            <header>

            </header>
      <section>
            <h1>
                Welcome to WAA
            </h1>
<div class="center"><Students id="101" name={x} major="CS"/></div>
            
<div class="center"><Students id="102" name="Sirak" major="CS"/></div>
<div class="center"> <Students id="103" name="Efrem" major="CS"/></div>

        
        <input type="text" id="name1">
            
            </input>
        
            <button onClick={changeNameHandler}>Change Name</button>
            
        </section>
        </React.Fragment>
  
    );
}

export default Student;
