/*
 *  Copyright (c) 2007 Mockito contributors
 *  This program is made available under the terms of the MIT License.
 */
package org.powermock.api.mockito.repackaged.cglib.proxy;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Map methods of subclasses generated by {@link Enhancer} to a particular
 * callback. The type of the callbacks chosen for each method affects
 * the bytecode generated for that method in the subclass, and cannot
 * change for the life of the class.
 */
public interface CallbackFilter {
    /**
     * Map a method to a callback.
     *
     * @param method the intercepted method
     * @param allMethods all the methods found on the instance. Don't mess with the contents of this list!!!
     * @return the index into the array of callbacks (as specified by {@link Enhancer#setCallbacks}) to use for the method,
     */
    int accept(Method method, List<Method> allMethods);

    /**
     * The {@code CallbackFilter} in use affects which cached class
     * the {@code Enhancer} will use, so this is a reminder that
     * you should correctly implement {@code equals} and
     * {@code hashCode} for custom {@code CallbackFilter}
     * implementations in order to improve performance.
    */
    boolean equals(Object o);
}