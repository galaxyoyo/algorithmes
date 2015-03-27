package galaxyoyo.algorithmes.models;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

@SuppressWarnings("serial")
public class CodeTreeCellRenderer extends DefaultTreeCellRenderer
{
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus)
	{
		super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
		if (!node.isLeaf() || node instanceof VarsNode)
		{
			setIcon(new ImageIcon(getClass().getResource("/images/treeview-branch-" + (expanded ? "open" : "closed") + ".png")));
		}
		else if (!node.isRoot())
		{
			int max = node.getParent().getChildCount() - 1;
			int index = node.getParent().getIndex(node);
			setIcon(new ImageIcon(getClass().getResource("/images/treeview-branch-" + (index < max ? "more" : "end") + ".png")));
		}
		else
		{
			setIcon(new ImageIcon(getClass().getResource("/images/modifier.png")));
		}
		return this;
	}
}
