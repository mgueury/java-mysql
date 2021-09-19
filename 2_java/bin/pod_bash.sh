POD=$(kubectl get pod -l app=java-mysql -o jsonpath="{.items[0].metadata.name}")
echo $POD
kubectl exec --stdin --tty $POD -- /bin/bash
