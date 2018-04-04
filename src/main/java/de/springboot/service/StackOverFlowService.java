package de.springboot.service;

import de.springboot.model.StackOverFlowWebSite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author OGI aka nOy39
 *
 * @Date 03.04.2018
 * @Time 22:27
 */
@Service
public class StackOverFlowService {

    private static List<StackOverFlowWebSite> items = new ArrayList<>();
    static {
        items.add(new StackOverFlowWebSite("Stack Overflow","https://stackoverflow.com/",
                "https://cdn.sstatic.net/Sites/stackoverflow/img/apple-touch-icon.png",
                "Stack OverFlow (Stack Exchange","Q&A for professional and enthusiast programmers"));
        items.add(new StackOverFlowWebSite("mathematics","https://math.stackexchange.com/",
                "https://cdn.sstatic.net/Sites/math/img/apple-touch-icon.png",
                "Stack OverFlow (Stack Exchange)","Q&A for people studying math at any level and professionals in related fields"));
        items.add((new StackOverFlowWebSite("Server Fault","https://serverfault.com/",
                "https://cdn.sstatic.net/Sites/serverfault/img/apple-touch-icon.png","Stack OverFlow (Stack Exchange)",
                "Q&A for system and network administrators")));
        items.add((new StackOverFlowWebSite("Ask Ubuntu","https://askubuntu.com/",
                "https://cdn.sstatic.net/Sites/askubuntu/img/apple-touch-icon.png","Stack OverFlow (Stack Exchange)",
                "Q&A for Ubuntu users and developers")));
    }

    public List<StackOverFlowWebSite> findAll() {

        return items;
    }
}
