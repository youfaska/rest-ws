package com.fr.ws;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HeroController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hero")
    public Hero getHero(@RequestParam(value="name", defaultValue="World") String name) {
        return new Hero(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/hero/list")
    public Collection<Hero> getAllHeros() {
        List<Hero> heroList = new ArrayList<Hero>();
        
        for (int i = 0 ; i<=10 ; i++){
         heroList.add(new Hero(counter.incrementAndGet(), (String)("name --> " +i) ));
        }
        
        return heroList;
    }

}
