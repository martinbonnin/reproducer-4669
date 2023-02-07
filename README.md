# Sample: Apollo Kotlin 3 with multiple modules and services and Android app

This is a minimalist sample of a project with several modules and services
using [Apollo Kotlin 3](https://www.apollographql.com/docs/kotlin), and an Android app.

It contains 3 modules:

```mermaid
  graph TD;
      app-->graphqlSchema;
      app-->feature1;
      app-->feature2;
      feature1-->graphqlSchema;
      feature2-->graphqlSchema;
```

- `graphqlSchema`
  - Contains the GraphQL schema for 2 services
  - Defines 1 query for each service
  - Is an Android library module
- `feature1`
  - Depends on `graphqlSchema`
  - Defines 1 additional query for each service
  - Is an Android library module
- `feature2`
  - Depends on `graphqlSchema`
  - Defines 1 additional query for each service
  - Is an Android library module
- `app`
  - Depends on `graphqlSchema`, `feature1` and `feature2`
  - Is an Android app module
