package com.example.dynamicbean2;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(
            AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // Register ServiceA
        BeanDefinitionBuilder beanDefinitionBuilderA =
                BeanDefinitionBuilder.genericBeanDefinition(ServiceA.class);
        registry.registerBeanDefinition("serviceA", beanDefinitionBuilderA.getBeanDefinition());

        // Register ServiceB
        BeanDefinitionBuilder beanDefinitionBuilderB =
                BeanDefinitionBuilder.genericBeanDefinition(ServiceB.class);
        registry.registerBeanDefinition("serviceB", beanDefinitionBuilderB.getBeanDefinition());
    }
}
