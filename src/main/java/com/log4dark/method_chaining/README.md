## Method Chaining
**Method chaining**, also known as **named parameter idiom**, is a common syntax for invoking multiple method calls in object-oriented programming languages. Each method returns an object, allowing the calls to be chained together in a single statement without requiring variables to store the intermediate results.  

왜 사용하니?  **코드의 간결성**

```java
public class TcpClient {
    public TcpClient open(String ip, int port) throws Excpetion {
        try {
            // TCP connect 
        } catch (Exceptoin e) {
            throw e;
        }
        return this; // 자신의 객체를 반환
    }

    public TcpClient setArg(Sring key, String value) throws Exception {
        try {
            // Send & Receive (Error Check...)
        } catch (Exception e) {
            throw e;
        }
        return this;
    }
}

public class TcpClientExample {
    TcpClient tcpClient = new TcpClient();

    try {
        tcpClient
                .open("127.0.0.1", 7905)
                .setArg("NAME", "dark")
                .setArg("EMAIL", "arthur.jeon@gmail.com");
    } catch (Exception e) {
        // 예외 처리...
    }
}
```

### References
+ https://en.wikipedia.org/wiki/Method_chaining