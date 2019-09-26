package top.ipzgo.conditional.conditionalonbean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(MyBean1.class)
public class MyBean2 {
}
