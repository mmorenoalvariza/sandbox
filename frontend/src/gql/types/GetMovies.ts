/* tslint:disable */
/* eslint-disable */
// @generated
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: GetMovies
// ====================================================

export interface GetMovies_movies {
  __typename: "Movie";
  id: string | null;
  title: string | null;
  year: number | null;
  poster: string | null;
  plot: string | null;
}

export interface GetMovies {
  movies: (GetMovies_movies | null)[] | null;
}
