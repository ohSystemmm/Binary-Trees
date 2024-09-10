package main

import "fmt"

type BinarySearchTree struct {
	root *Node
}

func (tree *BinarySearchTree) Insert(data int) {
	tree.root = tree.insertHelper(tree.root, data)
}

func (tree *BinarySearchTree) insertHelper(root *Node, data int) *Node {
	if root == nil {
		root = &Node{data: data}
		return root
	} else if root.data > data {
		root.left = tree.insertHelper(root.left, data)
	} else {
		root.right = tree.insertHelper(root.right, data)
	}
	return root
}

func (tree *BinarySearchTree) Display() {
	tree.displayHelper(tree.root)
}

func (tree *BinarySearchTree) displayHelper(root *Node) {
	if root == nil {
		return
	}
	tree.displayHelper(root.left)
	fmt.Println(root.data)
	tree.displayHelper(root.right)
}
