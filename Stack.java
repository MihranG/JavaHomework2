import java.util.Arrays;

class Stack {
	private int[] stackArray = new int[5];
	private int stackTop = 0;
	private Boolean isEmpty = true;

	void push(int element) {
		if (isEmpty == true) {
			isEmpty = false;
		}
		stackArray[stackTop] = element;
		if (stackTop < stackArray.length-1) {
			stackTop = stackTop + 1;
		}

	}

	int pop() {
		if (isEmpty == false) {
			stackTop = stackTop - 1;
		}
		if (stackTop == 0) {
			isEmpty = true;
		}
		return stackArray[stackTop];
	}

	int peek() {
		return stackArray[stackTop];
	}

	@Override
	public String toString() {
		return Arrays.toString(stackArray);
	}
}