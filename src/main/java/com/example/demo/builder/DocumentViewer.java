package com.example.demo.builder;

import com.example.demo.model.Document;
import com.example.demo.model.ViewerType;
import org.springframework.stereotype.Component;

@Component
public class DocumentViewer implements Viewer<Document> {
    private static final ViewerType VIEWER_TYPE = ViewerType.DOCUMENT;
    @Override
    public ViewerType getType() {
        return VIEWER_TYPE;
    }

    @Override
    public void view(Document object) {
        // some logic to view image,
        // we do not care the implementation here
    }
}
