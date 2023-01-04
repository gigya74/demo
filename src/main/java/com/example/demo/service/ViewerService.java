package com.example.demo.service;

import com.example.demo.factory.ViewerFactory;
import com.example.demo.model.Document;
import com.example.demo.model.Image;
import com.example.demo.model.Video;
import com.example.demo.model.ViewerType;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class ViewerService {
    private final ViewerFactory viewerFactory;

    public ViewerService(ViewerFactory viewerFactory) {
        this.viewerFactory = viewerFactory;
    }

    public void view(ViewerType viewerType, Object o) {
        viewerFactory.getViewer(viewerType).view(o);
    }

    @PostConstruct
    public void test() {
        view(ViewerType.VIDEO, new Video());
        view(ViewerType.DOCUMENT, new Document());
        view(ViewerType.IMAGE, new Image());
    }
}
