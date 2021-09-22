This is a sample spring boot rest API with one get endpoint as "am-i-lucky".
This application is deployed in a local kubernates cluster.

First we need to build the project using maven.
Then we need to create the docker image using  the Dockerfile which is in the project.
docker image build -t hasitha1990/springboot-k8s-ex1:v1 .

By mentioning the dokcer hub id (hasitha1990) , I can push this image into docker hub.
After  docker image successfully built, we need to push that into dockerhub.

For creating a kubernates cluster, Here I am using minikube. (First we have to install minikube in our local machine)
Start windows power shell and type 'minikube start'
By above command minikube is creating a single node cluster in the our local machine.

Then we need to create a kubernates deployment.
kubectl create deployment springboot-k8s-ex1 --image=hasitha1990/springboot-k8s-ex1:v1

Then we need to create a service using above  deployment
kubectl expose deployment springboot-k8s-ex1 --type=NodePort  --target-port=8080 --port=80

Using below command we can get the  url  of above service for accessing in our local machine.
minikube service springboot-k8s-ex1 --url
