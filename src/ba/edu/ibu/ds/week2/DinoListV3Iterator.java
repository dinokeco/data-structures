package ba.edu.ibu.ds.week2;

import java.util.Iterator;

public class DinoListV3Iterator<Item> implements Iterator<Item>{

	private NodeV3<Item> current;
	
	public DinoListV3Iterator(DinoListV3<Item> list) {
		this.current = list.getFirst();
	}
	
	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public Item next() {
		Item value = current.getValue();
		current = current.getNext();
		return value;
	}

}
