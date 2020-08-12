package com.crb.ocms.canal.client.example;

import com.crb.ocms.canal.client.annotation.CanalTable;
import com.crb.ocms.canal.client.handler.EntryHandler;
import com.crb.ocms.canal.client.model.po.Test;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@CanalTable(value = "test")
public class TestEntryHandler implements EntryHandler<Test> {
    @Override
    public void insert(Test map) {
        log.info("insert message  {}", map);
    }

    @Override
    public void update(Test before, Test after) {
        log.info("update before {} ", before);
        log.info("update after {}", after);
    }

    @Override
    public void delete(Test map) {
        log.info("delete  {}", map);
    }
}
