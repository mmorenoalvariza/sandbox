import React, { useState } from "react";
import TextField from "@material-ui/core/TextField";
import { Button } from "@material-ui/core";
import { gql, useMutation } from "@apollo/client";
import { UserProp } from ".";
import { AUTHOR_MUTATION } from "../../gql/user.gql";
import {
  UpdateAuthorVariables,
  UpdateAuthor,
} from "../../gql/types/UpdateAuthor";

export default function Form() {
  const [name, setName] = useState("Pepe");
  const [age, setAge] = useState(1);
  const [id, setId] = useState("1");

  const [updateAuthor, vars] = useMutation<UpdateAuthor, UpdateAuthorVariables>(
    AUTHOR_MUTATION
  );

  const onSave = async (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    const user = await updateAuthor({
      variables: { id, firstName: name, lastName: "lall" },
    });
    console.log(user.data?.updateAuthor);
  };
  console.log(vars);
  return (
    <form noValidate autoComplete="off" onSubmit={onSave}>
      <div>
        <TextField
          id="outlined-basic"
          label="Id"
          value={id}
          onChange={(e) => setId(e.target.value)}
          variant="outlined"
        />
      </div>
      <div>
        <TextField
          id="outlined-basic"
          label="Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
          variant="outlined"
        />
      </div>
      <div>
        <TextField
          id="outlined-basic"
          label="Age"
          value={age}
          onChange={(e) => setAge(parseInt(e.target.value))}
          variant="outlined"
        />
      </div>
      <Button variant="contained" color="primary" type="submit">
        Submit
      </Button>
      {JSON.stringify(vars.data)}
    </form>
  );
}
