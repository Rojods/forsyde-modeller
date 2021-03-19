/**
 * 
 */
package forsyde.application.moc.sdf;

import java.util.stream.Stream;

import org.javatuples.Tuple;

import forsyde.application.moc.Signal;

/**
 * @author rjordao
 *
 */
public final class SDFSignal<V> extends Signal<Integer, V> {

	/**
	 * If given only the valueStream, generate all naturals as tags.
	 * 
	 * @param valueStream
	 * @param tagStream
	 */
	public SDFSignal(Stream<V> valueStream) {
		super(valueStream, Stream.iterate(0, i -> i + 1));
	}	
	
		
	
}
