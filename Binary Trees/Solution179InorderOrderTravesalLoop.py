# Solution 179 Inorder using Loop and Recursion

class Node:
    def __init__(self, value):
        self.data = value
        self.left = None
        self.right = None
        
    def __str__(self):
        return str(self.data)
    
def inorderR(root):
    if root is None:
        return
    inorderR(root.left)
    print(root.data, end=' ')
    inorderR(root.right)
        
def inorderL(root):
    st = []
    current = root
    while True:
        if current is not None:
            st.append(current)
            current = current.left
        elif st:
            temp = st.pop()
            print(temp.data, end=' ')
            current = temp.right
            del temp
        else:
            break
    
node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(4)
node5 = Node(5)

node1.left = node2
node1.right = node3
node2.left = node4
node2.right = node5

inorderL(node1)
inorderR(node1)
