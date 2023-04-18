import { useQuery, gql } from "@apollo/client";
import React, { ReactNode } from "react";
import { User, UserProp, Form } from "../user";
import { MOVIES } from "../../gql/user.gql";
import Movie, { MovieProp } from "../movie/Movie";
import { GetMovies_movies } from "../../gql/types/GetMovies";
const ContainerDefaultProps = {
  heading: <h2>Default Heading</h2>,
};

type ContainerProps = {
  children: ReactNode;
} & typeof ContainerDefaultProps;

export function Container({ heading, children }: ContainerProps) {
  const { loading, error, data } = useQuery<{ movies: GetMovies_movies[] }>(
    MOVIES
  );
  if (loading) {
    return <div>Loading...</div>;
  }
  return (
    <div>
      <div>{heading}</div>

      <div>{children}</div>
      {data &&
        data.movies.map((movie) => <Movie key={movie.id} movie={movie} />)}
      <Form />
    </div>
  );
}
Container.defaultProps = ContainerDefaultProps;
