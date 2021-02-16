yarn build
docker build -t frontend .
docker tag frontend mmorenoalvariza/frontend
docker push mmorenoalvariza/frontend

kubectl delete service frontend
kubectl delete deployment frontend
kubectl apply -f deployment.yaml
minikube service frontend