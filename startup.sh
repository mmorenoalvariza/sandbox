#startup
minikube start
export CASSANDRA_PASSWORD=$(kubectl get secret --namespace default my-release-cassandra -o jsonpath="{.data.cassandra-password}" | base64 --decode)
echo #CASSANDRA_PASSWORD
kubectl port-forward --namespace default svc/my-release-cassandra 9042:9042
cqlsh -u cassandra -p $CASSANDRA_PASSWORD 127.0.0.1 9042

#minikube dashboard