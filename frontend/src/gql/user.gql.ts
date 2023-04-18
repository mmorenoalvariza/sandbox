import {gql} from "@apollo/client";
export const USERS = gql`
  query GetAuthors {
    authors {
      id
      firstName
    }
  }
`;

export const BOOKS = gql`
  query GetBooks {
      books {
          id, name, pageCount
      }
  }`

  export const MOVIES = gql`
  query GetMovies {
      movies {
          id, title, year, poster, plot
      }
  }`

export const AUTHOR_MUTATION = gql`
  mutation UpdateAuthor($id: ID!, $firstName: String, $lastName: String) {
    updateAuthor(id: $id, firstName: $firstName, lastName: $lastName) {
      id
      firstName
    }
  }
`;

type UpdateUserInput = {
    firstname: String
    age: number
}
