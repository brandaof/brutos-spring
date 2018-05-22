
package org.brandao.examples.spring;

import org.brandao.brutos.annotation.Action;
import org.brandao.brutos.annotation.View;
import org.springframework.stereotype.Component;

@Component
@Action(value="/", view=@View("spring/view"))
public class IndexController {

}