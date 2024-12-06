package org.interfaces;

import org.args.PropertyChangedEventArgs;

public interface Observer<T> {
    void handle(PropertyChangedEventArgs<T> args);
}
