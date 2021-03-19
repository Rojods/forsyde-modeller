/**
 * 
 */
package forsyde.application.moc;

import java.util.function.Function;


/**
 * @author rjordao
 *
 */
public interface ForSyDeProcess<T, I, O> extends 
Function<
	Signal<T, I>,
	Signal<T, O>
> {
	
	
}
