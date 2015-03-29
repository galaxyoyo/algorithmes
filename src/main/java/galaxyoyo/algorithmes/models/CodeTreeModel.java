package galaxyoyo.algorithmes.models;

import galaxyoyo.algorithmes.funcs.VarList;
import galaxyoyo.algorithmes.funcs.VarList.VarListListener;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

@SuppressWarnings("serial")
public class CodeTreeModel extends DefaultTreeModel implements VarListListener
{
	public CodeTreeModel(DefaultMutableTreeNode root)
	{
		this (root, true);
	} 
	public CodeTreeModel(DefaultMutableTreeNode root, boolean asksAllowsChildren)
	{
		super (root, asksAllowsChildren);
		root.add(new VarsNode());
		VarList.getList().addVarListListener(this);
	}
	@Override
	public void onVarListChanged()
	{
		new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				reload(CodeTreeModel.this.root.getChildAt(0));
			}
		}).start();
	}
}
