package yshrestha1;

import java.util.Stack;

public class OurStack<T> implements StackInterface<T> 
{
	Stack<T> theStack;
	
	public OurStack()
	{
		theStack = new Stack<>();
	}

	@Override
	public void push(T newEntry)
	{
		theStack.push(newEntry);
	}

	@Override
	public T pop() 
	{
		return theStack.pop();
	}

	@Override
	public T peek() 
	{
		return theStack.peek();
	}

	@Override
	public boolean isEmpty() 
	{
		return theStack.empty();
	}

	@Override
	public void clear() 
	{
		theStack.clear();
	}
}
