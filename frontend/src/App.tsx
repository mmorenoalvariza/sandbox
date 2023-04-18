import logo from "./logo.svg";
import "./App.css";
import { Bar, Container } from "./components/layout";
import { ApolloClient, InMemoryCache, ApolloProvider } from "@apollo/client";
//const uri = "https://fakeql.com/graphql/c87ab2faea4af4474f56538d0b7264ed";
const uri = "http://localhost:3000/graphql";
const cache = new InMemoryCache();
const client = new ApolloClient({ uri, cache });

function App() {
  return (
    <div className="App">
      <ApolloProvider client={client}>
        <body>
          <div>Div</div>
          <Container>Hello</Container>
        </body>
      </ApolloProvider>
    </div>
  );
}

export default App;
