package BehaviouralPatterns;

interface Iterator{
	public boolean hasNext();
	public Object next();
}

class NameIterator implements Iterator{
	
	private String[] names;
	private int index;
	

	public NameIterator(String[] names) {
		super();
		this.names = names;
	}

	@Override
	public boolean hasNext() {
		return index < this.names.length;
	}

	@Override
	public Object next() {
		if(hasNext())
			return this.names[index++];
		return null;
	}
	
}

class NameRepository{
	private String names[]= {"jk","johny","justing","amanda"};
	
	public Iterator iterator() {
		return new NameIterator(names);
	}
}

public class IteratorPattern {
	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		Iterator nameIterator = nameRepository.iterator();
		while(nameIterator.hasNext())
			System.out.println(nameIterator.next());
	}
}
