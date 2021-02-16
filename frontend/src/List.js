import axios from 'axios';
import React, {useState, useEffect} from 'react';
const url = 'foo:8080/books';
const urlLocal = 'api/books';
const List = () => {
    const [list, setList] = useState([]);
    useEffect(() =>{
        const getData = async () =>{
        const data = await axios.get(urlLocal);
        setList(data);
        };
        getData();
    },[])

    return ( <ul>
        {list.map(item => <li key={item.id}>{`ID: ${item.id} , Name: ${item.name}`}</li>)}
    </ul> );
}
 
export default List;