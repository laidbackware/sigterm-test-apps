# sigterm-test-apps

The repo has a collection of apps built to demonstrate SIGTERM handling behaviours.

## Testing loop

To test an app with multiple outstanding requests whilst it is being restarted.

```
while true; do   
  curl -k https://<app-fqdn>/sleep &   
  sleep 5;
done
```