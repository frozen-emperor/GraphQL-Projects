package com.parking.app.valet;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class ValetManager {

    public List<Valet> getAllValets(){
        return Arrays.asList(
                new Valet(UUID.randomUUID(),
                        "valet-1",
                        "Bandra",
                        30,
                        Collections.emptyList()),

                new Valet(UUID.randomUUID(),
                        "valet-2",
                        "Virar",
                        40,
                        Collections.emptyList()),

                new Valet(UUID.randomUUID(),
                        "valet-1",
                        "Vashi",
                        20,
                        Collections.emptyList())
        );
    }
}
