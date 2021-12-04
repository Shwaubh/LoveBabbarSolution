class Solution:
    def levelOrder(self, root):
        # ans = []
        que = []
        if root is None:
            return
        que.append(root)
        while len(que) > 0:
            data = que.pop(0)
            if data.left:
                que.append(data.left)
            if data.right:
                que.append(data.right)
            print(data.data, end=' ')
            # Solution.ans.append(data.data)
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None

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
sol.levelOrder(node1)
print(sol.ans)
