package com.example.demo.factory;

import com.example.demo.builder.Viewer;
import com.example.demo.model.ViewerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://kurular4.medium.com/spring-boot-implementing-factory-pattern-45796f31f36c
@Component
public class ViewerFactory {
    private final Map<ViewerType, Viewer> viewerMap;

    @Autowired
    private ViewerFactory(List<Viewer> viewers) {
        viewerMap =    viewers.stream().collect(Collectors.toUnmodifiableMap(Viewer::getType, Function.identity()));
    }

    public Viewer getViewer(ViewerType viewerType) {
        return   Optional.ofNullable(viewerMap.get(viewerType)).orElseThrow(IllegalArgumentException::new);
    }
}
