package allprogram.backup;

import java.util.Arrays;

public class stackExmaple<T> {
	private int pointer=0;
	private Object[] elements;
	private int intial_size=10;
	
	public stackExmaple(){
		elements=new Object[intial_size];
	}
	//pop
	public T pop(){
		T t=(T)elements[--pointer];
		elements[pointer]=null;
		return t;
	}
	//push
	public int size(){
		return pointer;
	}
	public void push(T pushelement){
		if (pointer == elements.length) {
			expandSize();
		}
		elements[pointer++]=pushelement;
	}
	private void expandSize() {
		int increasedSize = elements.length * 2;
		
		elements = Arrays.copyOf(elements, increasedSize);
	}
	public static void main(String args[]) {
		System.out.println("Stack using Array");
	        System.out.println("----------------------------");
	
	        stackExmaple<String> arrayStack = new stackExmaple<String>();
		System.out.println("Initial Stack size : "+arrayStack.size());
		arrayStack.push("Element One");
		arrayStack.push("Element Two");
		System.out.println("Stack size after push : "+arrayStack.size());
		System.out.println("Topmost element : "+arrayStack.pop());
		System.out.println("Stack size after pop : "+arrayStack.size());
	   }

}
