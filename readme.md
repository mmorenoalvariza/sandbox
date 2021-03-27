#Start minikube
minikube start --memory 5120 --cpus=4
#Install helm and cassandra
sudo snap install helm --classic

helm repo add bitnami https://charts.bitnami.com/bitnami

helm install my-release bitnami/cassandra
#if there is an issue with PVC use another version of minikube or install cassandra with :
persistence.accessMode	PVC Access Mode for Cassandra data volume	[ReadWriteOnce]
IE: helm install my-release \
--set dbUser.user=admin,dbUser.password=password \
bitnami/cassandra
from: https://artifacthub.io/packages/helm/bitnami/cassandra

To get your password run:

export CASSANDRA_PASSWORD=$(kubectl get secret --namespace "default" my-release-cassandra -o jsonpath="{.data.cassandra-password}" | base64 --decode)
To connect to your database from outside the cluster execute the following commands:

kubectl port-forward --namespace default svc/my-release-cassandra 9042:9042 &
cqlsh -u cassandra -p $CASSANDRA_PASSWORD 127.0.0.1 9042
(Need to download and extract cassandra bins)

CREATE KEYSPACE mariano WITH replication = {'class': 'SimpleStrategy','replication_factor':1};

Update the password in application.properties ( echo $CASSANDRA_PASSWORD)

