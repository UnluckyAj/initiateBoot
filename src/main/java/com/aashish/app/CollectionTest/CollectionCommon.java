package com.aashish.app.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionCommon {
    public <T> Collection getCollectionFromIterable(Iterable<T> it) {
        Collection cln = new ArrayList<T>();

        it.forEach(cln::add);

        return cln;
    }
}
