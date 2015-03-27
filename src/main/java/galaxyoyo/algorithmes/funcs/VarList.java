package galaxyoyo.algorithmes.funcs;

import galaxyoyo.algorithmes.frames.MainFrame;
import galaxyoyo.algorithmes.funcs.VarList.Var;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@SuppressWarnings("serial")
public class VarList extends TreeMap<String, Var<?>>
{
	public static class Var<T>
	{
		private String name;
		private T value;
		
		public Var(String name, T value)
		{
			this.name = name;
			this.value = value;
		}
		
		public String getName()
		{
			return name;
		}
		
		public T getValue()
		{
			return value;
		}
		
		public Class<?> getClazz()
		{
			return value.getClass();
		}
		
		@Override
		public boolean equals(Object o)
		{
			return o instanceof VarList ? getName().equals(((Var<?>) o).getName()) : false;
		}
		
		@Override
		public String toString()
		{
			return "Var" + new Gson().toJson(this);
		}
	}
	
	private static final VarList LIST = new VarList();
	
	private final List<VarListListener> listeners = new ArrayList<VarListListener>();
	
	private VarList()
	{
		super (String.CASE_INSENSITIVE_ORDER);
	}
	
	public void add(Var<?> v)
	{
		put(v.getName(), v);
	}
	
	@Override
	public Var<?> put(String key, Var<?> v)
	{
		if (containsKey(key) || containsValue(v))
		{
			throw new IllegalArgumentException("La variable '" + key + "' existe d\u00e9j\u00e0 !");
		}
		super.put(key, v);
		sendEvent();
		return v;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T get(Object key, TypeToken<T> type)
	{
		return (T) get(key);
	}
	
	@Override
	public Var<?> remove(Object key)
	{
		Var<?> v = super.remove(key);
		sendEvent();
		return v;
	}
	
	@Override
	public void clear()
	{
		super.clear();
		sendEvent();
	}
	
	@Override
	public Object clone()
	{
		throw new IllegalArgumentException(new CloneNotSupportedException());
	}
	
	public void addVarListListener(VarListListener listener)
	{
		listeners.add(listener);
	}
	
	public void removeVarListListener(VarListListener listener)
	{
		listeners.remove(listener);
	}
	
	public void sendEvent()
	{
		for (VarListListener listener : listeners)
		{
			listener.onVarListChanged();
		}
		MainFrame.getInstance().repaint();
	}
	
	public static VarList getList()
	{
		return LIST;
	}
	
	public static interface VarListListener
	{
		public void onVarListChanged();
	}
}
