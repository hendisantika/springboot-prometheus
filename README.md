# springboot-prometheus

##### Setup Prometheus Server UI
1. Run this project by this command : `git clone https://github.com/hendisantika/springboot-prometheus.git`
2. Build docker image 
    ```jshelllanguage
    cd springboot-prometheus
    docker build -t my-prometheus .
    ```
3. Run docker image
    
    `docker run -p 9090:9090 my-prometheus`
4. Open Prometheus UI Go to your browser and type http://localhost:9090/targets
