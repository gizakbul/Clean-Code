package org.impl;

import org.interfaces.Renderer;

public class VectorRenderer implements Renderer {
    @Override
    public String whatToRenderAs() {
        return "lines";
    }
}
