# Link to Question -- https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1#

class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class Solution:

    #Function to return the diameter of a Binary Tree.
    def diameter(self,root):
        if root is None:
            return 0
        return max(1 + self.height(root.left) + self.height(root.right), self.diameter(root.left), self.diameter(root.right))

    def height(self, root):
        if root is None:
            return 0
        return 1 + max(self.height(root.left), self.height(root.right))

node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(4)
node5 = Node(5)
node6 = Node(6)
node7 = Node(7)
node8 = Node(8)
node9 = Node(9)
node10 = Node(10)
node11 = Node(11)
node12 = Node(12)
node13 = Node(13)
node14 = Node(14)
node15 = Node(15)

node1.right = node2
node2.right = node3
node1.left = node4
node4.left = node5
node4.right = node6
node5.left = node7
node5.right = node8
node8.left = node9
node9.left = node10
node9.right = node11
node6.right = node12
node12.left = node13
node12.right = node14
node14.right= node15

sol = Solution()

print(Solution().diameter(node1))
# print(sol.height(node1.right))
