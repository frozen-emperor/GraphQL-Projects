package com.parking.app.valet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Controller
@Slf4j
public class ValetController {

    @Autowired
    private ValetManager valetManager;

    @QueryMapping("valets")
    public CompletableFuture<List<Valet>> valets(){
        log.info("Query valets executed");
        return CompletableFuture.supplyAsync(()->{
            return valetManager.getAllValets();
        });
    }
}
