package ru.job4j.di;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import ru.job4j.di.model.StartUI;
import ru.job4j.di.model.Store;

public class BeanFactoryDI {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanDefinition storeDefinition = BeanDefinitionBuilder.rootBeanDefinition(Store.class).getBeanDefinition();
        BeanDefinition uiDefinition = BeanDefinitionBuilder.rootBeanDefinition(StartUI.class).getBeanDefinition();
        defaultListableBeanFactory.registerBeanDefinition("store", storeDefinition);
        defaultListableBeanFactory.registerBeanDefinition("ui", uiDefinition);
        StartUI ui = defaultListableBeanFactory.createBean(StartUI.class);
        ui.add("Egor Yakushev");
        ui.add("Ivan Ivanov");
        ui.print();
    }
}
