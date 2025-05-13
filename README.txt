
docker-compose down -v
docker-compose up --build -d
docker ps

docker exec -it <kafka-container-id> bash


kafka-topics.sh --create --topic demo-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1