sh mvnw install
sh mvnw spring-boot:build-image
docker tag sandbox:0.0.1-SNAPSHOT mmorenoalvariza/sandbox
docker push mmorenoalvariza/sandbox
kubectl delete service sandbox
kubectl delete deployment sandbox
kubectl apply -f deployment.yaml
minikube service sandbox