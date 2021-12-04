# Solved Diamter of a Binary Tree

class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None

ans = 0
def diameter(root):
    global ans
    if root is None:
        return 0
    x = diameter(root.left)
    y = diameter(root.right)
    ans = max(ans, x+y+1)
    return (max(x, y) + 1)

node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(4)
node5 = Node(5)
node6 = Node(6)
node7 = Node(7)

node1.left = node2
node1.right = node3
node2.left = node7
node2.right = node4
node4.right = node5
node5.right = node6

diameter(node1)
print(ans)
