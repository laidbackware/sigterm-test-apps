# java-sigterm-interupt

This sample app will insert a 60 second delay after receiving SIGTERM.

By default Cloud Foundry will wait 10 seconds and terminate the app, meaning this app my be terminated by the platform to be stopped.

## Dependencies
1. maven

## Cloud foundry

```sh
./mvnw clean install
cf push
```