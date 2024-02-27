package com.infoys.test.util;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerTaskExecutor implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("第一道測試題的運行如下：");
        InfoysTestOne.printChar("aabcccbbad");
        System.out.println("第二道測試題的運行如下：");
        InfoysTestTwo.printChar("abcccbad");
    }
}
