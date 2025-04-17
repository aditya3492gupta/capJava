package dataStructure;

public class BrowserLogic {
	BrowserStack undoStack = new BrowserStack();
	BrowserStack redoStack = new BrowserStack();

	public void visit(String data) {
		int size = redoStack.getSize();
		if (size != 0) {
			while(size>0) {
				redoStack.pop();
				size--;
			}
		}
		undoStack.push(data);
	}

	public void back() {
		redoStack.push(undoStack.pop());
	}

	public void print() {
		System.out.println(undoStack.peek());
	}

	public void forward() {

		undoStack.push(redoStack.pop());
	}
}
