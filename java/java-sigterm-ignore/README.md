# java-sigterm-ignore

This sample app does not have any SIGTERM handling behaviour and inserts a 20 delay before responding to each request.

After Spring Boot gives a ~8 second grace period, all open sessions will be terminated, which manifests in app logs as "endpoint_failure".

## Dependencies
1. maven

## Cloud foundry

```sh
./mvnw clean install
cf push
```

## Generating test load

Asynchronous curl tests can be used to prove out the bahaviour.

Update `APP_FQDN` to the apps full hostname.

```sh
APP_FQDN=java-sigterm-ignore.apps.192.168.1.229.nip.io
while true; do  exec curl -k https://${APP_FQDN}/sleep &   sleep 0.1; done
```