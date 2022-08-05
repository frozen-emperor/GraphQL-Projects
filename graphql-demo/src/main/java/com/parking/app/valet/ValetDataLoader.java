package com.parking.app.valet;

import com.parking.app.valet.repository.ValetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ValetDataLoader implements ApplicationRunner {

    private ValetRepository valetRepository;

    @Autowired
    public ValetDataLoader(ValetRepository valetRepository) {
        this.valetRepository = valetRepository;
    }

    public void run(ApplicationArguments args) {
//        userRepository.save(new User("lala", "lala", "lala"));
        log.info("data loader");
    }
}
