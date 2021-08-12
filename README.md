# CS590-SoftwareArchitecture

## Issues that might be caused by elastic installation (linux os)
- [installation guide](https://www.elastic.co/guide/en/elasticsearch/reference/current/getting-started.html)
- [optinoal installation](https://phoenixnap.com/kb/how-to-install-elk-stack-on-ubuntu)
- [THE COMPLETE GUIDE TO THE ELK STACK](https://logz.io/learn/complete-guide-elk-stack/#intro)
- [SO](https://stackoverflow.com/questions/58656747/elasticsearch-job-for-elasticsearch-service-failed)
- [discuss.elastic.co - 1](https://discuss.elastic.co/t/unable-to-start-elasticsearch-as-service/178440)
- [discuss.elastic.co - 2](https://discuss.elastic.co/t/java-lang-illegalstateexception-unable-to-access-path-data-var-lib-elasticsearch/238456)

```
461  sudo apt-get install nginx
  462  sudo wget –qO – https://artifacts.elastic.co/GPG-KEY-elasticsearch | sudo apt-key add –
  463  sudo apt-get install apt-transport-https
  464  echo “deb https://artifacts.elastic.co/packages/7.x/apt stable main” | sudo tee –a /etc/apt/sources.list.d/elastic-7.x.list
  465  sudo update 
  466  sudo apt update
  467  sudo apt-get update
  468  sudo nano /etc/elasticsearch/
  469  sudo cd /etc/elasticsearch/
  470  cd /etc/elasticsearch/
  471  sudo cd /etc/elasticsearch/
  472  sudo systemctl start elasticsearch.service
  473  systemctl status elasticsearch.service 
  474  sudo /etc/init.d/elasticsearch start
  475  systemctl status elasticsearch.service 
  476  sudo /etc/init.d/elasticsearch start
  477  systemctl status elasticsearch.service 
  478  sudo apt-get install elasticsearch
  479  sudo systemctl start elasticsearch.service
  480  journalctl -xe
  481  sudo systemctl start elasticsearch.service
  482  sudo systemctl start elasticsearch
  483  sudo systemctl status elasticsearch
  484  cat /var/log/elasticsearch/elasticsearch.log
  485  sudo cat /var/log/elasticsearch/elasticsearch.log
  486  sudo mkdir /var/lib/elasticsearch
  487  sudo systemctl status elasticsearch
  488  restart elasticsearch
  489  sudo restart elasticsearch
  490  sudo systemctl start elasticsearch
  491  sudo systemctl status elasticsearch
  492  sudo cat /var/log/elasticsearch/elasticsearch.log
  493  sudo chown -R 777 /var/lib/elasticsearch
  494  sudo systemctl start elasticsearch
  495  sudo systemctl status elasticsearch
  496  sudo cat /var/log/elasticsearch/elasticsearch.log
  497  sudo cd /var/lib/elasticsearch/
  498  ls -la
  499  sudo chown -R elasticsearch:elasticsearch /var/lib/elasticsearch
  500  sudo systemctl start elasticsearch
  501  sudo systemctl status elasticsearch

```

for running and stopping ELK service in linux
```
  503  sudo systemctl status logstash
  504  sudo systemctl start elasticsearch
  505  sudo systemctl stop logstash
  506  sudo systemctl stop kibana.service 
  507  sudo systemctl status logstash
  508  sudo systemctl status elasticsearch.service 
  509  sudo systemctl status kibana.service 
```

logstash configurations

```
# Sample Logstash configuration for creating a simple
# Beats -> Logstash -> Elasticsearch pipeline.

input {
  file {
    type => "java"
    path => "/home/kidusmt/Documents/CS590-SA/elk-linux/spring-boot-elk2.log"
    codec => multiline {
      pattern => "^%{YEAR}-%{MONTHNUM}-%{MONTHDAY} %{TIME}.*"
      negate => "true"
      what => "previous"
    }
  }
  beats {
    port => 5044
  }
}

output {
  stdout {
    codec => rubydebug
  }
  file {
    path => "/home/kidusmt/Documents/CS590-SA/elk-linux/testlog.log"
    create_if_deleted => true
  }
  elasticsearch {
    hosts => ["http://localhost:9200"]
    index => "%{[@metadata][beat]}-%{[@metadata][version]}-%{+YYYY.MM.dd}"
    #user => "elastic"
    #password => "changeme"
  }
}

```

## ActiveMQ
- [Installation Guide for ActiveMQ](https://websiteforstudents.com/how-to-install-apache-activemq-on-ubuntu-18-04-16-04/)
- [very nice solution for data serialization problem in Receiver Service](https://stackoverflow.com/a/45527148/60217400)

## [Spring Awesome](https://github.com/ThomasVitale/awesome-spring)

## [RabbitMQ - Tutorials](https://github.com/rabbitmq/rabbitmq-tutorials)


## [ELK Stack Configuration with FileBeats and Kafka Stream](https://logz.io/blog/deploying-kafka-with-elk/)

```
For creating topic with kafka stream
./kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka_logstash

// starting and stopping: logstash, kibana and elasticsearch

  772  sudo systemctl start logstash.service
  773  sudo systemctl status logstash.service
  774  sudo systemctl status elasticsearch.service 
  775  sudo systemctl status logstash.service
  
  
// terminal command for starting/stopping: zookeeper, kafka-server and KafkaMagic
  714  sudo bin/zookeeper-server-start.sh config/zookeeper.properties
  715  pwd
  716  sudo bin/kafka-server-start.sh config/server.properties
  717  pwd
  718  sudo chmod 777 KafkaMagic
  719  sudo ./KafkaMagic
  
  
// for starting zipking tracing:
kidusmt@kmt:~/Documents/CS590-SA/zipkin$  sudo java -jar zipkin-server-2.23.2-exec.jar
```

## [Logstash Tutorial: How to Get Started](https://logz.io/blog/logstash-tutorial/)
## [just-enough-kafka-for-the-elastic-stack](https://www.elastic.co/blog/just-enough-kafka-for-the-elastic-stack-part1)
