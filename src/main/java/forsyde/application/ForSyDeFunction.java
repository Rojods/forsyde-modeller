/**
 * 
 */
package forsyde.application;

/**
 * @author rjordao
 *
 */
public interface ForSyDeFunction<I, O> {
	
	public O apply(I input);

}
