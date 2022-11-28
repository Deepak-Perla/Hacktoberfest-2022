// CPP program to print Zig-Zag traversal
// in groups of size 2.
#include <iostream>
#include <queue>
#include <stack>
using namespace std;

// A Binary Tree Node
struct Node
{
	struct Node* left;
	int data;
	struct Node* right;
};

/* Function to print the level order of
given binary tree. Direction of printing
level order traversal of binary tree changes
after every two levels */
void modifiedLevelOrder(struct Node* node)
{
	// For null root
	if (node == NULL)
		return;

	if (node->left == NULL &&
					node->right == NULL)
	{
		cout << node->data;
		return;
	}

	// Maintain a queue for normal
	// level order traversal
	queue<Node*> myQueue;

	/* Maintain a stack for printing nodes in reverse
	order after they are popped out from queue.*/
	stack<Node*> myStack;

	struct Node* temp = NULL;

	// sz is used for storing the count
	// of nodes in a level
	int sz;

	// Used for changing the direction
	// of level order traversal
	int ct = 0;

	// Used for changing the direction
	// of level order traversal
	bool rightToLeft = false;

	// Push root node to the queue
	myQueue.push(node);

	// Run this while loop till queue got empty
	while (!myQueue.empty())
	{
		ct++;

		sz = myQueue.size();

		// Do a normal level order traversal
		for (int i = 0; i < sz; i++)
		{
			temp = myQueue.front();
			myQueue.pop();

			/*For printing nodes from left to right,
			simply print the nodes in the order in which
			they are being popped out from the queue.*/
			if (rightToLeft == false)
				cout << temp->data << " ";		

			/* For printing nodes
			from right to left,
			push the nodes to stack
			instead of printing them.*/
			else
				myStack.push(temp);		

			if (temp->left)
				myQueue.push(temp->left);

			if (temp->right)
				myQueue.push(temp->right);
		}

		if (rightToLeft == true)
		{

			// for printing the nodes in order
			// from right to left
			while (!myStack.empty())
			{
				temp = myStack.top();
				myStack.pop();

				cout << temp->data << " ";
			}
		}

		/*Change the direction of printing
		nodes after every two levels.*/
		if (ct == 2)
		{
			rightToLeft = !rightToLeft;
			ct = 0;
		}

		cout << "\n";
	}
}

// Utility function to create a new tree node
Node* newNode(int data)
{
	Node* temp = new Node;
	temp->data = data;
	temp->left = temp->right = NULL;
	return temp;
}

// Driver program to test above functions
int main()
{
	// Let us create binary tree
	Node* root = newNode(1);
	root->left = newNode(2);
	root->right = newNode(3);
	root->left->left = newNode(4);
	root->left->right = newNode(5);
	root->right->left = newNode(6);
	root->right->right = newNode(7);
	root->left->left->left = newNode(8);
	root->left->left->right = newNode(9);
	root->left->right->left = newNode(3);
	root->left->right->right = newNode(1);
	root->right->left->left = newNode(4);
	root->right->left->right = newNode(2);
	root->right->right->left = newNode(7);
	root->right->right->right = newNode(2);
	root->left->right->left->left = newNode(16);
	root->left->right->left->right = newNode(17);
	root->right->left->right->left = newNode(18);
	root->right->right->left->right = newNode(19);

	modifiedLevelOrder(root);

	return 0;
}
