/**
 * 
 */
package forsyde.application.moc.sdf;

import java.util.function.Function;

import forsyde.application.moc.Signal;

/**
 * @author rjordao
 *
 */
public class SDFComb<I, O> extends SDFProcess<I, O> {
	
	Function<I, O> combinator;
	

	@Override
	public Function<SDFSignal<I>, SDFSignal<O>> getFunction() {
		
	}


}
