import React, { ReactNode } from "react";
export interface UserProp {
  id: number;
  firstname: string;
  age: number;
}
function User({ user }: { user: UserProp }) {
  return <div>{JSON.stringify(user)}</div>;
}

export default User;
