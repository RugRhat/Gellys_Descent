import java.io.*;
import java.util.*;

public class Node {
    String label;
	LinkedList<Node> children;

	public Node(String label){
		this.label = label;
	}

	public void addChild(Node n){
		if(children == null)
			children = new LinkedList<Node>();
		children.add(n);
	}

	// Couldn't figure out how to make and traverse linked list of variable size
	// So list is limited to seven slots (including head).

	public class LinkedList<Node> {

		Node one = null; Node two = null; Node three = null;
		Node four = null; Node five = null; Node six = null; Node seven = null;

		private void add(Node n){
			if(one == null){
				one = n;
			} else if(two == null){
                                two = n;
                        } else if(three == null){
                                three = n;
                        } else if(four == null){
                                four = n;
                        } else if(five == null){
                                five = n;
                        } else if(six == null){
                                six = n;
                        } else{
				seven = n;
			}
		}
	}
}
