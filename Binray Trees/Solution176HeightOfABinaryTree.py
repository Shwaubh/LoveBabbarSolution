class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class Solution:
    #Function to find the height of a binary tree.
    def height(self, root):
        if root is None:
            return 0
        return 1 + max(self.height(root.left), self.height(root.right))
