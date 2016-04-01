package org.cdp.telegraph.facade.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mykhaylo_Hrytsiv on 4/1/2016.
 */
@Service
@Scope(value = "prototype")
@Transactional(readOnly = true, rollbackFor = RuntimeException.class)
public @interface Facade {
}
