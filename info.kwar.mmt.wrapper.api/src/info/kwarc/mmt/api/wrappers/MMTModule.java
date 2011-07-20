package info.kwarc.mmt.api.wrappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import info.kwarc.mmt.api.Content;
import info.kwarc.mmt.api.LocalName;
import info.kwarc.mmt.api.frontend.Controller;
import info.kwarc.mmt.api.libraries.Completion;
import info.kwarc.mmt.api.libraries.Names$;
import info.kwarc.mmt.api.objects.OMMOD;

import info.kwarc.mmt.api.wrappers.Utils;

public class MMTModule {

	OMMOD module;
	Controller controller;
	
	public MMTModule(OMMOD module, Controller controller) {
		this.controller = controller;
		this.module = module;
	}
	
	public List<MMTCompletion> getSymbols(String prefix) {
		ArrayList<String> str = new ArrayList<String>();
		str.add(prefix);
		List<Completion> comps = Utils.ListScala2Java(Names$.MODULE$.resolve(module, Utils.ListJava2Scala(str), controller.library()));
		ArrayList<MMTCompletion> result = new ArrayList<MMTCompletion>();
		for (Completion c : comps) {
			MMTCompletion comp = new MMTCompletion();
			comp.setTop(c.parent().toPath(false));
			Set<LocalName> names = Utils.SetScala2Java(c.completions());
			for (LocalName name: names) {
				comp.getChildren().add(name.toString());
			}
			result.add(comp);
		}
		return result;
	}
}
