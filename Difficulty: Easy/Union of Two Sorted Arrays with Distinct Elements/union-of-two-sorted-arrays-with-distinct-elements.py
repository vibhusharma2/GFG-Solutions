#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3
class Solution:
    # Function to return a list containing the union of the two arrays.
    def findUnion(self, a, b):
        # Initialize pointers for both arrays
        i = 0  # Pointer for array 'a'
        j = 0  # Pointer for array 'b'
        
        # Get the lengths of both arrays
        n = len(a)
        m = len(b)
        
        # Initialize an empty list to store the union
        union = []
        
        # Traverse both arrays until we reach the end of one
        while i < n and j < m:
            # If current elements are equal
            if a[i] == b[j]:
                # Add the element to the union if it's not a duplicate
                if len(union) == 0 or union[-1] != a[i]:
                    union.append(a[i])
                # Move both pointers forward
                i += 1
                j += 1
            # If element in 'a' is smaller
            elif a[i] < b[j]:
                # Add the element to the union if it's not a duplicate
                if len(union) == 0 or union[-1] != a[i]:
                    union.append(a[i])
                # Move pointer 'i' forward
                i += 1
            # If element in 'b' is smaller
            else:
                # Add the element to the union if it's not a duplicate
                if len(union) == 0 or union[-1] != b[j]:
                    union.append(b[j])
                # Move pointer 'j' forward
                j += 1
        
        # If there are remaining elements in 'a', add them to the union
        while i < n:
            if len(union) == 0 or union[-1] != a[i]:
                union.append(a[i])
            i += 1
        
        # If there are remaining elements in 'b', add them to the union
        while j < m:
            if len(union) == 0 or union[-1] != b[j]:
                union.append(b[j])
            j += 1
        
        # Return the union list
        return union

#{ 
 # Driver Code Starts.
if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        a = list(map(int, input().strip().split()))
        b = list(map(int, input().strip().split()))
        ob = Solution()
        li = ob.findUnion(a, b)
        for val in li:
            print(val, end=' ')
        print()
        print("~")
# } Driver Code Ends