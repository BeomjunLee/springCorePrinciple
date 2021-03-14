package practice.springCorePrinciple;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //여기 패키지부터 하위 패키지 까지 스캔
        basePackages = "practice.springCorePrinciple",

        //기존의 코드중 @Configuration 는 제외
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {


}
