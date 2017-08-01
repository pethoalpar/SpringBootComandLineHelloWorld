<h1>Spring Boot command line hello world</H1>

<h3>pom.xml</h3>

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
    <version>1.5.6.RELEASE</version>
</dependency>
```

<h3>application.properties</h3>

```properties
name=Alpar
```
<h3>HelloService.java</h3>

```java
@Service
public class HelloService {

    @Value("${name}")
    private String name;

    public String getMessage(){
        return "Hello "+name;
    }
}
```

<h3>Main.java</h3>

```java
@SpringBootApplication
public class Main implements CommandLineRunner{

    @Autowired
    private HelloService helloService;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Main.class);
        app.run(args);
    }

    public void run(String... strings) throws Exception {
        System.out.println(helloService.getMessage());
    }
}
```