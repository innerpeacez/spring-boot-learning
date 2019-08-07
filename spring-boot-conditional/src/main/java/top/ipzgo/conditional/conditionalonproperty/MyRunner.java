package top.ipzgo.conditional.conditionalonproperty;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@ConditionalOnProperty(prefix = "innerpeacez", name = "runner.enabled", matchIfMissing = true, havingValue = "false")
public class MyRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.printf("Hello , @ConditionalOnProperty %s \n", LocalDateTime.now());
    }
}
