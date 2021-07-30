# CS590-SoftwareArchitecture

## issues might caused by elastic installation (linux os)
- [installation guide](https://www.elastic.co/guide/en/elasticsearch/reference/current/getting-started.html)
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
