package ba.edu.ibu.ds.week2;

public class NodeV3<Item> {
	private Item value;
	private NodeV3<Item> next;

	public Item getValue() {
		return value;
	}

	public void setValue(Item value) {
		this.value = value;
	}

	public NodeV3<Item> getNext() {
		return next;
	}

	public void setNext(NodeV3<Item> next) {
		this.next = next;
	}
}
