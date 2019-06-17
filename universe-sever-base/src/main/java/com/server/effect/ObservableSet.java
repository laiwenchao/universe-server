package com.server.effect;

import com.server.effect.domain.SetObservable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/5/9 下午6:31
 */
public class ObservableSet extends ForwardingSet<String> {
    public ObservableSet(Set<String> set) {
        super(set);
    }

    private final List<SetObservable> list = new ArrayList<SetObservable>();

}
