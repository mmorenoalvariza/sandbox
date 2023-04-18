/* tslint:disable */
/* eslint-disable */
// @generated
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: GetBooks
// ====================================================

export interface GetBooks_books {
  __typename: "Book";
  id: string | null;
  name: string | null;
  pageCount: number | null;
}

export interface GetBooks {
  books: (GetBooks_books | null)[] | null;
}
