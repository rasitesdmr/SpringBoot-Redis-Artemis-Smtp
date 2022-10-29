# 🎯 SpringBoot-Redis-Artemis-Smtp ?

<img src="">

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

## 📌 Thymeleaf Maven Dependencies

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

<img src="">

* Postgresql DB :

<img src="">

* Get : http://localhost:8080/user/getUserList

<img src="">

* Activemq service : http://localhost:8161/console/auth/login

<img src="">

<img src="">

## 🎯 Redis Package ?

* Swagger service : http://localhost:8081/swagger-ui.html

<img src="">

* Redis DB : http://localhost:8001/redis-stack/browser

<img src="">

* Get : http://localhost:8081/redis/getUserList

<img src="">


## 🎯 Mail Package ?

<img src="">

<img src="">


