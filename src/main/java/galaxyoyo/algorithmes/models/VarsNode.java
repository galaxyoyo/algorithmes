package galaxyoyo.algorithmes.models;

import galaxyoyo.algorithmes.funcs.VarList;
import galaxyoyo.algorithmes.funcs.VarList.Var;
import galaxyoyo.algorithmes.funcs.VarList.VarListListener;

import javax.swing.tree.DefaultMutableTreeNode;

import com.google.gson.Gson;

@SuppressWarnings("serial")
public class VarsNode extends DefaultMutableTreeNode implements VarListListener
{
	public VarsNode()
	{
		super ("Variables");
		VarList.getList().addVarListListener(this);
	}
	
	@Override
	public void onVarListChanged()
	{
		this.children = null;
		for (Var<?> var : VarList.getList().values())
		{
			DefaultMutableTreeNode node = new DefaultMutableTreeNode("<html><body><strong style=\"color: red\">" + var.getClazz().getSimpleName().replace("Integer", "Int") + "</strong> <em style=\"color: green\">" + var.getName() + "</em> = <span style=\"color: blue\">" + new Gson().toJson(var.getValue()) + "</span></body></html>");
			node.setAllowsChildren(false);
			add(node);
		}
	}
}
