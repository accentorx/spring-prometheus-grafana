```shell
docker run --add-host=host.docker.internal:host-gateway -d -p 9090:9090 -v /home/aphe1/IdeaProjects/springtest/prometheus/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus 
```
```shell
docker run --add-host=host.docker.internal:host-gateway -d -p 3000:3000 grafana/grafana
```

http://localhost:3000/datasources
http://host.docker.internal:9090 - HTTP URL 

http://localhost:3000/dashboard/import 
4701 - JVM Micrometer id