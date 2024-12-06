package org.modules;

import com.google.inject.AbstractModule;
import org.impl.VectorRenderer;
import org.interfaces.Renderer;

public class ShapeModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(Renderer.class).to(VectorRenderer.class);
    }
}
