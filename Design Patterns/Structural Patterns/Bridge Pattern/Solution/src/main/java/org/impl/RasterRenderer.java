package org.impl;

import org.interfaces.Renderer;

public class RasterRenderer implements Renderer {
    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
}