package com.stack;

public interface StackI {
	
	public abstract void push(int data);
	public abstract int pop() throws Exception;
	public abstract int peek() throws Exception;
	public abstract boolean empty() throws Exception;
	public abstract int search(int value);
	
	

}
