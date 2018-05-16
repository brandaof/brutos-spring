
package org.brandao.examples.spring;

import org.brandao.brutos.annotation.Action;
import org.brandao.brutos.annotation.View;
import org.springframework.stereotype.Component;

@Action(value="/", view=@View("view"))
@Component
public class IndexController {

}
