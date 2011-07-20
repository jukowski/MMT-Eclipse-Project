package info.kwarc.mmt.api.wrappers;

import scala.collection.JavaConverters$;
import scala.collection.Seq;
import scala.collection.immutable.List;
import scala.collection.Set;
import scalaj.collection.j2s.ListWrapper;


public class Utils {
	public static <E> List<E> ListJava2Scala(java.util.List<E> list) {
		ListWrapper<E> wrapper = new ListWrapper<E>(list);
		return wrapper.toSeq().toList();
	}
	
	public static <E> Seq<E> SeqJava2Scala(java.util.List<E> list) {
		ListWrapper<E> wrapper = new ListWrapper<E>(list);
		return wrapper.toSeq();
	}
	
	public static <E> java.util.List<E> ListScala2Java(List<E> list) {
		return JavaConverters$.MODULE$.asJavaListConverter(list).asJava();
		
	}

	public static <E> java.util.Set<E> SetScala2Java(Set<E> list) {
		return JavaConverters$.MODULE$.asJavaSetConverter(list).asJava();
	}

}
