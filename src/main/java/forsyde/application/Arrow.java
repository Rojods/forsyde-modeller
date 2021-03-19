/**
 * 
 */
package forsyde.application;

import java.util.List;
import java.util.function.Function;

import org.jgrapht.Graphs;

import forsyde.io.java.core.ForSyDeModel;
import forsyde.io.java.core.Vertex;
import forsyde.io.java.types.vertex.Signal;

/**
 * @author rjordao
 *
 */
public class Arrow<I, O> {
	
	ForSyDeModel representation;
	List<Vertex> inVertexes;
	List<Vertex> outVertexes;
	Function<I, O> function;
	
	public<Oafter> Arrow<I, Oafter> arrowIn(Arrow<O, Oafter> after) {
		int i, j;
		Arrow<I, Oafter> composed = new Arrow<I, Oafter>();
		composed.function = function.andThen(after.function);
		composed.representation = new ForSyDeModel();
		Graphs.addGraph(composed.representation, representation);
		Graphs.addGraph(composed.representation, after.representation);
		for (i = 0; i < outVertexes.size(); i++) {
			Vertex out = outVertexes.get(i);
			Vertex in = after.inVertexes.get(i);
			for(j = 0; j < out.ports.size(); j++) {
				
			}
		}
		composed.inVertexes = inVertexes;
		composed.outVertexes = after.outVertexes;
		return composed;
	}

}
