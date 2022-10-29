# 🎯 SpringBoot-Redis-Artemis-Smtp ?

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api19.jpg">

# 📌 The goal of the project ?

* Twitter uygulamasının mantığını kullanarak örnek proje yapmak istedim.
* Twitter'da bir gündem oluşuyor ve bu saatler içinde mesajlara boğuluyor.
* İşte bende tam bu noktada gelen tweet'leri bir kuyruk kullanarak bir service gönderiyorum.
* Bu service, redis'i kullanarak kuyruktan gelen mesajları önbelleğe alıyor.
* Redis'i kullanma amacım, hızlı bir şekilde tüm mesajları çekmek.
* Gelen mesajlar ilk başta postgresql db'sine kayıt oluyor. Sonra redis'e gidiyor.
* Birde mail servisim var. Bu servis 3 dk bir toplam gelen mesaj sayısını mail aracılığıyla size ulaştırıyor.

## 📌 docker-compose.yaml

```yaml
docker-compose up --build -d
```

```yaml
docker-compose down -v
```

## 📌 Maven Dependencies

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-artemis</artifactId>
</dependency>
```

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```

```xml

<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
</dependency>
```

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>
```
## 🎯 Api Package ?

* Swagger service : http://localhost:8080/swagger-ui.html

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api20.png">

* Postgresql DB :

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api12.png">

* Get : http://localhost:8080/user/getUserList

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api13.png">

* Activemq service : http://localhost:8161/console/auth/login

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api16.png">

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api11.png">

## 🎯 Redis Package ?

* Swagger service : http://localhost:8081/swagger-ui.html

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api21.png">

* Redis DB : http://localhost:8001/redis-stack/browser

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api14.png">

* Get : http://localhost:8081/redis/getUserList

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api15.png">


## 🎯 Mail Package ?

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api18.png">

<img src="https://github.com/rasitesdmr/SpringBoot-Redis-Artemis-Smtp/blob/master/image/api17.png">


