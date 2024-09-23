package com.example.dynamicbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamicBeanRegistrar implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry)
            throws BeansException {
        // Define CustomService bean
        BeanDefinitionBuilder beanDefinitionBuilder =
                BeanDefinitionBuilder.genericBeanDefinition(CustomService.class);
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        registry.registerBeanDefinition("customService", beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
            throws BeansException {
        // No further processing required for this example
    }
}
