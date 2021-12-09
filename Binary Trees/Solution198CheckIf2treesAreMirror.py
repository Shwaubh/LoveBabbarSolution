from collections import defaultdict

class Solution:
    def checkMirrorTree(self, n, e, A, B):
        tree1 = defaultdict(list)
        tree2 = defaultdict(list)
        for i in range(0, 2*e, 2):
            tree1[A[i]].append(A[i+1])
            tree2[B[i]].append(B[i+1])
        ans = True
        if not any(tree1.keys() - tree2.keys()):
            for i in tree1.keys():
                dataA = tree1[i]
                dataB = tree2[i][::-1]
                if not dataA == dataB:
                    ans = False
                    return ans
        else:
            return not ans
        return ans

sol = Solution()
print(sol.checkMirrorTree(3, 2, [1, 2, 1, 3], [1, 3, 1, 2]))
