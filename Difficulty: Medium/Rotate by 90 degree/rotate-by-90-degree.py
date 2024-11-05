#User function Template for python3

def rotate(mat): 
    #code here
    c=[[0]*len(mat[0]) for _ in range(len(mat))]
    s1=len(mat)
    s2=len(mat[0])
    for i in range(s1):
        for j in range(s2):
            c[i][j]=mat[s2-j-1][i]
    for i in range(s1):
        for j in range(s2):
            mat[i][j]=c[i][j]
    return mat
#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        matrix = []
        for i in range(N):
            arr = [int(x) for x in input().strip().split()]
            matrix.append(arr)

        rotate(matrix)
        for i in range(N):
            for j in range(N):
                print(matrix[i][j], end=' ')
            print()
        print("~")

# } Driver Code Ends