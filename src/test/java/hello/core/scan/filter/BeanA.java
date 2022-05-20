package hello.core.scan.filter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.Filter;

@ComponentScan(
        includeFilters = {
                @Filter(type = FilterType.ANNOTATION, classes =
                        MyIncludeComponent.class),
        },
        excludeFilters = {
                @Filter(type = FilterType.ANNOTATION, classes =
                        MyExcludeComponent.class),
                @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = BeanA.class)
        }
)
@MyIncludeComponent
public class BeanA {
}
