package com.example.demo.builder;

import com.example.demo.model.Image;
import com.example.demo.model.ViewerType;
import org.springframework.stereotype.Component;

@Component
public class ImageViewer implements Viewer<Image> {
    private static final ViewerType VIEWER_TYPE = ViewerType.IMAGE;

    @Override
    public ViewerType getType() {
        return VIEWER_TYPE;
    }

    @Override
    public void view(Image object) {
        // some logic to view image,
        // we do not care the implementation here
    }
}
