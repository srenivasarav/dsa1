package com.stack;

public class StackT implements StackI{
	
	int[] arr = new int[5]; 
	int top = 0;
	
	@Override
	public void push(int data) {
		// TODO Auto-generated method stub
		arr[top] = data;
		top++;
		
	}

	@Override
	public int pop() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Stack Size : "+arr.length);
		if (empty() == true) {
			throw new Exception("Stack is Empty You can't pop the elements");
		}
		top--;
		return arr[top];
	}

	@Override
	public int peek() {
		System.out.println(arr.length);
		return arr[--top];
	}

	@Override
	public boolean empty() {
		if(-1 < arr.length)
			return false;
		System.out.println("Stack is Empty");
		return true;
	}

	@Override
	public int search(int value) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	

}
