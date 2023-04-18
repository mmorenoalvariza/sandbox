/* tslint:disable */
/* eslint-disable */
// @generated
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: GetAuthors
// ====================================================

export interface GetAuthors_authors {
  __typename: "Author";
  id: string | null;
  firstName: string | null;
}

export interface GetAuthors {
  authors: (GetAuthors_authors | null)[] | null;
}
