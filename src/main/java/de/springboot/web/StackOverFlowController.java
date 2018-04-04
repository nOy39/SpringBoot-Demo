package de.springboot.web;

import de.springboot.model.StackOverFlowWebSite;
import de.springboot.service.StackOverFlowService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by @author OGI aka nOy39
 *
 * @Date 03.04.2018
 * @Time 22:10
 */

@RestController
@RequestMapping("/api")
public class StackOverFlowController {

    @Autowired
    private StackOverFlowService stackOverFlowService;

    @RequestMapping("/providers")
    public List<StackOverFlowWebSite> getListOfProviders() {
        return stackOverFlowService.findAll();
    }
}
