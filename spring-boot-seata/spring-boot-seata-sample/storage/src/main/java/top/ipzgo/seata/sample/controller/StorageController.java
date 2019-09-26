package top.ipzgo.seata.sample.controller;

import top.ipzgo.seata.sample.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jimin.jm@alibaba-inc.com
 * @date 2019/06/14
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @RequestMapping(value = "/deduct", produces = "application/json")
    public Boolean deduct(String commodityCode, Integer count) {
        storageService.deduct(commodityCode, count);
        return true;
    }
}
