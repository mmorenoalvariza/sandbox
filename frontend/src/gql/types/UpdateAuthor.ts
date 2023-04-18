/* tslint:disable */
/* eslint-disable */
// @generated
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL mutation operation: UpdateAuthor
// ====================================================

export interface UpdateAuthor_updateAuthor {
  __typename: "Author";
  id: string | null;
  firstName: string | null;
}

export interface UpdateAuthor {
  updateAuthor: UpdateAuthor_updateAuthor | null;
}

export interface UpdateAuthorVariables {
  id: string;
  firstName?: string | null;
  lastName?: string | null;
}
