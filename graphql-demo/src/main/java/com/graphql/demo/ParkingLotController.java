package com.graphql.demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.concurrent.CompletableFuture;

@Controller
@Slf4j
public class ParkingLotController {

    @QueryMapping("parkingLot")
    public CompletableFuture<String> parkingLot(){
        log.info("Query : parkingLot");
        return CompletableFuture.supplyAsync(()->{
            return "parking lot";
        });
    }
}
