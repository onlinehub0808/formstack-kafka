###Install Kafka
brew install kafka

##Start Zookeeper and Kafka:
zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties  
kafka-server-start /usr/local/etc/kafka/server.properties  

##Producer Console:
kafka-console-producer --broker-list localhost:9092 --topic test  

##Consumer console:
kafka-console-consumer --bootstrap-server localhost:9092 --topic test --from-beginning  

##Expose public endpoint on localhost:  
https://ngrok.com/download  

ngrok http 8080  
Copy forwarding url

##Configure Formstack Webhook:
Choose a form > Go to Settings > Advanced Settings> Add a Webhook:  
Paste the Forwarding url  
Choose Content Type: JSON  

Submit a form to test!!!