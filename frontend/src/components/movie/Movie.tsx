import React, { ReactNode } from "react";
import { GetMovies_movies } from "../../gql/types/GetMovies";
export interface MovieProp {
  id: number;
  title: string;
  year: number;
}
function Movie({ movie }: { movie: GetMovies_movies }) {
  return (
    <>
      <div>Title: {movie.title}</div>
      <div>
        <img src={movie.poster as string} />
      </div>
    </>
  );
}

export default Movie;
