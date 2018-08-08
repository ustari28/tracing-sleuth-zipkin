# Tracing applications
This example is a simple guide to start with tracing yours applications.

## Sleuth
It's a library which allows to follow a request or action. Only need to
add the dependency en your pom:
````xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>
````
set up some properties in application.yml:
````yml
spring:
  sleuth:
    sampler:
      probability: 1.0
 ````
When you run your application, you can watch a trace_id, span_id and follow
your action.

## Zipkin
It's a library, which stores all traces from your applications. Only need to
add the dependency en your pom:
````xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-zipkin</artifactId>
</dependency>
````
set up some properties in application.yml:
````
spring:
  #zipkin:
      # Uncomment to send to zipkin, replacing 192.168.99.100 with your zipkin IP address
      # baseUrl: http://192.168.99.100:9411/
sample:
  zipkin:
    # When enabled=false, traces log to the console. Comment to send to zipkin
    enabled: false
````
Download zipkin from his [site](https://github.com/openzipkin/zipkin/tree/master/zipkin-server).
By default zipkin stores messages in memory, but you can change this behavior starting for example with elasticsearch as storage:
````shell
STORAGE_TYPE=elasticsearch ES_HOSTS=URL_TO_ES java -jar zipkin.jar
````
## Elasticsearch
It's a data store NRT. You can download from his [site](https://www.elastic.co/downloads).
By default you can query to elastisearch in port 9200. Execute the process "bin/elasticsearch".
## Kibana
It's a data visualizer that is connected with elasticsearch. You can download from his [site](https://www.elastic.co/downloads).
By default you can query to kibana in port 5601.
You need to change his configuration file "config/kibana.yml" for correct working of kibana:
````yml
# The URL of the Elasticsearch instance to use for all your queries.
elasticsearch.url: "http://HOST_ES:PORT_ES"
````
Execute the process "bin/kibana".