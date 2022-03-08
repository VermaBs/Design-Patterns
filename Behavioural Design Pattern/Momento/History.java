package MementoPattern;

import java.util.Stack;

public class History {
	Stack<EditorState> states = new Stack<>();
	public void save(EditorState state) {
        states.push(state);
    }
    public void revert(Editor editor) {
        if (!states.isEmpty())
            editor.restore(states.pop());
        else
            System.out.println("Cannot undo !");
    }

}
