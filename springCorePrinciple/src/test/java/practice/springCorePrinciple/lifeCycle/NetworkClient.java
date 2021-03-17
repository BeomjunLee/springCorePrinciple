package practice.springCorePrinciple.lifeCycle;

import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Setter
public class NetworkClient{

    private String url;

    //객체를 생성할 때 connect, call 호출
    public NetworkClient() {
        System.out.println("생성자 호출 url = " + url);
        connect();
        call("초기화 연결 메세지");
    }

    //서비스 시작시 호출
    public void connect() {
        System.out.println("connect : " + url);
    }

    //연결이 되면 call 호출 가능
    public void call(String message) {
        System.out.println("call : " + url + " message = " + message);
    }

    //서비스 종료시 호출
    public void disconnect() {
        System.out.println("disconnect = " + url);
    }

    //의존관계 주입이 끝나면 호출이 됨
    @PostConstruct
    public void init(){
        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("초기화 연결 메세지");
    }

    // 빈이 종료 될때 호출이 됨
    @PreDestroy
    public void close(){
        System.out.println("NetworkClient.destroy");
        disconnect();
    }
}
