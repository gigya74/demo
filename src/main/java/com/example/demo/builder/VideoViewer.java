package com.example.demo.builder;

import com.example.demo.model.Video;
import com.example.demo.model.ViewerType;
import org.springframework.stereotype.Component;

@Component
public class VideoViewer implements Viewer<Video> {
    private static final ViewerType VIEWER_TYPE = ViewerType.VIDEO;
    @Override
    public ViewerType getType() {
        return VIEWER_TYPE;
    }

    @Override
    public void view(Video object) {
        // some logic to view image,
        // we do not care the implementation here
    }
}
