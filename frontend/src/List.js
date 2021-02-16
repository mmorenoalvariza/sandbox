import axios from "axios";
import React, { useState, useEffect } from "react";
const urlLocal = "/api/books";
const List = () => {
  const [list, setList] = useState([]);
  useEffect(() => {
    const getData = async () => {
      const bookResult = await axios.get(urlLocal);
      setList(bookResult.data);
    };
    getData();
  }, []);

  return (
    <ul>
      {list.map((item) => (
        <li key={item.id}>{`ID: ${item.id} , Title: ${item.title}`}</li>
      ))}
    </ul>
  );
};

export default List;
