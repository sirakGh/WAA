
import './Students.css';

const Students = (props) =>{

    return (
        <div className = "Students">
            <h3> Student</h3>
            <p>id : {props.id}</p>
            <p>Name : {props.name}</p>
            <p>Major : {props.major}</p>
        </div>
    );
}

export default Students;
