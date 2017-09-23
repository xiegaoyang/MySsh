package com.xgy.myssh.service.impl;

import com.xgy.myssh.service.MiscService;
import org.springframework.stereotype.Service;

/**
 * Created by hadoop on 2017/9/22.
 */

@Service
public class MiscServiceImpl implements MiscService {
    @Override
    public void output() {
        System.out.println("Hello World");
    }
}
